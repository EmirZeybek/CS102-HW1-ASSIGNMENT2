public class MethodD{
    private int sum;
    private int[] avarageDiffrence;

    public int findAvarage(int[] array){
        sum=0; 
        for(int x=0;x <array.length;x++ ) {
            sum+=array[x];
        }
        return sum;

    }

    public int[] findDiffrence(int[]array){
        sum=0; 
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
   
}