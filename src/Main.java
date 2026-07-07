public class Main {

    public static void main(String[] args) {
        // This is my first java program
//System.out.println("I like chicken!");
//System.out.println("It's really juicy!");
//System.out.print("Give some more of that legs!");


        int year = 2026;


        //next datatype is double-:

        double price = 19.99;
        double gpa = 5.4;
        double temperature = -12.5;

        //char
        char gender = 'M';
        char symbol = '!';
        char currency = '$';

        //bollean

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;
        boolean ispickupneeded = false;;

        String name = "Tanmay";
        String food = "Chusta";
        String email = "fweah.tanmay@gmail.com";
        String car = "bugatti chiron";
        String age = "22";
        String Contact = "9650706135";
        System.out.println("Hello " + name + " your order is placed successfully.");
        System.out.println("You have successfully made payment for " + car);
        System.out.println("Your registered email id is " + email);
        System.out.println("Your registered mobile number is " + Contact);
        System.out.println("Married = " + ispickupneeded);
        System.out.println("Our team will contact you shortly for confirming delivery slot");

        if(forSale){
            System.out.println("There is a " + car + " available in stock for dispatch in 3 days!");
        }
     else{
         System.out.println("The " + car + " is not for sale");
        }
    }}

