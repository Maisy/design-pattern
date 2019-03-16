## 장식자 (Decorator)

### 목적
객체에 동적으로 새로운 기능을 추가할 수 있게 한다

### 활용
- 다른 객체에 영향을 주지 않고 각각의 객체에 새로운 기능을 추가하고 싶을때
- 제거될 수 있는 기능에 대해 사용
- 실제 상속으로 서브 클래스를 만드는 방법이 유용하지 못할때 사용

### 구조이해
- decorator는 addon이므로 없을때도 똑같이 사용가능하다. 여러가지 decorator를 붙여도 같은 형태의 object를 리턴해야한다(= 최상위는 component를 상속받아 구현한다)

### 활용예제
- router에서 middleware를 decorator로 구현하여 사용한다
  ex) [django] restAPI구현 시 @auth, @checkOthers, @checkAAA, .. 와 같이 미리 선언해둔 function을 호출해서 다양한 조합으로 validation check가 가능하다
	```python
	def authCheck(func):
		def decorator(*args, **kwargs):
			print("%s %s" % (func.__name__, "before"))
			result = func(*args, **kwargs)
			print("%s %s" % (func.__name__ , "after"))
			return result
		return decorator

	@authCheck
	def func(x, y):
		print(x + y)
		return x + y

	func(1,2)
	```


### 단점
- 작은 규모의 객체들이 많아져서 객체들을 모두 이해하고 있지 않는다면 유지보수가 어렵다.
  ex) 순서가 중요할수도 있다