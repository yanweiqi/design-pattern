/**  
 * @project:Patter_demo
 * @package:com.behavioral.iterator
 * @file£ºIterator.java  
 * @author:yanweiqi@yeah.net 
 * @version£º  
 * @since£º2013-5-27  
 * @copyright xxx
 */
package com.behavioral.iterator.first;


public interface Iterator<T> {

	public void first();

	public void next();

	public boolean isDone();

	public T currentItem();

}
