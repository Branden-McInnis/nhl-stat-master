/**
 *
 * @author Branden McInnis
 * @date 10/31/22
 *
 */

import java.io.*;
import java.util.Scanner;

public class NHLListDemo {

    public static void main(String[] args) throws IOException {
        //initializing scanner
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the filename to read from: ");
        String filename = k.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        NHLStats playerRecords = new NHLStats();

        String playerName;
        String Position;
        String teamName;
        int gamesPlayed;
        int goalsScored;
        int Assists;
        int penaltiesMinutes;
        int shotsOnGoal;
        int gameWinningGoals;

        PlayerRecord record = null;

        while(inputFile.hasNext()){

            playerName = inputFile.next();
            Position = inputFile.next();
            teamName = inputFile.next();
            gamesPlayed = inputFile.nextInt();
            goalsScored = inputFile.nextInt();
            Assists = inputFile.nextInt();
            penaltiesMinutes = inputFile.nextInt();
            shotsOnGoal = inputFile.nextInt();
            gameWinningGoals = inputFile.nextInt();

            record = new PlayerRecord(playerName, Position, teamName, gamesPlayed, goalsScored, Assists, penaltiesMinutes, shotsOnGoal, gameWinningGoals);
            playerRecords.add(record);


        }

        inputFile.close();
        try {
            File answers =new File("nhlstatsoutput.txt");
            FileWriter myWriter = new FileWriter(answers);
            PrintWriter myPrinter = new PrintWriter(myWriter);
            myPrinter.println("NHL Results Summary");
            myPrinter.println("Players with highest points and their teams:");
            myPrinter.println(playerRecords.mostPoints());
            myPrinter.println("\nMost aggressive players, their teams and their positions:");
            myPrinter.println(playerRecords.mostPenaltyMinutes());
            myPrinter.println("\nMost valuable players and their teams:");
            myPrinter.println(playerRecords.mostGameWinningGoals());
            myPrinter.println("\nMost promising players and their teams:");
            myPrinter.println(playerRecords.mostShotsOnGoal());
            myPrinter.println("\nTeams that had the most number of penalty minutes:");
            myPrinter.println(playerRecords.teamMostPenalty());
            myPrinter.println("\nTeams that had the most number of game winning goals:");
            myPrinter.println(playerRecords.teamMostGoals());
            myPrinter.close();

        }

        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }




    }

}
