## 해석자 (Interpreter)

### 의도
간단한 문법에 기반한 검증 및 작업 처리. 간단한 문법에 따라 작업을 수행해야 할 경우 어떤 식으로 설계를 하면 입력되는 자료가 문법 규칙을 만족하는지 검증 + 문법에 따라 수행해야할 작업도 처리
ex. 컴파일러로 입력되는 프로그램

### 활용
- 간단한 문법(복잡하면 parser생성기를 쓰세요..?)

### 참여자
- abstractExpression: RegualrExp. 최상위 인터페이스(match공통 선언)
- terminalExpression: OrExp, AndExp: 문법에 정의한 터미널 기호와 관련된 방법 구현. 모든 기호에 대해서 만들어야해
terminal은 nonterminal로 정의되며 nonterminal의 instance라고 볼 수 있다 클래스와 객체로 표현하면 Nonterminal은 클래스, terminal은 nonterminal로부터 생성되는 객체
- nonterminalExpression: 문법에 나타나는 모든것들에 대한 match()연산을 구현


### 장점
- 문법의 변경. 확장이 쉽다(문법을 변경, 확장할때는 상속)


### 단점
- client가 파싱을 직접 해서 넘겨야해.
- 복잡합 문법은 ㄴㄴ
- 표현식을 해석하는 새로운 방법을 추가할 수 있다

### 관련 패턴
- 추상구문 트리는 `composite`패턴과 유사한 클래스 구조. 차이는 interpreter패터는 주어진 문접을 기준으로 클래스를 정의, composite패턴은 클래스간 구성 관계에 따라 클래스 구조가 정의된다. 따라서 interpreter패턴은 클래스 구성 관계 상 composite패턴의 한 예.
- interpreter 패턴이 적용되었을때 새로운 작업을 추가하려면 각 크래스마다 새로운 맘버함수를 정의해야 하는데
기존의 클래스를 수정하지말고 `visitor`패턴을 사용
cf) @visitor패턴: 수행할 작업의 종류마다 클래스를 생성하고 정의된 클래스의 객체로 하여금 구문 트리의 각 노드를 순회함으로써 작업이 이루어지게 함. 
eX) 간단한 스크립트 프로그래밍 문법 => [스크립트 수행] + 참조하는 파일은 존재하는지? + 입력된 값은 정상인지? ...
- 사용하는 terminal심볼이 많을 경우 한 terminal심볼에 대해 일일이 객체 생성 x -> flyweight패턴으로 동일한 terminal심볼들 간에는 객체 공유

