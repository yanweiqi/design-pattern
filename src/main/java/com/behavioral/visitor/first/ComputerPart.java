package com.behavioral.visitor.first;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
