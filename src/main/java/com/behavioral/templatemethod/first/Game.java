

package com.behavioral.templatemethod.first;

public abstract class Game {
	
   abstract void initialize();
   abstract void startPlay();
   abstract void endPlay();

	public Game() {
		super();
	}

    public final void play(){
    	initialize();
    	startPlay();
    	endPlay();
    }

}
