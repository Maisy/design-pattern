package member.usage;

import member.Member;

public interface ICallByClient {

	public void addMember(Member member);

	public void removeMember(int index);

	public Object next();

	public boolean hasNext();

	public void remove();
}
