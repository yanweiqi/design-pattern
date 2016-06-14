/**  
 * @project:Patter_demo
 * @package:com.behavioral.iterator.impl
 * @file��ConcreteAggregate.java  
 * @author:yanweiqi@yeah.net 
 * @version��  
 * @since��2013-5-27  
 * @copyright xxx
 */
package com.behavioral.iterator.first.impl;

import java.util.ArrayList;
import java.util.List;

import com.behavioral.iterator.first.Aggregate;
import com.behavioral.iterator.first.Iterator;


public class ConcreteAggregate<T> implements Aggregate<T> {

	private List<T> itemList = new ArrayList<T>();

	public Iterator<T> createIterator() {
		return new ConcreteIterator<T>(this);
	}

	public int count() {
		return itemList.size();
	}


	@SuppressWarnings("unchecked")
    public void append(Object obj) {
		itemList.add((T)obj);
	}

	public void remove(Object item) {
		itemList.remove(item);
	}

	public  List<T> getList() {
		return itemList;
	}

}
