package lib;

public class Penguin extends Bird implements Swimable {

    public Penguin(String name) {
        super(name);
       
    }

    @Override
    public String makesound() {
      
       return "Squawk!";
    }
    @Override
    public String swim() {
         return "The penguin dive gracefully in the water";
    }
    
}
