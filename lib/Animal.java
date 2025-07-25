package lib;
public abstract class Animal{

    private final String name;

    public Animal(String name){
       this.name = name;
    }
    public String Getname(){
        return this.name;
    }
    public abstract String makesound();
}