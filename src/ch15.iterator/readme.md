## 반복자 (Iterator)

### 의도
자료의 구성하는 방법과 자료를 열거하는 부분을 분리시킨다
Aggregate: 자료의 구조를 구성하는작업(java.util.Vector extends java.util.List)
Iterator: 자료를 열거하는 작업(ex. java.util.Iterator). 자료를 구성하는 역할은 포함하면 안돼

### 동기
자료의 구성은 프로그램에 따라 다를수 있으나 열거하는데 필요한 기능은 비슷하다

### 활용
- 여러개 항목이 모인 aggregate 클래스에 대해 내부를 신경안쓰고 항목에 접근하고싶다
- 동일한 aggregate클래스 객체에 다양한 형태의 항목 접근을 지원(Polymorphic Iteration을 지원): factory method패턴으로 iterator객체 생성
- 하나의 객체에 여러개의 iterator instance를 만들어서 여러곳에서 접근할수있다(cursor)


### 활용예제
- python에서 __iter__와 next()를 구현하면 iterator로 사용할수있다. for, while 로 사용할 수있다. list 로 사용하면 모두 메모리에 한번에 올려놓고 쓰는데 iterable하게 구현해놓으면 iterator로 사용하면서 cursor만 갖고있어서 가볍게 사용할 수 있다. 그래서 백만건 같은거 돌릴때는 항상 iterable하게 구현해야한다.
    - generator의 yield를 사용하면 메모리를 절약할수있따.
    - python에서 제공하는 zip, map같은걸 사용할수있다.


### 구현 
*누가 접근을 제어할것인가?*
1) External iterator: client가 항목에 대한 접근 수행. client가 항목을 순차적으로 가져와서 원하는 작업을 수행
2) internal iterator: 자체적으로 각 항목을 순차적으로 접근해서 작업 수행. client는 iterator가 수행할 작업에 대한 정보만 전달

이 둘중에서는 external iterator가 더 유연: client가 임의로 접근 순서를 제어할 수있기 때문에(ex. 두개의 리스트가 동일한 지 여부를 비교할땐 external만 가능)

*리스트나 트리 객체 내의 각 항목을 접근하기 위한 알고리즘은 어디에 둘까?*
1) 리스트나 트리 객체 내에 항목을 접근하기 위한 알고리즘을 두고 iterator객체에는 현재 위치 정보만 기억. 이때 iterator는 cursor.
2) iterator클래스 내에 리스트나 트리 객체 내의 항목을 접근하는 알고리즘을 둠: 알고리즘 변경시 iterator클래스 상속받아 만들면 되니까 변경이 쉽다. + 같은 알고리즘을 서로다른 객체에 적용 가능. iterator 클래스에 의해 리스트나 트리객체를 위한 클래스의 정보 은닉이 깨질수 있다!

*Iterator 객체로 트리나 리스트를 사용하고 있는 도중에 항목이 추가되면?*
Robust Iterator처럼 만들어라!: 변경이 생겨도 정상적으로 접근, 사용가능하도록 함. Collection 내에 iterator를 갖고있고 add나 remove가 발생했을때 iterator instance를 새로 new해서 만든다 


### 관련 패턴
- iterator가 동적으로 할당될 경우 `proxy` 패턴을 활용하여 사용이 끝난 iterator객체는 자동으로 소멸되게 만들어준다
- composite패턴으로 생성된 객체일때 어떤식으로 각 항목을 따라가게 하면 좋을까 
  - 트리상의 각 항목들을 접근하기 위한 순서가 결정되어 있어야함. 트리상에서 항목들을 찾아다니기 위해서는 각 항목들이 부모항목, 자식항목, 형제 항목들에 대한 정보를 갖고 있어야하고 트리를 순회하기 위한 별도 알고리즘 필요.
  - 또는 internal iterator사용^^
- `memento` 패턴은 iterator 객체 내부에 현재 항목의 위치 정보 등을 저장, 관리할때 유용하게 쓸 수 있다. 이때 memento 객체는 iterator객체 내부에 있다