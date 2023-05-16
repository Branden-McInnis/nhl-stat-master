/**
 *
 * @author Branden McInnis
 * @date 10/31/22
 *
 */

import java.util.*;

public class NHLStats {
    //creates the list
    private List<PlayerRecord> playerRecords;
    //initalize the list
    public NHLStats(){

        playerRecords = new List<PlayerRecord>();

    }
    //adds new item into the list
    public void add(PlayerRecord record){

       playerRecords.add(record);

    }
    //checks if the list is empty
    public boolean isEmpty(PlayerRecord record){

       return playerRecords.isEmpty();

    }
    //checks if the item is in the list
    public boolean contains(PlayerRecord record){

        return playerRecords.contains(record);

    }
    //gets the first item in the list
    public PlayerRecord first(){

        return playerRecords.first();

    }
    //gets the next item in the list
    public PlayerRecord next(){
        return playerRecords.next();
    }

    //prints all items in the list
    public void enumerate(){

        playerRecords.enumerate();

    }

    public String mostPoints(){
        //initalize the varibles
        int mostGoals = 0;
        int mostAssists = 0;
        int mostPoints = 0;
        String player = "player";
        String team = "team";
        //starts the list at the first item
        PlayerRecord record = playerRecords.first();
        //gos through the list if there is something next
        while(record != null){


            //checks if the player has most points and the most assists combined
            if(record.getGoalsScored() > mostGoals || record.getAssists() > mostAssists) {
                mostGoals = record.getGoalsScored();
                mostAssists = record.getAssists();
                mostPoints = mostAssists + mostGoals;
                player = record.getPlayerName();
                team = record.getTeamName();

            }
            //gets next item in the list
            record = playerRecords.next();

        }
        //prints the variables
        return player + " " + team;

    }

    public String mostPenaltyMinutes(){
        //initializing variables
        int mostPenalty = 0;
        String player = "player";
        String team = "team";
        String position = "position";
        String player2 = "";
        String team2 = "";
        String position2 = "";

        //starts the list at the first item
        PlayerRecord record = playerRecords.first();
        //goes through if there is something next
        while(record != null){
            //checks if the next player has the most penalty minutes
            if(record.getPenaltiesMinutes() > mostPenalty){
                //gets the players attributes and places them into the vars
                mostPenalty = record.getPenaltiesMinutes();
                player = record.getPlayerName();
                team = record.getTeamName();
                position = record.getPosition();

            }
            //checks if there is another player that has the most penalty minutes
            else if(record.getPenaltiesMinutes() == mostPenalty){
                player2 = record.getPlayerName();
                team2 = record.getTeamName();
                position2 = record.getPosition();
            }
            //goes to the next player
            record = playerRecords.next();

        }
        //returns the players attributes
        return player + " " + team + " " + position + "\n" + player2 +
                " " + team2 + " " + position2  ;

    }

    public String mostGameWinningGoals(){
        //initializing variables
        int mostWinning = 0;
        String player = "player";
        String team = "team";
        String position = "position";
        //starts the list at the first item
        PlayerRecord record = playerRecords.first();
        //goes through if there is something next
        while(record != null){
            //checks if the next player has the most goals
            if(record.getGameWinningGoals() > mostWinning){

                mostWinning = record.getGameWinningGoals();
                player = record.getPlayerName();
                team = record.getTeamName();
                position = record.getPosition();

            }
            //goes to the next player
            record = playerRecords.next();

        }
        //gets the player attributes who has the most goals
        return player + " " + team + " " + position ;

    }

    public String mostShotsOnGoal(){
        //initializing variables
        int mostWinning = 0;
        String player = "player";
        String team = "team";
        String position = "position";
        //starts the list at the first item
        PlayerRecord record = playerRecords.first();
        //goes through if there is something next
        while(record != null){
            //checks if the next player has the most shots on goal
            if(record.getShotsOnGoal() > mostWinning){
                //sets the players attributes into the vars
                mostWinning = record.getShotsOnGoal();
                player = record.getPlayerName();

            }
            // gets next player in list
            record = playerRecords.next();

        }
        //returns the player attributes
        return player;

    }

    public String teamMostPenalty(){
        //initializing vars
        String team = "team";
        int mostPenalty = 0;
        //starts list at first item
        PlayerRecord record = playerRecords.first();
        //sets the hashmap for key being string and values being integers
        Map<String, Integer> mostMinutes = new HashMap<>();
        //goes through the list until there is nothing next
        while(record != null){
            //if the team has already been added to the hashmap then add that players minutes to the specific key
            if(mostMinutes.containsKey(record.getTeamName())){

                mostMinutes.put(record.getTeamName(), mostMinutes.get(record.getTeamName()) + record.getPenaltiesMinutes());

            }
            //add the players team to the key in a hashmap
            else{

                mostMinutes.put(record.getTeamName(), record.getPenaltiesMinutes());

            }
            //check which team has the most penalty minutes and sets it accordingly
            if(mostMinutes.get(record.getTeamName()) > mostPenalty){
               mostPenalty = mostMinutes.get(record.getTeamName());
               team = record.getTeamName();

            }
            //gets next item in the list i.e player and their attributes
            record = playerRecords.next();

        }
        //returns the team with the most penalty minutes
        return team;

    }

    public String teamMostGoals(){
        //initializing variables
        String team = "team";
        int mostGoals = 0;
        //starts list at the first item
        PlayerRecord record = playerRecords.first();
        //sets the hashmap for key being string and values being integers
        Map<String, Integer> mostTeamGoals = new HashMap<>();
        //goes through the list until there is nothing next
        while(record != null){
            //if the team has already been added to the hashmap then add that players goals to the specific key
            if(mostTeamGoals.containsKey(record.getTeamName())){

                mostTeamGoals.put(record.getTeamName(), mostTeamGoals.get(record.getTeamName()) + record.getGameWinningGoals());

            }
            //add the players team to the key in a hashmap
            else{

                mostTeamGoals.put(record.getTeamName(), record.getGameWinningGoals());

            }
            //check which team has the most goals and sets it accordingly
            if(mostTeamGoals.get(record.getTeamName()) > mostGoals){
                mostGoals = mostTeamGoals.get(record.getTeamName());
                team = record.getTeamName();

            }
            //gets next players atrributes
            record = playerRecords.next();


        }
        //returns team that has the most goals all together
        return team;

    }


}
