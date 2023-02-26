import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Инициализация массива
        int[] arr = new int[10];
        //Флаг для будущей работы с числом в массиве
        boolean number = false;
        //Переменная информация про которую берется с консоли
        int x = in.nextInt();
        //Заполняем рандомно массив
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10);
            //Сравнение нашего числа с элементами массива
            if(x == arr[i]){
                number = true;
            }
        }
        //Выводим массив
        System.out.println(Arrays.toString(arr));
        //И последнее сравнение если число есть ришем да, а если нет, то нет
            if (number == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");

        }
    }
}
