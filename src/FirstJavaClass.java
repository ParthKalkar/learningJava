import java.util.Scanner;

public class FirstJavaClass {
    public static void main(String[] args){
        System.out.println("Hello World");

//        int age = 18;
//        float averageMarks = 18.245f;
//        char grade = 'A';
//        String name = "Parth";
//        boolean isValid = false;
//        long bigNumber = 999999999999999999l;




//        System.out.println(age);
//        System.out.println(averageMarks);
//        System.out.println(name);
//        System.out.println(isValid);
//        System.out.println(bigNumber);

//        int firstNumber = 123;
//        int secondNumber = 234;
//
//        int sum = firstNumber + secondNumber;
//        System.out.println(sum);
//
//        int diff = firstNumber - secondNumber;
//        System.out.println(diff);
//
//        int div = firstNumber / secondNumber;
//        System.out.println(div);
//
//        int mult = firstNumber * secondNumber;
//        System.out.println(mult);

//        int a = 12;
//        a++;
//        System.out.println(a);
//
//        int b = 13;
//        ++b;
//        System.out.println(b);

        // a++ updates the value in the next line
        // ++a updates the value in the same line

        // taking user input
        Scanner sc = new Scanner((System.in));
//        System.out.println("Enter your age:");
//
//        // primitive data types are the one where the
//        // java has already defined the value
//
//        int age = sc.nextInt();
//        float grade = sc.nextFloat();
//
//        System.out.println(grade/10);
//
//        System.out.println(age * 2);

//        String name = sc.nextLine();
//        System.out.println("Hello " + name);

//        int age = sc.nextInt();
//        if (age > 18){
//            System.out.println("you can vote");
//        } else {
//            System.out.println("you cannot vote");
//        }

//        char grade = sc.next().charAt(0);
//
//        if (grade == 'A'){
//            System.out.println("your grade is very good");
//        } else if (grade == 'B') {
//            System.out.println("very good, keep learning");
//        } else if (grade == 'D') {
//            System.out.println("keep improving");
//        } else  { n
//            System.out.println("invalid grade");
//        }

        // switch case

//        char grade = sc.next().charAt(0);
//
//        switch (grade) {
//            case 'A':
//                System.out.println("your grade is very good");
//                break;
//            case 'B':
//                System.out.println("very good, keep learning");
//                break;
//            case 'D':
//                System.out.println("keep improving");
//                break;
//            default:
//                System.out.println("wrong argument");
//        }

        // for, while, do-while

//        for(int i = 0; i < 5; i++){
//            System.out.println("Parth ");
//        }
//        int a = 11;
//        while (true) {
//            System.out.println(a);
//            a++;
//            if (a > 10){
//                break;
//            }
//        }

//        int a = 1;
//        do{
//            System.out.println(a);
//            a++;
//        } while (a < 10);

        // array

//        int marks[] = new int[5];

//        marks[0] = 23;
//        marks[1] = 12;
//        marks[2] = 56;
//        marks[3] = 23;
//        marks[4] = 12;

//        int marks[] = {23, 25, 26, 12, 13, 14};
//
//        for (int i = 0; i < marks.length; i++){
//            System.out.println(marks[i]);
//        }

//        int a[][] = new int[2][3];

//        int a[][] = {
//                {
//                    1, 2
//                }, {
//                    3, 4
//        }
//        };
//
//        System.out.println(a[0][1]);

        // method

        // returnType functionName (arguments) {}

        System.out.println(average(1, 2));

    }

    static int average(int firstNumber, int secondNumber){
        int sum =  firstNumber + secondNumber;
        return  sum/2;

    }
}
