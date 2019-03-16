## 단일체 (SINGLETON)

### 활용
- 클래스의 인스턴스가 오직 하나여야 함을 보장하고 잘 정의된 access point로 모든 사용자가 접근할 수 있도록 해야할 때
- 유일한 인스턴스가 서브클래싱으로 확장되어야 하며, 사용자는 확장된 서브클래스의 인스턴스를 사용할 수 있어야 할 때
  - 싱클톤 클래스의 서브클래스 싱클톤A, 싱클톤B의 총 인스턴스 개수를 관리.


### 활용예제
- 프린터 스풀(대기열 관리시스템)
- 다양한 리소스 pool (DB connection, Thread 등)
- Configuration, Logger 등
- 사용자 session관리

### 구현
- Registry를 사용해서 할수도있다


### 단점
- 싱글톤 클래스가 많은 의존성을 가지게 되면 객체들 간의 결합도를 높여 수정이나 테스트가 어려워질 수 있음 
- 숨겨진 의존성을 만들고 참조가 투명하지 않아 추적하기가 힘듬

### Java (LazyHolder Singleton 패턴)
static영역에 초기화를 하지만 객체가 필요한시점까지 초기화를 미루는 방식이다. LazyHolder 클래스의 변수가 없기 때문에 Singleton 클래스 로딩 시 LazyHolder 클래스를 초기화하지 않는다. Singleton 클래스의 getInstance() 메서드에서 LazyHolder.INSTANCE를 참조하는 순간 Class가 로딩되며 초기화가 진행된다. Class를 로딩하고 초기화하는 시점은 thread-safe를 보장하기 때문에 volatile이나 synchronized 같은 키워드가 없어도 thread-safe 하면서 성능도 보장하는 아주 훌륭한 방법이다.
```java
	public class Singleton {
		private Singleton() {
		}

		public static Singleton getInstance() {
			return LazyHolder.INSTANCE;
		}

		private static class LazyHolder {
			private static final Singleton INSTANCE = new Singleton();
		}
	}
```

### 참고
- [Singleton in ES6](https://medium.com/@dmnsgn/singleton-pattern-in-es6-d2d021d150ae)
- [Singleton Lazy Initialization in Java](https://javaplant.tistory.com/21)