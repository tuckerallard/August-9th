package ssa.tiy.week2.day7.august9.assignment;

public class YellowBaboon extends Monkey
{
	private boolean bareButt = true;

	public YellowBaboon(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping,
			String sound, boolean bareButt) 
	{
		super(isCaged, weight, height, color, legs, isSleeping, sound);
		this.bareButt = bareButt;
	}

	public boolean isBareButt() 
	{
		return bareButt;
	}

	public void setBareButt(boolean bareButt) 
	{
		this.bareButt = bareButt;
	}

	@Override
	public String toString() 
	{
		return "14) A YellowBaboon. Its butt was bare:" + bareButt + ". It was caged:" + isCaged + ". Its weight in pounds was:" + weightInPounds + ". Its height in feet was:" + heightInFeet + ". Its color was:" + color
				+ ". The number of legs it had was:" + legs + ". It was sleeping:" + isSleeping + ". The sound it made was:" + sound + ".";
	}

}
