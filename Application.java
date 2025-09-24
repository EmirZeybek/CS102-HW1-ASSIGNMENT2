
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// public class MethodE{
//     int[] sayi;
    
//     public MethodE(int[] sayi){
//         this.sayi = sayi;
//     }

//     public int sumEven(){
//         int sum=0;
//         for(int i=0; i<sayi.length; i=+2){
//             sum = sum + sayi[i];
//         }
//         return sum;
//     }

//     public int sumOdd(){
//         int sum=0;
//         for(int i=1; i<sayi.length; i=+2){
//             sum = sum + sayi[i];
//         }
//         return sum;
//     }
// }
public class Application{

    public static int[] getNumbers(int number){
        Random rand = new Random();
        int[] x= new int[number];
        for (int i = 0; i < number; i++){
            x[i] = rand.nextInt(101);
        }
        return x;
    }
    public static int findMin(int[] a){
        int min = Integer.MAX_VALUE;
        for (int i : a) {
            if( i < min ){
                i = min;
            }
        }
        return min;
    }


    public static int findMax(int[] a){
        int max = Integer.MIN_VALUE;
        for (int i : a) {
            if( i > max ){
                i = max;
            }
        }
        return max;
    }

    public static int sumEven(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i=i+2){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int sumOdd(int[] arr ){
        int sum=0;
        for(int i=1; i<arr.length; i=i+2){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int[] findDiffrence(int[]array){
        int sum=0;
        int[] avarageDiffrence;  
        avarageDiffrence=new int[array.length];
        for(int x=0;x <array.length;x++ ) {
            sum+=array[x]; 
        }
        int avarage=sum/array.length; 

        for(int z=0;z<array.length;z++){
        avarageDiffrence[z]= array[z]-avarage;
        }

        
        return avarageDiffrence;
    }


    
   

public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    boolean exit = false;

    System.out.println("Welcome to the program.");
    System.out.print("Write the size of the array: ");
    

        
    int input = in.nextInt();
    int [] numbers = getNumbers(input);
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
            System.out.println(Arrays.toString(numbers));

        }
        if(inpt == 2){
            System.out.println("Minimum integer: " + findMin(numbers));
        }
        if(inpt == 3){
            System.out.println("Maximum integer: " + findMax(numbers));
        }
        if(inpt == 4){
            System.out.println("The avarage diffrence is: " + Arrays.toString(findDiffrence(numbers)));

        }
        if(inpt == 5){
             System.out.println("Sum of the odd numbers: " + sumOdd(numbers));

        }
        if(inpt == 6){
             System.out.println("Sum of the even numbers: " + sumEven(numbers));

        }
        if(inpt == 7){
            exit = true;

        }







    }

    System.out.println("Program finished");








}























}