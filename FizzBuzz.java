import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //This is a Fizz and Buzz game

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int number = scanner.nextInt();

        for(int i = 1; i <= number; i++){
            if(i%5 == 0 && (i%3) == 0) {

                System.out.println("FizzBuzz");
            }
                else if(i%5 == 0) {
                System.out.println("Buzz");
            }
                else if (i%3 == 0) {
                System.out.println("Fizz");
            }
                else {
                System.out.println(i + " ");
            }





        }





        }
    }

