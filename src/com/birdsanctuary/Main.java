package com.birdsanctuary;

public class Main {

	public static void main(String[] args) {
    Parrot parrot = new Parrot();
    parrot.id = "p001";
    Duck duck = new Duck();
    duck.id = "d001";
    Ostrich ostrich = new Ostrich();
    ostrich.id = "o001";
    Penguin penguin = new Penguin();
    penguin.id = "pn001";
    
    BirdSanctuaryRepository birdsanctuaryrepository = new BirdSanctuaryRepository();
    
    birdsanctuaryrepository.add(parrot);
    birdsanctuaryrepository.add(duck);
    birdsanctuaryrepository.add(ostrich);
    birdsanctuaryrepository.add(penguin);
    
    birdsanctuaryrepository.print();
    

		

	}

}
