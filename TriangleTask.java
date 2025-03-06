import java.util.Scanner;

public class TriangleTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
         int a = scan.nextInt();

        if(a  >= 3 && a <= 5){
            System.out.println("Spring");
        }
        else if(a  >= 6 && a <= 8){
            System.out.println("Summer");
        }
        else if(a  >= 9 && a <= 11){
            System.out.println("Autumn");
        }
        else{
            System.out.println("Winter");
        }
         */

        /*
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        if((a % 2 == 0 || b % 2 == 0 || c % 2 == 0) && (a % 2 == 1 || b % 2 == 1 || c % 2 == 1)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
         */

        /*
        int a = scan.nextInt();

        if(a  >= 3 && a <= 5){
            System.out.println("Second");
        }
        else if(a  >= 6 && a <= 8){
            System.out.println("Third");
        }
        else if(a  >= 9 && a <= 11){
            System.out.println("Fourth ");
        }
        else{
            System.out.println("First");
        }
         */

       /*
        int n = scan.nextInt();

        switch (n) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;


        }
        */

       /*
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a < b) {
            System.out.println(a + " " + b);
        }
        else {
            System.out.println(b + " " + a);
        }
        */

      /*
        int a = scan.nextInt();

        int x = a / 1000;
        int y = a / 100 % 10;
        int z = a / 10 % 10;
        int w = a % 10;

        if((x == 3 && y == 7 )|| (y == 3 && z == 7) || (z == 3 && w == 7)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
       */

      /*
            int n = scan.nextInt();

            int x = n / 1000;
            int y = n / 100 % 10;
            int z = n / 10 % 10;
            int w = n % 10;

            if(x % 2 == 0 && y % 2 == 0 && z % 2 == 0 && w % 2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
       */


       /*
        int n = scan.nextInt();

        int x = n / 1000;
        int y = n / 100 % 10;
        int z = n / 10 % 10;
        int w = n % 10;

        if(x % 2 != 0 || y % 2 != 0 || z % 2 != 0 || w % 2 != 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        */

      /*
        int n = scan.nextInt();
        String stringN = String.valueOf(n);

        if(n % 2 != 0 || (n >= 0 && stringN.length() == 3)) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
       */

        /*
        int n = scan.nextInt();
        String stringN = String.valueOf(n);

        if(n % 3 == 0 && n % 2 == 0 && ((n >= 10 && n <= 99) || (n < -10 && n >= -99))) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
         */

       /*
        int n = scan.nextInt();

        if((n % 2 == 0 && n >= 0) || (n % 2 != 0 && n <= 0)){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
        */


        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        boolean isPositive = a >= 0 || b >= 0 || c >= 0;
        boolean isNegative = a < 0 || b < 0 || c < 0;

        if(isPositive && isNegative){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        }
}
