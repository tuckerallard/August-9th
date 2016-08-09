package ssa.tiy.week2.day7.august9.assignment;

import java.util.ArrayList;

public class Zoo 
{

	public static void main(String[] args) 
	{
		System.out.println("Today at the zoo I saw:\n");
		ArrayList<Animal> ourZoo = new ArrayList<>(10);
		
		Animal Elephant = new Elephant(true, 5000f, 11f, "Grey", 4, false, "Pfffft");
		Animal Giraffe = new Giraffe(true, 2600f, 26f, "Yellow and Brown", 4, false, "Bleat");
		Animal Monkey = new Monkey(false, 82f, 2f, "Black", 2, false, "Ooh ooh ah ah");
		Animal Alligator = new Alligator(true, 500f, 1f, "Green", 4, true, "Hiss");
		Animal Bat = new Bat(false, .5f, .5f, "Black", 2, true, "Screech");
		Animal Lion = new Lion(true, 400f, 4f, "Tan", 4, false, "Roar");
		Animal Bear = new Bear(true, 800f, 4f, "Brown", 4, true, "Growl");
		Animal Rhinoceros = new Rhinoceros(true, 5000f, 6f, "Grey", 4, false, "Bellow");
		Animal Wolf = new Wolf(true, 120f, 2.5f, "White", 4, true, "Howl");
		Animal Peacock = new Peacock(false, 10f, 4.5f, "Multi-Color", 2, false, "Caw Caw");
		Bat VampireBat = new VampireBat(false, 1f, .6f, "Black", 2, false, "Screech", true);
		Bear PandaBear = new PandaBear(true, 250f, 3f, "White and Black", 4, true, "Squeak", true);
		Wolf ArticWolf = new ArticWolf(true, 100f, 2.3f, "White", 4, false, "Howl", true);
		Monkey YellowBaboon = new YellowBaboon(false, 55f, 3.8f, "Yellow", 2, false, "Howl", true);
		Alligator ChineseAlligator = new ChineseAlligator(true, 79f, 1f, "Grey", 4, true, "Hiss", true);
		
		ourZoo.add(Elephant);
		ourZoo.add(Giraffe);
		ourZoo.add(Monkey);
		ourZoo.add(Alligator);
		ourZoo.add(Bat);
		ourZoo.add(Lion);
		ourZoo.add(Bear);
		ourZoo.add(Rhinoceros);
		ourZoo.add(Wolf);
		ourZoo.add(Peacock);
		ourZoo.add(VampireBat);
		ourZoo.add(PandaBear);
		ourZoo.add(ArticWolf);
		ourZoo.add(YellowBaboon);
		ourZoo.add(ChineseAlligator);
		
		for (int i = 0; i < (ourZoo.size()); i++)
		{
			System.out.println(ourZoo.get(i));
		}
		
//		System.out.println(ourZoo.get(0));
//		System.out.println(ourZoo.get(1));
//		System.out.println(ourZoo.get(2));
//		System.out.println(ourZoo.get(3));
//		System.out.println(ourZoo.get(4));
//		System.out.println(ourZoo.get(5));
//		System.out.println(ourZoo.get(6));
//		System.out.println(ourZoo.get(7));
//		System.out.println(ourZoo.get(8));
//		System.out.println(ourZoo.get(9));
//		System.out.println(ourZoo.get(10));
//		System.out.println(ourZoo.get(11));
//		System.out.println(ourZoo.get(12));
//		System.out.println(ourZoo.get(13));
//		System.out.println(ourZoo.get(14));

	}

}
