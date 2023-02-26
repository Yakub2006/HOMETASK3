import java.util.Arrays;


public class Task4 {
  public static void main(String[] args){
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++){
            arr1[i] = (int) (Math.random() * 10);
            arr2[i] = (int) (Math.random() * 10);
        }
        int midNum1 = Arrays.stream(arr1).sum() / 5;
        int midNum2 = Arrays.stream(arr2).sum() / 5;
        if (midNum1 > midNum2){
            System.out.println("БОЛЬШЕ");
        }
        else if(midNum1 < midNum2){
            System.out.println("МЕНЬШЕ");
        }
        else{
            System.out.println("РАВНЫ");
        }
    }
}
