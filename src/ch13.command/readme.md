## 명령 (Command)

### 의도
요청 자체를 캡슐화. 서로다른 사용자를 매개변수로 만들고, 요청을 대기시키거나 로깅하거나 undo, redo

### 동기
- 연산을 호출하는애와 연산 수행을 구현한 애를 분리

### 활용
- 수행할 동작을 객체로 매개변수화 하고자 할때. 절차지향에서 callback함수를 객체지향방식으로 한게 이 패턴이다
- 서로다른 시간에 요청을 선언, 저장, 실행.
- 실행 취소 기능을 지원하고 싶을때.
- 시스템이 고장났을때 재적용이 가능하도록 변경 과정에 대한 로깅을 지원하고 싶을때.(load와 store을 정의하여 저장)
- 일련의 과정을 통해 데이터를 변경하고자 할때.


### 구현
- `Macro Command`: Command 여러개를 Composite패턴으로 복합Command를 만들어 사용할수도있다.
- `History List`: undo / redo. 매 작업마다 작업을 수행한 command 클래스 객체를 복제해서 리스트로 저장해서 구현
  - prototype패턴으로 반드시 clone해서 저장해야함.
  - undo redo 반복해서 할경우 완벽하게 이전상태로 안갈 수 있다.(ex. 부동소수점 계산) -> 객체연산으로 수행하는게 아니라 상태값을 그대로 저장하는 형태로 history list를 저장, 관리. = Memento 패턴
- execute() 멤버함수의 인자가 모두 다를경우: 생성자를 통해 미리 생성
```java
// 생성자로 미리 userman, bbs 생성
private void registerCommand() {
    reqCmd = new HashMap<>();
    reqCmd.put(CMD_LOGIN, new LoginCommand(userman));
    reqCmd.put(CMD_BBS_LIST, new ListCommand(bbs));
    reqCmd.put(CMD_BBS_READ, new ReadCommand(bbs));
}

//usage
Request req = new Request();
Command cmd = reqCmd.get(cmdStr);
if (cmd != null) {
    cmd.execute(req);   //request만 같게
} else {
    System.out.println("Not available command " + cmdStr);
}


```
