package basics;

public class MainClass {

    public static void main(String[] args){
        System.out.println("World Class");
//
//        Person p1 = new Person();
//        p1.age = 24;
//        p1.name = "Parth";
//
//        Person p2 = new Person();
//        p2.age = 23;
//        p2.name = "Erik";
//
//
//        System.out.println(p1.age + " " + p1.name);
//
//        p1.walk();
//        p1.walk(12);
//
//        p2.eat();
//        p2.walk(1000);
//
//
//
//        Person p3 = new Person(25, "Shivam Kalkar");
//
//        System.out.println(p3.age + " " + p3.name);
//
//        System.out.println(Person.count);

        Developer d1 = new Developer(24, "Erik");

        d1.walk(1000);
        d1.walk();
    }
}


class Person{
    String name;
    int age;

    static int count;



    public Person(){
        count++;
        System.out.println("creating an object");
    }

    public Person(int newAge, String newName){
        this();
        name = newName;
        age = newAge;
    }

    void walk(){
        System.out.println(name + " is walking");
    }
    void eat(){
        System.out.println(name + " is eating");
    }

    void walk(int steps){
        System.out.println(name + " walked " + steps + " steps");
    }

    void doWork(){
        System.out.println(name + " is working");
    }
}

class Developer extends Person{
    public Developer(int age, String name){
        super(age, name);
    }

    void walk(){
        System.out.println("Developer " + name + " is walking");
    }



}
