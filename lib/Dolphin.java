package lib;

public class Dolphin  extends Manmal implements Swimable{

    public Dolphin(String name) {
        super(name);
     }

    @Override
    public String swim() {
        return "The dolphin playfully swims in the sea.";
    }
      @Override
    public String makesound() {
      
       return "Clicking sound";
    }
    
}
