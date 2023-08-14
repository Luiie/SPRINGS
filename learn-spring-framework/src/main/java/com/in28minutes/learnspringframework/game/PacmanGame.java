package com.in28minutes.learnspringframework.game;

public class PacmanGame implements GamingConsole{
	public void up() {
		System.out.println("Jump!!");
	}
	
	public void down() {
		System.out.println("Go!!");
	}
	
	public void left() {
		System.out.println("<-<-<-");
	}
	
	public void right() {
		System.out.println("->->->");
	}

}
