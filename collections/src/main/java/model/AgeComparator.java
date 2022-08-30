package model;
import java.util.Comparator;

public class AgeComparator implements Comparator<Animal>{

   
    public int compare(Animal animal1, Animal animal2){
        return animal1.getAge() - animal2.getAge();
    }
}
