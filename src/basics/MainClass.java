package basics;

public class MainClass {

    public static void main(String[] args){
        System.out.println("World Class");

        Person p1 = new Person();
        p1.age = 24;
        p1.name = "Parth";

        System.out.println(p1.age + " " + p1.name);

        p1.walk();
        p1.walk(12);
    }
}

class Person{
    String name;
    int age;

    void walk(){
        System.out.println(name + " is walking");
    }
    void eat(){
        System.out.println(name + " is eating");
    }

    void walk(int steps){
        System.out.println(name + " walked " + steps + " steps");
    }
}
