

import java.util.*;

public class Player extends Character implements AttackStrategy{
	
	int spellBar; //depleted as special spells are performed
	String activePotion = "No active Potion"; //currently equipped potion
	ArrayList<String> relicItems = new ArrayList<String>(); //relic items collected after the battles (used to brew potions)
	
	Command[] spells = {new Lumos(), new Expelliarmus(), new AvadaKedavra()};
	
	Wand wand = new Wand(spells);
	
	
	public Player(String name, int maxHp) {
		super(name, maxHp);
		this.spellBar = 100;
		// TODO Auto-generated constructor stub
	}
	
	//Singleton Player - only one instance of Player
		private static Player instance;

		public static synchronized Player getInstance(String name, int maxHp) {
			if (instance == null) {
				instance = new Player(name, maxHp);
			}
			return instance;
		}

	public int numAtkUpg, numDefUpg;
	String house = "";
	
	//Arrays to store the upgrade names for Gryffindor
	public String[] atkUpgrades = {"Fiery Fury", "Valiant Strike", "Braveheart", "Lion's Roar "};
	public String[] defUpgrades = {"Gryffindor Shield", "Brave Barrier", "Steel Resolve", "Courageous Guard"};
	
	public String[] atkUpgradesG = {"Fiery Fury", "Valiant Strike", "Braveheart", "Lion's Roar"};
	public String[] defUpgradesG = {"Gryffindor Shield", "Brave Barrier", "Steel Resolve", "Courageous Guard"};
	
	//Arrays to store the upgrade names for Hufflepuff
	public String[] atkUpgradesH = {"Hufflepuff Hammer", "Golden Strike", "Friendship Force", "Cheerful Charge"};
	public String[] defUpgradesH = {"Hufflepuff Shield", "Friendly Barrier", "Patient Protection", "Joyful Guard"};
	
	//Arrays to store the upgrade names for Ravenclaw 
	public String[] atkUpgradesR = {"Ravenclaw Riddle", "Eagle's Fury", "Wit's End", "Brain Blast"};
	public String[] defUpgradesR = {"Ravenclaw Barrier", "Eagle's Eye", "Brilliant Defense", "Mindful Guard"};

	
	//Arrays to store the upgrade names for Slytherin
	public String[] atkUpgradesS = {"Slytherin Strike", "Venomous Bite", "Cunning Slash", "Dark Ambush"};
	public String[] defUpgradesS = {"Slytherin Shield", "Deceptive Defense", "Venom Ward", "Dark Wall"};

	
	//Choose a house
	public String[] houseChoices = {"Gryffindor", "Ravenclaw", "Hufflepuff", "Slytherin"};


	@Override
	public int attack() {
	    Scanner scanner = new Scanner(System.in);
	    int damage = 20;
	    int attackChoice;

	    System.out.println("Choose your attack:");
	    System.out.println("1. Normal attack");
	    System.out.println("2. Special spell");

	    try {
	        attackChoice = scanner.nextInt();
	    } catch (InputMismatchException e) {
	        System.out.println("Invalid input. Defaulting to normal attack.");
	        attackChoice = 1;
	    }
	    if(attackChoice == 2) {
		    if (spellBar>=50) {
		        System.out.println("Choose your spell:");
		        System.out.println("1. Expelliarmus - wave phone right to left to disarm opponent.");
		        System.out.println("2. Avada Kedavra - Rotate the phone to perform the killing curse.");
		        try {
		            int spellChoice = scanner.nextInt();
		            if (spellChoice == 1) {
		            	damage = this.wand.cast(1);
		                this.spellBar-=20;
		                return damage;
		            } else if (spellChoice == 2) {
		                damage = this.wand.cast(2);
		                this.spellBar-=50;
		                return damage;
		            } else {
		                System.out.println("Invalid spell choice. Defaulting to normal attack.");
		            }
		        } catch (InputMismatchException e) {
		            System.out.println("Invalid input. Defaulting to normal attack.");
		        }
		    }
		    else {
		    	System.out.println("Sorry you don't have a high enough to perform a spell. Defaulting to normal attack.");
		    	attackChoice = 1;
		    }
	    }
	    
	    System.out.println("You performed Normal Attack");

	    if (numAtkUpg > 0) {
	        damage += 2 * numAtkUpg;
	    }
	    
	    System.out.println("You dealt " + damage + " Damage!");

	    return damage;
	}

	@Override
	public void updateHP(int damage) {
		// TODO Auto-generated method stub
		// higher the numDefUpg, lower the change in playerXP
		 int reducedDamage = damage - (numDefUpg);
		    if (reducedDamage < 10) {
		        reducedDamage = 10;
		    }
		    this.hp -= reducedDamage;
		    if (this.hp < 0) {
		        this.hp = 0;
		    }
		    
		    System.out.println("You sustained " + damage + " Damage");
	}
	
	//sorts the player character into a house
	public void sortingHat() {
		Random r = new Random();
		 int rn = r.nextInt(4);
		
		this.house = this.houseChoices[rn];
		
		GameLogic.clearConsole();
		
		System.out.println("Congratulations you have been sorted into " + house + "!\n");
		
		GameLogic.implicitPressKey();

		this.chooseTrait(rn);
	}
	
	//let the player choose a trait of either skill in skill progression (att/def)
	public void chooseTrait(int r) {
	//based on the choice of the sorting hat, the player gets upgrade options
		switch(r) {
		case 0:
			atkUpgrades = atkUpgradesG;
			defUpgrades = defUpgradesG;
			break;
		case 1: 
			atkUpgrades = atkUpgradesR;
			defUpgrades = defUpgradesR;
			break;
		case 2:
			atkUpgrades = atkUpgradesH;
			defUpgrades = defUpgradesH;
			break;
		case 3:
			atkUpgrades = atkUpgradesS;
			defUpgrades = defUpgradesS;
			break;
		}
		this.assignSkills();
	}
	
	public void assignSkills() {
		GameLogic.clearConsole();
		GameLogic.printHeading("Choose a trait to equip " + this.name + " with: ");
		System.out.println("{1} " + this.atkUpgrades[this.numAtkUpg]);
		System.out.println("{2} " + this.defUpgrades[this.numDefUpg]);
		//get choice
		int input = GameLogic.readInt("->", 2);
		if(input ==1) {
			GameLogic.printHeading("You chose " + this.atkUpgrades[this.numAtkUpg]);
			this.numAtkUpg++;
		}
		else {
			GameLogic.printHeading("You chose " + this.defUpgrades[this.numDefUpg]);
			this.numDefUpg++;
		}
		GameLogic.pressKey();
	}

}
