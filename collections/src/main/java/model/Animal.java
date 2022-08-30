package model;
import java.lang.Comparable;



public abstract class Animal implements Comparable<Animal>{
    //private fields 
    protected String name; 
    private int age;

    //constructor
    public Animal(String name, int age){
    this.name = name;
    this.age = age;
    }

    //setters and getters for name and age
    public void setName(String name) {
        this.name = name;
    }
    public String getName() { 
        return name; 
    } 
    public void setAge(int age) { 
        this.age = age;
    } 
    public int getAge() { 
        return age;
    }
    
    //abstract methods, the animal class doesn't know
    //how to implement these. We need some concrete
    //instantiations

    public abstract String sayHello();

    public abstract String move();


    public String toString(){
    return "Name: " + name + " Age: " + age;
    }

    public int compareTo(Animal animal){
        return animal.age - this.age;
    }
  

    public int compare(Animal animal1, Animal animal2){
        return animal1.getAge() - animal2.getAge();
    }
   
    


   

    
}


    