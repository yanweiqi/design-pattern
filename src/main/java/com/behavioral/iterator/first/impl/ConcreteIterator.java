
package com.behavioral.iterator.first.impl;

import com.behavioral.iterator.first.Iterator;


public class ConcreteIterator<T> implements Iterator<T> {

	private final ConcreteAggregate<T> listAggregate;
	private int index = 0;

	public ConcreteIterator(ConcreteAggregate<T> aggregate) {
		super();
		listAggregate = aggregate;
	}

	public void first() {
		index = 0;
	}

	public void next() {
		index++;
	}

	public boolean isDone() {
		return index == listAggregate.count();
	}

	public T currentItem() {
		return listAggregate.getList().get(index);
	}

}
