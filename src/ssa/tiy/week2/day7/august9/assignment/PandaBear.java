package ssa.tiy.week2.day7.august9.assignment;

public class PandaBear extends Bear
{
	private boolean eatsBamboo = true;

	public PandaBear(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping,
			String sound, boolean eatsBamboo) 
	{
		super(isCaged, weight, height, color, legs, isSleeping, sound);
		this.eatsBamboo = eatsBamboo;
	}

	public boolean isEatsBamboo() 
	{
		return eatsBamboo;
	}

	public void setEatsBamboo(boolean eatsBamboo) 
	{
		this.eatsBamboo = eatsBamboo;
	}

	@Override
	public String toString() 
	{
		return "12) A PandaBear. It eats bamboo:" + eatsBamboo + ". It was caged:" + isCaged + ". Its weight in pounds was:" + weightInPounds + ". Its height in feet was:" + heightInFeet + ". Its color was:" + color
				+ ". The number of legs it had was:" + legs + ". It was sleeping:" + isSleeping + ". The sound it made was:" + sound + ".";
	}
	
}
