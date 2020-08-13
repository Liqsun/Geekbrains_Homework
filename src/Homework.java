public class Homework {
    public static void main(String[] args) {
        System.out.println("List of cats:");
        Cat[] x = {new Cat("Басиндра", 6), new Cat("Пепс", 8), new Cat("Тишка", 13)};
        Plate plate = new Plate(100);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("***********************************************");
        System.out.println("Досыпали еды до 100");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println("***********************************************");
        System.out.println("Котики поели:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}
