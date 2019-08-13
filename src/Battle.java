public class Battle {
    public static void battle() {
        System.out.println("Are you ready for the battle??\nHere is how your ships look like... ");
        Intro.printMap();
        System.out.println("\n-*- The battle started -*-");
        System.out.println("Your ships: " + Deploy.playerShips + " | Computer's ships: " + Deploy.computerShips + "\n************************************");

        while(Deploy.playerShips > 0 && Deploy.computerShips > 0){
            Turn.playerTurn();
            Turn.computerTurn();
            Intro.printMap();
            System.out.println("Your ships: " + Deploy.playerShips + " | Computer's ships: " + Deploy.computerShips + "\n************************************");
        }
        if (Deploy.playerShips == 0) {
            System.out.println("*** GAME OVER ***");
            System.out.println("Your ships: " + Deploy.playerShips + " | Computer's ships: " + Deploy.computerShips + "\n************************************");
            System.out.println("YOU LOSE!!!");
        } else if (Deploy.computerShips == 0) {
            System.out.println("HOORAY! YOU WIN!!!");
            System.out.println("Your ships: " + Deploy.playerShips + " | Computer's ships: " + Deploy.computerShips + "\n************************************");
        }
    }
}
