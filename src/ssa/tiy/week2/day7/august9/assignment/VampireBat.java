package ssa.tiy.week2.day7.august9.assignment;

public class VampireBat extends Bat
{
	private boolean drinksBlood = true;

    public VampireBat(boolean isCaged, float weight, float height, String color, int legs, boolean isSleeping,
			String sound, boolean drinksBlood) {
		super(isCaged, weight, height, color, legs, isSleeping, sound);
		this.drinksBlood = drinksBlood;
	}

	public boolean isDrinksBlood()
    {
        return drinksBlood;
    }

    public void setDrinksBlood(boolean drinksBlood)
    {
        this.drinksBlood = drinksBlood;
    }

    @Override
    public String toString()
    {
        return "11) A VampireBat. It drinks blood:" + drinksBlood + ". It was caged:" + isCaged + ". Its weight in pounds was:" + weightInPounds + ". Its height in feet was:" + heightInFeet + ". Its color was:" + color
				+ ". The number of legs it had was:" + legs + ". It was sleeping:" + isSleeping + ". The sound it made was:" + sound + ".";
    }
}