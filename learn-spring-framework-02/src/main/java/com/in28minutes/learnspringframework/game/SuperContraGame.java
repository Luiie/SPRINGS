package com.in28minutes.learnspringframework.game;

public class SuperContraGame implements GamingConsole{
	public void up() {
		System.out.println("Jump!Jump!");
	}
	
	public void down() {
		System.out.println("down!");
	}
	
	public void left() {
		System.out.println("<- <-");
	}
	
	public void right() {
		System.out.println("-> ->");
	}
}
