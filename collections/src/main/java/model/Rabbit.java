package model;

public class Rabbit extends Animal {
public Rabbit(String name, int age) {
super(name, age);
}
@Override
public String sayHello() {
return "Snuffle snuffle";
}
@Override
public String move() {
return "Hop hop hop";
}
public String toString(){
return "Rabbit: " + super.toString();
}

@Override
public int compareTo(Animal rabbit) {
    return rabbit.getAge() - (super.getAge());
}
}

