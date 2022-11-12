import java.util.Scanner;

public class invertedTriangle {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Number of Digit : ");
            int digit = scanner.nextInt();

            for(int i=0; i<=digit; i++){
                for (int j=0; j<i; j++){
                    System.out.print(" ");
                }
                for (int k=0; k<(2*digit-(2*i+1)); k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
