## 복합체 (Composite)

### 목적
개별 객체와 복합 객체를 모두 동일하게 다룰 수 있도록 한다


### 활용예제
- file system: folder, file을 같은 component level(leaf node)로 보기때문에 add(folder) or add(file)을 composite인지 아닌지 모르고 쓸 수있다.
- jquery .find() 한 이후 object가 리턴되든 array가 리턴되든 .css() 를 사용할수있다.


### 구현 
- Equipment를 상속받아 Composite Equipment를 구현
   - CompositeEquipment에서 createIterator로 iterator를 받아서 사용하여 **각 composite마다 다른 데이터구조**를 사용할 수 있다

```java
public class CompositeEquipment extends Equipment {
        //... 

	@Override
	public int price() {
		Iterator<Equipment> list = createIterator();
		int total = 0;
		while (list.hasNext()) {
			total += list.next().price();
		}
		list = null;
		return total;
	}
public class Bus extends CompositeEquipment {
    private TreeSet<Equipment> list;
    //...
}

public class Cabinet extends CompositeEquipment {
    private ArrayList<Equipment> list;
    //...
}

public class Chassis extends CompositeEquipment {
    private LinkedList<Equipment> list;
    //...
}
```