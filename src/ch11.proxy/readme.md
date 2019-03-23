## 프록시 (Proxy)

### 종류
1. Remote Proxy
   - 서로 다른 주소 공간에 있는 객체에 대해 마치 같은 주소 공간에 있는것처럼 만들고 싶을때
2. Virtual PRoxy
   - 객체를 생성하는데 비용이 많이 드는 경우 (꼭 필요로 하는 시점까지) 객체의 생성을 미루고 대신 해당 객체가 생성된것처럼 동작하도록 만들고 싶을때
   - 객체가 실제로 생성되었든 아니든 외부에서 참조하는 방식은 같아야한다
   - ex) 캐싱 
3. Protection Proxy
   - 접근권한 제어, 객체마다 접근권한을 다르게 하고싶을때
4. Smart Reference 
   - 포인터에 추가적인 기능을 부여하고싶을때
   1) Smart Pointer: 참조될때마다 reference counter를 관리하다가 더이상 참조되지않을때 자동으로 소멸되도록만듬
   1) 객체가 생성될때가 아니라 처음 참조될때 메모리로 객체를 로딩
   2) Lock: 객체가 참조되고 있는 동안 다른 객체들이 더이상 해당객체를 참조하지 못하게 만듬

### 구현
- 원본 객체와 같은 인터페이스를 제공해야한다 (client는 모르고 쓸수있게)

 
### 활용예제
- middleware(logger, debugging,...)
- web scroll할때마다 lazy loading
- caching
- 같은 db에 접근하는데 특정 칼럼만 타입을 변경해주고 싶을때 proxy object로 감싸준 애를 호출한다
 ex) ManagerEmployee로 create하면 type이 M으로 업데이트 해서 create해준다
 https://micropyramid.com/blog/overriding-django-model-behaviour-with-proxy-model/
- es6 proxy: object validation하기 좋다
  http://hacks.mozilla.or.kr/2016/03/es6-in-depth-proxies-and-reflect/
  https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Proxy#Methods_of_the_handler_object


### 주의
- 원본객체를 수정해서는 안된다


### vs Adapter
- adapter: 기존 객체가 가지고 있는 인터페이스와는 다른 인터페이스를 Client에 제공
- proxy: 기존 객체가 제공하는것과 동일한 인터페이스 제공 + 부가기능수행


### vs Decorator
- decorator: 동적으로 객체에게 역할, 기능추가
- proxy: 기존 객체에 대한 접근 제어나 성능향상