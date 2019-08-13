import java.util.Random;
import java.util.Scanner;

public class Deploy {
    public static Scanner input = new Scanner (System.in);
    public static Random rand = new Random();
    public static String[][] ocean2 = new String[10][10];
    public static String[][] ocean = new String[10][10];
    public static int playerShips = 0;
    public static int computerShips = 0;


    public static void playerDeploy(){
        System.out.println("\nDeploy your ships... ");
        while(playerShips < 5){
            System.out.print("-> Enter X coordinate for your " + (playerShips + 1) + ". ship: ");
            int row = input.nextInt();
            System.out.print("-> Enter Y coordinate for your " + (playerShips + 1) + ". ship: ");
            int col = input.nextInt();

            if(row > 9 || col > 9) {
                System.out.println("The coordinate you entered is out of range, please try again..");
            } else if (ocean[col][row] != null) {
                System.out.println("The coordinate you entered is already used, please try again...");
            } else {
                ocean[row][col] = "@";
                playerShips++;
            }
        }
    }

    public static void compDeploy(){
        System.out.println("\nThe COMPUTER is deploying its ships...");

        while(computerShips < 5){
            int row2 = rand.nextInt(10);
            int col2 = rand.nextInt(10);

            if(ocean2[row2][col2] == null){
                System.out.println((computerShips + 1) + ". ship deployed!");
                ocean2[row2][col2] = "@";
                computerShips++;
            }
        }
        System.out.println("************************************");
    }
}
