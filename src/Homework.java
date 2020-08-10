abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;

    abstract void run(int length);
    abstract void swim(int length);
}

class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH))
        {System.out.println("Котик добежит");}
        else {System.out.println("Котик не добежит");}
    }

    @Override
    void swim(int length) {
        System.out.println("Котики не плавают");
    }

}

class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) {System.out.println("Собака добежит");}
        else {System.out.println("Собака не добежит");}

    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) {System.out.println("Собака доплывет");}
        else {System.out.println("Собака не доплывет");}
    }
}





public class Homework {
        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.run(201);
            cat.swim(1);

            Dog dog = new Dog();
            dog.run(500);
            dog.swim(10);
    }
}
