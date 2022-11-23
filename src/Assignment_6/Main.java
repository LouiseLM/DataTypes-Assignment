package Assignment_6;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Pudding", 3);
        Person person1 = new Person("Athena", 25);
        Person person2 = new Person("Fera", 5);

        System.out.println(person.printIntroduction());
        System.out.println(person1.printIntroduction());
        System.out.println(person2.printIntroduction());
    }
}
