
import java.util.Scanner;

public class Application{


public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    boolean exit = false;

    System.out.println("Welcome to the program.");
    System.out.print("Write the size of the array: ");

    int input = in.nextInt();
    System.out.println();

    while(!exit){

        
        System.out.println("1) See the created array");
        System.out.println("2) See the  minimum of the array");
        System.out.println("3) See the  maximum of the array");
        System.out.println("4) See  how each element of the array differs from the average");
        System.out.println("5) See the sum of odd numbers");
        System.out.println("6) See the sum of even numbers");
        System.out.println("7) To exit ");


        System.out.print("Select option: ");
        int inpt = in.nextInt();

        if(inpt == 1){
            

        }
        if(inpt == 2){
            

        }
        if(inpt == 3){
            

        }
        if(inpt == 4){
            

        }
        if(inpt == 5){
            

        }
        if(inpt == 6){
            

        }
        if(inpt == 7){
            exit = true;

        }







    }

    System.out.println("Program finished");








}























}