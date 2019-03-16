## 플라이급 (Flyweight)

### 목적
객체 공유를 통해 자원 사용량을 줄여줌
구현측면에서 자원을 효율적으로 사용하기위한 공유(동일한 값이나 데이터에 대해 포인터 변수 등을 통해 공유를 수행)에서 자원을 재활용환다
cf) vs 논리적 관점에서 공유: db나 파일공유에서 동일한 데이터나 자원을 공유

### 활용
- 응용프로글매이 많은 객체를 필요로 하는데 사용가능한 자원이 한정되어 있을 경우(ex. 모바일)
- 객체 상태 대부분이 extrinsic state로 만들어질 수 있을때
- extrinsic state 부분을 제외하고는 상대적으로 적은 공유객체로 대체가능할때
- extrinsic state가 간단한 계산으로 얻을수있을때(저장안해도 될때)

### 구현 
공유가능한 정보(intrinsic state)와 공유불가능정보(extrinsic state) 분리
ex) 
- 공유가능 : enemy 객체에서 move, attact, die한 이미지
- 공유불가능: display하는 x, y 좌표,...

## 활용예제
- java의 String object: value가 같을때 default로 같은 주소값을 참조함: runtime에 string pool에서 같은 문자열이 있는지 찾아봄
```java
String a = "hello";
String b = "hello";
String c = new String("hello");
System.out.println(a == b);//true
System.out.println(a == c);//false
```
- 워드프로세서: 같은 문자열에 대해서 새로운 객체를 새엇ㅇ하는게 아니라 반복해서 사용함



### 구현방법
   - singleton: 객체 자체가 한정된 개수만큼 자기 자신을 생성하고 공유
   - factory method: 공ㅇ유하는 객체를 대신 생성하고 관리해줄 객체를 정의

### 주의
- 얼마나 쉽게 분리될까? 공유를 해서 절약되는 자원이 많을까? 고민
- 공유된 객체가 더이상 불필요할 경우에는 소멸시켜줘야함: reference counting


### 관련 패턴
- immutable패턴: flyweight로 자원이 공유될때 클라이언트가 값을 수정하면 새로운 데이터를 반환하도록 하게 만들어서 이전 객체 참조를 끊어준다.