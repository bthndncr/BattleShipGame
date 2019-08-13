public class Intro {
    public static void intro(){
        System.out.println("\n**** WELCOME TO THE BATTLE SHIP GAME ****");
        System.out.println("\nRight now, the ocean is empty.\n");
        printMap();
    }

    public static void printMap(){
        System.out.println("\n  0123456789  ");

        for(int row = 0; row < Deploy.ocean.length; row++){ //Create the numbers on the grid:
            System.out.print(row+"|");
            for (int col= 0; col < Deploy.ocean[row].length;col++){
                if(Deploy.ocean[row][col] == null){
                    System.out.print(" ");
                } else {
                    System.out.print(Deploy.ocean[row][col]);
                }
            }
            System.out.println("|" + row);
        }
        System.out.println("  0123456789  ");
    }

/// OPTIONAL COMPUTERS SHIPS

    //    public static void printMap2(String[][] ocean2){
//        // for computer's ships
//        System.out.println("Ocean Map 2");
//        System.out.println("\n  0123456789  ");
//
//        for(int row2 = 0; row2 < ocean.length; row2++){ //Create the numbers on the grid:
//            System.out.print(row2+"|");
//            for (int col2= 0; col2 < ocean[row2].length;col2++){
//                if(ocean[row2][col2] == null){
//                    System.out.print(" ");
//                } else {
//                    System.out.print(ocean[row2][col2]);
//                }
//            }
//            System.out.println("|" + row2);
//        }
//        System.out.println("  0123456789  ");
//    }
}
