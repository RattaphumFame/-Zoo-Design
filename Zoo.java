import java.util.ArrayList;
import lib.*;

public class Zoo {

    public static void main(String[] args) {
        ArrayList<Animal> Animal = new ArrayList<>();
        Animal.add(new LIon("par"));
        Animal.add(new Bird("yar"));
        Animal.add(new Dolphin("ice"));
        Animal.add(new Eagle("b"));
        Animal.add(new Penguin("A"));
        for (Animal animal2 : Animal){
            System.out.println( animal2.Getname());
            System.out.println(animal2.makesound());   
        }
        for (Animal animal : Animal) {
            if (animal instanceof Flyable ) {
                Flyable animal1 = (Flyable)animal;
                    
                System.out.println(animal1.fly()); 
            }
             if (animal instanceof Swimable) {
               Swimable animal1 = (Swimable)animal;
               System.out.println(animal1.swim());
            } 
            else{
            System.out.println("animal is walk");
            }
        }
        
        
            
    
        
    }



}