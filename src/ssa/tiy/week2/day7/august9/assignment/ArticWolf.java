package ssa.tiy.week2.day7.august9.assignment;

public class ArticWolf extends Wolf
{
	private boolean livesInArtic = true;

	public ArticWolf(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping,
			String sound, boolean livesInArtic) 
	{
		super(isCaged, weight, height, color, legs, isSleeping, sound);
		this.livesInArtic = livesInArtic;
	}

	public boolean isLivesInArtic() 
	{
		return livesInArtic;
	}

	public void setLivesInArtic(boolean livesInArtic) 
	{
		this.livesInArtic = livesInArtic;
	}

	@Override
	public String toString()
	{
		return "13) A ArticWolf. It lives in the artic:" + livesInArtic + ". It was caged:" + isCaged + ". Its weight in pounds was:" + weightInPounds + ". Its height in feet was:" + heightInFeet + ". Its color was:" + color
				+ ". The number of legs it had was:" + legs + ". It was sleeping:" + isSleeping + ". The sound it made was:" + sound + ".";
	}
	
}
