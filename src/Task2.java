public class Task2 {
   public  static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        boolean number = false;
        int x = in.nextInt();
        int i;
        for ( i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100);
            if(x == arr[i]){
                number = true;
            }
        }
        System.out.println(Arrays.toString(arr));
        if (number) {
            arr[i] = 0;
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("No");

        }
    }
}
