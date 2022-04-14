package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {

//        int x = 3;
//        System.out.println(x);
//        System.out.println("Varsta catelului este: "+ constantin.ageInMonths);
//
//        constantin.name = "TRex";
//        constantin.race = "";
//        System.out.println(constantin.name);
//        System.out.println(constantin.getColor());
//        constantin.run();
//
//        Dog const2 = new Dog();
//        System.out.println(const2.name);
//
//        int y = 1;
//        int z = y;
        Dog dog = new Dog();
        dog.setName("Barky");
        dog.setColor("Blue");
        System.out.println(dog.getName());
        if(dog.getName().contentEquals("George")){
            System.out.println("L-am gasit!");
        }

        Mouse jerry = new Mouse();
        jerry.setMale(true);

        Labrador dor = new Labrador();
        dor.bytes();
        dor.sleep();
    }
}
