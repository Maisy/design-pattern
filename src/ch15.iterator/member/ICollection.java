package member;

import java.util.Iterator;

//ȸ�� ��ü�� �߰�, �������� �����ϴ� api����
//java.util.List�� ���� ����
public interface ICollection {

	public void addMember(Member member);

	public void removeMember(int index);

	public Member[] getAllMembers();

	// ȸ����ü�� ���� ������ ��ȯ
	public Iterator iterator();

}
