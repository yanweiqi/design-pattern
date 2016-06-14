/**  
 * @project:Patter_demo
 * @package:com.behavioral.iterator
 * @file£ºAggregate.java  
 * @author:yanweiqi@yeah.net 
 * @version£º  
 * @since£º2013-5-27  
 * @copyright xxx
 */
package com.behavioral.iterator.first;


public interface Aggregate<T> {

	public Iterator<T> createIterator();

	public int count();

	public void append(T t);

	public void remove(T t);

}
