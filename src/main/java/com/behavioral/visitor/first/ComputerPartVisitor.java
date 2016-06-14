package com.behavioral.visitor.first;

import com.behavioral.visitor.first.impl.Computer;
import com.behavioral.visitor.first.impl.Keyboard;
import com.behavioral.visitor.first.impl.Monitor;
import com.behavioral.visitor.first.impl.Mouse;

public interface ComputerPartVisitor {
	
	void visit(Computer computer);
	
	void visit(Mouse mouse);
	
	void visit(Keyboard keyboard);
	
	void visit(Monitor monitor);
	
}
