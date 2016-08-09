package ssa.tiy.week2.day7.august9.assignment;

public class ChineseAlligator extends Alligator
{
	private boolean livesInChina = true;

	public ChineseAlligator(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping,
			String sound, boolean livesInChina) 
	{
		super(isCaged, weight, height, color, legs, isSleeping, sound);
		this.livesInChina = livesInChina;
	}

	public boolean isLivesInChina() 
	{
		return livesInChina;
	}

	public void setLivesInChina(boolean livesInChina) 
	{
		this.livesInChina = livesInChina;
	}

	@Override
	public String toString() 
	{
		return "15) A ChineseAlligator. They are found in China:" + livesInChina + ". It was caged:" + isCaged + ". Its weight in pounds was:" + weightInPounds + ". Its height in feet was:" + heightInFeet + ". Its color was:" + color
				+ ". The number of legs it had was:" + legs + ". It was sleeping:" + isSleeping + ". The sound it made was:" + sound + ".";
	}
	
}
