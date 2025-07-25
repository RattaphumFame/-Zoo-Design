package lib;

public class Bird extends Animal{

    public Bird(String name) {
        super(name);
       
    }

    @Override
    public String makesound() {
      return "Bird Sound";
    }
    
}
