package com.qa;
import model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;


public class Main 
{
    public static void main( String[] args )
    {
    // 1. create animals from sub classes.

    Animal testAnimal = new Dog("TestDog", 2);
    Dog dogFido = new Dog("Fido", 5);
    Dog dogPug = new Dog("Pug", 6);
    Cat catTiger = new Cat("Tiger", 7);
    Cat catGinger = new Cat("Ginger", 12);
    Rabbit rabbitSnowy = new Rabbit("Snowy", 3);
    
     
    // 2. put the animal objects in an arraylist

    ArrayList <Animal> listOfAnimals = new ArrayList<Animal>();

        listOfAnimals.add(dogFido);
        listOfAnimals.add(dogPug);
        listOfAnimals.add(catTiger);
        listOfAnimals.add(catGinger);
        listOfAnimals.add(rabbitSnowy);
        listOfAnimals.add(testAnimal);


    // print out list of animals in the array

    for (int i=0; i < listOfAnimals.size(); i++){
        System.out.println(listOfAnimals.get(i));

    }

    // 3a. Create a hash map where the key is the name of the animal and the value is the object
    HashMap<String, Animal> animalHashMap = new HashMap<String, Animal>();

    for (int i=0; i < listOfAnimals.size(); i++){
        animalHashMap.put(listOfAnimals.get(i).getName(), listOfAnimals.get(i));
    }

    
    // Check that we can see the value in the hashmap where the key is name of dog "Fido"
     //System.out.println(animalHashMap.get("Fido"));


    // 3b. Create a hashmap where the key is the object and the value is a description

    HashMap<Animal, String> animalHashMap2 = new HashMap<Animal, String>();

    for (int i=0; i < listOfAnimals.size(); i++){
        animalHashMap2.put(listOfAnimals.get(i),"Details for " + listOfAnimals.get(i).getName());
    }

    // Create a Hashset using the listOfAnimals arraylist

    HashSet<Animal> animalHashSet = new HashSet<Animal>();
    
    for (int i=0; i < listOfAnimals.size(); i++){
        animalHashSet.add(listOfAnimals.get(i));
    }
    

    // Adding dog Fido again to the same HashSet, a new entry is not added 
    // because the Hashcode already exists for this object

    animalHashSet.add(dogFido);
  


    // 5a. print using an enhanced for loop

    for (Animal animal : animalHashSet) {
        System.out.println("Iterate usign a for each loop: "+ animal);
    }

    // 5b print using an Iterator class

    Iterator<Animal> it = animalHashSet.iterator();

    System.out.println("Iterate HashSet using iterator : ");

    while (it.hasNext()) {

        System.out.println(it.next() + " ");
    }

    // Search for a search item "Fido" in the HashMap, using contains method.

    System.out.println("Fido details from HashMap "+ animalHashMap.get("Fido"));
    

    // Search for "Fido" in HashSet, use a loop to iterate

    for (Animal animal : animalHashSet) {

        if (animal.getName().equals("Fido")){
            System.out.println("Fido details from HashSet " + animal);
        }
        
    }

    // sorting through an ArrayList using compareTp

    // System.out.println("Before Sorting");

    // for (Animal animal: listOfAnimals) {
    //     System.out.println(animal);
    // }

    // Collections.sort(listOfAnimals);

    // System.out.println("After Sorting:");

    // for (Animal animal: listOfAnimals) {
    //     System.out.println(animal);
    // }


    System.out.println("Before Sorting");

     for (Animal animal: listOfAnimals) {
         System.out.println(animal);
     }

    //Sorting through listOfAnimals using a Comparator
    
    Collections.sort(listOfAnimals, new AgeComparator());

    System.out.println("After Sorting using a comparator");

    for (Animal animal: listOfAnimals) {
        System.out.println(animal);
    }



}
}
    
