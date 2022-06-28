
import java.util.Scanner;

public class Main {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choise;
        do{
        System.out.println("Please select, which task to execute 1-6 (7 to stop executing): ");
         choise = sc.nextInt();
        switch (choise) {
            case 1 -> numbersChecking();
            case 2 -> booleanChecking();
            case 3, 4 -> evenNumberCheck();
            case 5 -> reverseBooleanValue();
            case 6 -> twoNumbersConditionCheck();
            case 7 -> choise=100;
            default -> System.out.println("Wrong Input, try again...");
        }
       }while(choise>=1 && choise <=6);
    }


   static  void numbersChecking(){
        System.out.println("Please, input 2 values \na = ");
        int a = sc.nextInt();
        System.out.println("b = ");
        int b = sc.nextInt();
        System.out.println("is "+a+" equal to "+b+"? - "+ (a==b));
        System.out.println("is "+a+" less to "+b+"? - "+ (a<b));
        System.out.println("is "+a+" less or equal to "+b+"? - "+ (a<=b));
        System.out.println("is "+a+" greater than "+b+"? - "+ (a>b));
        System.out.println("is "+a+" greater or equal to "+b+"? - "+ (a>=b));
    }

    static void booleanChecking(){
        System.out.println("Please, input 2 boolean values (true or false only!!)\nb1 = ");
        boolean b1= sc.nextBoolean();
        System.out.println("b2 = ");
        boolean b2 = sc.nextBoolean();
        System.out.println("Is b1 equal to b2? - "+(b1==b2));
    }

    static void evenNumberCheck(){
        System.out.println("Enter a whole number: ");
        int numberToCheck = sc.nextInt();
        if(numberToCheck%2==0){
            System.out.println("Is "+numberToCheck+" even number? - true");
        }else {
            System.out.println("Is "+numberToCheck+" even number? - false");
        }
    }

    static void reverseBooleanValue(){
        System.out.println("Enter a boolean value (true or false): ");
        boolean valueToReverse  = sc.nextBoolean();
        System.out.println("Opposite of "+valueToReverse+" is "+ !valueToReverse);
    }

    static void twoNumbersConditionCheck(){
        System.out.println("Enter 2 whole numbers: a = ");
        int a = sc.nextInt();
        System.out.println("b = ");
        int b = sc.nextInt();
        System.out.println("Based on at least 1 of 3 conditions:" +
                "\n1) a and b is equal"+
                "\n2) a is less than 0 and b is greater than 0)"+
                 "\n3) both of them are greater than 100 \nVerdict is "+
                ((a==b) || ((a<0)&&(b>0)) || ((a>100)&&(b>100))));
    }
}