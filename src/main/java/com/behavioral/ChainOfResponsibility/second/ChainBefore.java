package com.behavioral.ChainOfResponsibility.second;

import java.util.Random;

public class ChainBefore {
	
	interface Image{
		String process();
	}
	
	static class IR implements Image{

		@Override
        public String process() {
	        return "IR";
        }
	}

	static class LS implements Image{

		@Override
        public String process() {
	        return "LS";
        }
	}
	
	static class Processor{
		private static Random rn = new Random();
		private static int nextId = 1;
		private int id = nextId++;
		
		public boolean handle(Image img){
			if(rn.nextInt(2) != 0){
				System.out.println(" processor "+id+"is busy");
				return false;
			}
			System.out.println("Processor " + id + " - " + img.process());
			return true;
		}
		
	}
}
