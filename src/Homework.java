//Создадим теплый-ламповый конструктор
//Когструктор включает в себя имя, должность, почту, телефон, оклад и возраст

class Person {
    private String name;
    private String position;
    private String mail;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String position, String mail, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;


    }
    public int getAge() {
        return age;
    }

    public void fullInfo() {
        System.out.printf("Name: %s\n Position: %s Email: %s Phone: %s Salary: %d Age: %d\n", name,position,mail,phone,salary,age);
    }





}

public class Homework {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person ("Johny", "Engineer", "batman@mailbox.com", "89123637781", 80000, 42 );
        persArray[1] = new Person ("Thomas", "Chief", "karapuzo@mailbox.com", "89126332171", 90000, 37 );
        persArray[2] = new Person ("Jonas", "Consultant", "geekotan@mailbox.com", "87772123627", 63000, 21 );
        persArray[3] = new Person ("Diego", "Tech trainer", "bimba@mailbox.com", "89278537556", 78000, 45 );
        persArray[4] = new Person ("Juan", "Lawyer", "machinegun@mailbox.com", "81192309168", 72500, 47 );

        //Выведем информацию о сотрудниках старше 40 лет

        System.out.println("\n Эти сотрудники старше сорока лет: ");

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].fullInfo();
            }
        }
    }
}
