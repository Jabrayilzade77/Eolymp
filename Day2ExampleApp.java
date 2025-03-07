
public class Day2ExampleApp {

    public static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            int[] arr = new int[4];
            for (int index = 0; index < 4; index++) {
                arr[index] = (int) (Math.random() * 100);
            }
            printArray(arr);
            System.out.println("");
        }

    }
}
