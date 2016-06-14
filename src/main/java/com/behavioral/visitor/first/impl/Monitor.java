package com.behavioral.visitor.first.impl;

import com.behavioral.visitor.first.ComputerPart;
import com.behavioral.visitor.first.ComputerPartVisitor;

public class Monitor implements ComputerPart {

	@Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
	    computerPartVisitor.visit(this);
    }
}
