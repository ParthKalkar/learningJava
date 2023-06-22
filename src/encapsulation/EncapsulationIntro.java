package encapsulation;

public class EncapsulationIntro {

    public  static void main(String[] args){

        Laptop l1 = new Laptop();
        l1.setPrice(32);

        System.out.println(l1.getPrice());


    }

    public void doWork(){
        System.out.println("working working");
    }


}

class Laptop{

    int ram;
    private int price;

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        boolean isAdmin = true;
        if(!isAdmin){
            System.out.println("you cannot set the price");
        } else {
            this.price = price;
        }
    }

}
