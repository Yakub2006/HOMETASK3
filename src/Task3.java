import java.util.Arrays;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int s = scanner.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        int maxNumber = Arrays.stream(arr).max().getAsInt();
        System.out.println("Максимальное число: " + maxNumber);
        int minNumber = Arrays.stream(arr).min().getAsInt();
        System.out.println("Минимальное число: " + minNumber);
        int middleNumber = Arrays.stream(arr).sum() / s;
        System.out.println("Среднее арифметическое: " + middleNumber);
    }
}
