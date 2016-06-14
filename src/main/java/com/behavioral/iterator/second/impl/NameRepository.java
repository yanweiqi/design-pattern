package com.behavioral.iterator.second.impl;

import com.behavioral.iterator.second.Container;
import com.behavioral.iterator.second.Iterator;

public class NameRepository implements Container {
	
	public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
	
	@Override
	public <T> Iterator<T> getIterator() {	
		return new NameIterator<T>();
	}
	
	private class NameIterator<T> implements Iterator<T>{

		int index;
		
		@Override
        public boolean hasNext() {
	        if(index < names.length) return true;
	        return false;
        }

		@Override
        public T next() {
	       if(this.hasNext()) {
	    	   return (T) names [index++];
	       }
	        return null;
        }
		
	}
}
