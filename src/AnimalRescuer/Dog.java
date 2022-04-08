package AnimalRescuer;

public class Dog {

    private String color;
    private double weigth;
    private int ageInMonths;
    private String ownerName;
    private String race;
    private String name;
    private boolean isMale;

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public boolean getIsMale(){
        return this.isMale;
    }
    public void setIsMale(boolean isMale){
        this.isMale = isMale;
    }


    public void eat(){
        System.out.println("Eating dog food");
    }

    public void sleep(){
        System.out.println("zzzzZZZ");
    }

    public void run(){
        System.out.println("Running ");
    }


    public void play(){
        System.out.println("playing fetch");
    }
}
