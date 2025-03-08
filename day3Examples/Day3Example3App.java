package day3Examples;

import java.util.Scanner;

public class Day3Example3App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long a = scan.nextInt();
        long b = scan.nextInt();
        long sum = ((b - a + 1) * (a + b)) / 2 ;

        System.out.print(sum);
    }
}
