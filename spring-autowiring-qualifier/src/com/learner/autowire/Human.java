package com.learner.autowire;

public class Human {
	
 private Heart heart;

public void setHeart(Heart heart) {
	this.heart = heart;
}
 public void startPumping()
 {
	 heart.pump();  
 }
}
	
