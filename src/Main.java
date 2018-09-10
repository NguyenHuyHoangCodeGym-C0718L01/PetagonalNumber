import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Menu:");
        System.out.println("1 - Get the petagonal Number");
        System.out.println("0 - exit");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.print("Input choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    System.out.print("Input the range: ");
                    int n = scanner.nextInt();
                    System.out.println("The petagonal number: "+getPentagonalNumber(n));
                    break;
                }
                case 0:{
                    System.exit(0);
                }
            }
        }while (choice != 0);
    }

    public static int getPentagonalNumber(int n){
        return ((n*((3*n) - 1))/2);
    }
}
