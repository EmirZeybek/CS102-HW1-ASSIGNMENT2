import java.util.Scanner;

public class MethodE{

    /** public static void main(String[] args) {
        
        int[] sayi = {1,2,3,4,5,6};
        int indeks = sayi.length;
        int odd=0;
        int even=0;

        for(int i = 0 ;i<indeks;i++){
            if(i%2==0){
                even = even+ sayi[i];
            }
            else{
                odd = odd + sayi[i];
            }
        }
        System.out.println(even+" "+odd); 
    } */
    int[] sayi;
    
    public MethodE(int[] sayi){
        this.sayi = sayi;
    }

    public int sumEven(){
        int sum=0;
        for(int i=0; i<sayi.length; i=+2){
            sum = sum + sayi[i];
        }
        return sum;
    }

    public int sumOdd(){
        int sum=0;
        for(int i=1; i<sayi.length; i=+2){
            sum = sum + sayi[i];
        }
        return sum;
    }
}