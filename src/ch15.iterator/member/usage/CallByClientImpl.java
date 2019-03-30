package member.usage;

import java.util.Iterator;

import member.CollectionImpl;
import member.ICollection;
import member.Member;

public class CallByClientImpl implements ICallByClient {

	private ICollection impl;
	private Iterator iterator;

	@Override
	public void addMember(Member member) {
		impl = new CollectionImpl();
		iterator = impl.iterator();
	}

	@Override
	public void removeMember(int index) {
		impl.removeMember(index);
		iterator = impl.iterator();
	}

	@Override
	public Object next() {
		return iterator.next();
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public void remove() {
		iterator.remove();
	}

}
