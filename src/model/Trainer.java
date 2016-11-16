// Last updated: 11/15 2104
// [WORKING ON BY NIVEN FRANCIS]

package model;

import java.awt.Image;
import java.util.ArrayList;

public class Trainer {
	
	private String name;
	private Image trainerImage = null;
	private Bag backpack;
	
	private int steps;
	private int MAX_STEPS = 500;
	
	private ArrayList<Pokemon> pokemon;
	
	public Trainer(String name, Image img) {
		this.name = name;
		this.trainerImage = img;
		backpack = new Bag();
		this.steps = 0;
		pokemon = new ArrayList<Pokemon>();
	}
	
	// Returns this instance of the backpack
	public Bag getBackpack() {
		return backpack;
	}
	
	// Adds steps to the steps global variable
	public boolean addSteps(int add) {
		steps += add;
		if(steps >= MAX_STEPS) {
			System.out.println("Trainer has walked maximum number of steps");
			return false;
		}
		return true;
	}
	
	// Returns number of steps
	public int stepCount() {
		return steps;
	}
	
	// Returns name of trainer
	public String getName() {
		return this.name;
	}
	
	// TODO: implement next 4 actions with game
	public void throwBall() {
		return;
	}
	
	public void throwRock() {
		return;
	}
	
	public void throwBait() {
		return;
	}
	
	public void run() {
		return;
	}
}
