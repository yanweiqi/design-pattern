package com.behavioral.visitor.first;

import com.behavioral.visitor.first.impl.Computer;
import com.behavioral.visitor.first.impl.Keyboard;
import com.behavioral.visitor.first.impl.Monitor;
import com.behavioral.visitor.first.impl.Mouse;

public interface ComputerPartVisitor {
	
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
	
}
