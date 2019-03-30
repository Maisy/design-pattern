package member;

import java.util.Iterator;

public class MyIterator implements Iterator {
	private Iterator iterator;

	public MyIterator(Iterator iterator) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public Object next() {
		return iterator.next();
	}

	// 열거된 객체 중 마지막 객체를 제거
	public void remove() {
		iterator.remove();
	}

}
