package AnimalRescuer;

public abstract class Dog extends Animal{

    public abstract void eat();

    public void sleep() {
        System.out.println("zzzzZZZ");
    }

    public void run() {
        System.out.println("Running ");
    }

    public void play() {
        System.out.println("playing fetch");
    }

    public void bytes(){
        System.out.println("Ham! Byte!");
    }


}
