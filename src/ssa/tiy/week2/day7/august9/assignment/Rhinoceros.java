package ssa.tiy.week2.day7.august9.assignment;

public class Rhinoceros extends Animal
{

	public Rhinoceros(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping,
			String sound) 
	{
		super(isCaged, weight, height, color, legs, isSleeping, sound);
	}

	@Override
	public String toString() {
		return "8) A Rhinoceros. It was caged:" + isCaged + ". Its weight in pounds was:" + weightInPounds + ". Its height in feet was:" + heightInFeet + ". Its color was:" + color
				+ ". The number of legs it had was:" + legs + ". It was sleeping:" + isSleeping + ". The sound it made was:" + sound + ".";
	}

}
