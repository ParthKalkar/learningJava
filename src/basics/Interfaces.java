package basics;

public class Interfaces implements Cars {

    public static void main(String[] args) {
        Interfaces c = new Interfaces();
        c.start();

    }


    @Override
    public void start() {
        System.out.println("my car is starting");

    }
}

interface Cars{
    void start();

}
