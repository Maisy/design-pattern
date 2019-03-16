## 원형 (Prototype)

### 활용예제
- db에서 데이터를 가져와서 여러번 수정이 일어날때: 원래 object의 property를 확인해서 deep or shallow copy로  object clone
  [ref](https://blog.seotory.com/post/2015/09/java-prototype-pattern)
- js의 prototype.~~
- config가 엄청 많은데 2~3개 정도만 추가해서 새로운 config를 만들어야할때: 기존 config로직이 수정되어도 clone받아서 만든 애는 몰라도 된다.


### 이점
- object 생성에 높은 비용이 사용되는 경우 (DB에서 데이터를 가져오는 등) 원형 객체를 복사하여 비용을 줄일 수 있다
- 다른 생성패턴에 비해 클래스 수를 줄일 수 있다
- Runtime에도 생성할 객체를 추가/삭제

### 단점
- 모든 제품에 clone 메서드 구현
- clone 메서드 구현시 주의사항
    - 언어에서 제공하는 복제 기능 사용 시 얕은 복사(shallow copy) 대 깊은 복사(deep copy) 문제 발생 가능
    - (일부 언어) 언어에서 제공하는 복제 기능 대신 복사 생성자 혹은 복사 팩토리 사용 권장