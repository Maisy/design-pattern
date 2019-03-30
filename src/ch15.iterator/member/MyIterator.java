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

	// ���ŵ� ��ü �� ������ ��ü�� ����
	public void remove() {
		iterator.remove();
	}

}
