package com.behavioral.visitor.first.impl;

import com.behavioral.visitor.first.ComputerPart;
import com.behavioral.visitor.first.ComputerPartVisitor;

public class Computer implements ComputerPart {
	
   ComputerPart[] parts;

   public Computer(){
      parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};		
   }
	public void accept(ComputerPartVisitor computerPartVisitor) {
	    for(int i=0; i<parts.length; i++){
	    	parts[i].accept(computerPartVisitor);
	    }
    }
}
