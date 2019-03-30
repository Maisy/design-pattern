package member;

import java.sql.*;
import java.util.Iterator;
import java.util.Vector;

public class CollectionImpl implements ICollection {

	private Wrapper wrap;
	private Vector v;
	private Member members[];

	public CollectionImpl() {
		// wrap = Wrapper.getInstance();
		v = new Vector();

		members = getAllMembers();
	}

	@Override
	public void addMember(Member member) {
		v.addElement(member);
		members = getAllMembers(v);
	}

	private Member[] getAllMembers(Vector v) {
		Member mem[] = new Member[v.size()];
		v.copyInto(mem);
		return mem;
	}

	@Override
	public void removeMember(int index) {
		v.remove(index);
		members = getAllMembers(v);
	}

	@Override
	public Member[] getAllMembers() {
		// get data from db
		String query = "select * from member";
		// ...
		Member member = new Member("test id", "test name", "asdf", 1);
		v.addElement(member);
		
		
		Member[] members = getAllMembers(v);
		return members;
	}

	@Override
	public Iterator iterator() {
		return new MyIterator(v.iterator());
	}

}
