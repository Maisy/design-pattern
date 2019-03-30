package member;

import java.util.Iterator;

//회원 객체의 추가, 삭제등을 관장하는 api선언
//java.util.List와 같은 역할
public interface ICollection {

	public void addMember(Member member);

	public void removeMember(int index);

	public Member[] getAllMembers();

	// 회원객체에 대한 열거형 반환
	public Iterator iterator();

}
