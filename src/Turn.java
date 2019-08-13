public class Turn {

    public static void playerTurn(){
        System.out.println("Your turn!");
        int turn = 0;

        while (turn == 0){
            System.out.print("Enter your X coordinate: \n");
            int row2 = Deploy.input.nextInt();
            System.out.print("Enter your Y coordinate: ");
            int col2 = Deploy.input.nextInt();

            if(row2 > 9 || col2 > 9 ){  // you cant shoot outside of the 10 by 10 grid
                System.out.println("The coordinate you entered is out of range, please try again.\n");
            } else if(Deploy.ocean2[row2][col2] == "@") {
                System.out.println("Boom! You sunk the computer's ship!");
                Deploy.ocean2[row2][col2] = "X";
                Deploy.computerShips--;
                turn++;
            } else if (Deploy.ocean2[row2][col2] == "-" || Deploy.ocean2[row2][col2] == "X") {
                System.out.println("The coordinate you entered was already used, please try again.\n");
            } else {
                System.out.println("Sorry, you missed!");
                Deploy.ocean2[row2][col2] = "-";
                turn++;
            }
        }
    }

    public static void computerTurn(){
        System.out.println("-----------------");
        System.out.println("Computer's turn!");
        int turn = 0;

        while(turn == 0){
            int row = Deploy.rand.nextInt(10);
            int col = Deploy.rand.nextInt(10);

            if(Deploy.ocean[row][col] == "@") {
                System.out.println("The computer sunk one of your ships!");
                Deploy.ocean[row][col] = "X";
                Deploy.playerShips--;
                turn++;
            } else if (Deploy.ocean[row][col] == "X" || Deploy.ocean[row][col] == "-"){

            } else {
                System.out.println("Computer missed!");
                Deploy.ocean[row][col] = "-";
                turn++;
            }
        }
    }
}
