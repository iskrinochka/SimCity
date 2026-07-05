package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BuildingType[] city = {
                new Wohnung("Wohnung", 500, "🏠"),
                new Gewerbe("Gewerbe", 1000, "🏬"),
                new Industrie("Industrie", 2000, "🏭"),
                new Infastruktur("Polizei", 5000, "🚔"),
                new Infastruktur("Feuerwehr", 4000, "🚒"),
                new Infastruktur("Spital", 6000, "🏥")
        };

        // information about buildings
        for (BuildingType b : city) {
            System.out.println(b.showInfo());
        }

        System.out.println("Commands:");
        System.out.println("- q... quit Game");
        System.out.println("- r... Residential zone");
        System.out.println("- c... Commercial zone");
        System.out.println("- i... Industrial zone");
        System.out.println("- h... Hospital");
        System.out.println("- p... Police deparment");
        System.out.println("- f... Fire department");
        System.out.println("- pk... Park");
        System.out.println("- po... Power plant");
        System.out.println("- pl... Power line");
        System.out.println("- u... Show power grid");
        System.out.println("- f... Finish round");
        System.out.println("Coordinates (X, Y): ");

        //create game board
        Game game = new Game();
        game.printGameBoard();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.next();

            if (command.equals("q")) {
                System.out.println("Game Over.");
                break;
            }

            // Entering coordinates
            System.out.print("Enter coordinates (X Y): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            //  define the symbol of the building on command
            String symbol = switch (command) {
                case "h" -> "🏥"; // Hospital
                case "p" -> "🚔"; // Police
                case "r" -> "🏠"; // Residential
                case "c" -> "🏬"; // Commercial
                case "i" -> "🏭"; // Industrial
                case "f" -> "🚒"; // Fire department
                case "pk" -> "🌳"; // Park
                case "po" -> "♨︎"; // Power plant
                case "pl" -> "🔌"; // Power line
                default -> null;
            };

            if (symbol != null) {
                game.placeBuilding(x, y, symbol);
            } else {
                System.out.println("Invalid command!");
            }

            // Output of the updated field
            game.printGameBoard();
        }

        scanner.close();
    }
}