/**
 *
 * @author Branden McInnis
 * @date 10/31/22
 *
 */

import java.util.*;
public class PlayerRecord {

    private String playerName;
    private String Position;
    private String teamName;
    private int gamesPlayed;
    private int goalsScored;
    private int Assists;
    private int penaltiesMinutes;
    private int shotsOnGoal;
    private int gameWinningGoals;

    public PlayerRecord(String playerName, String Position, String teamName, int gamesPlayed, int goalsScored, int Assists, int penaltiesMinutes, int shotsOnGoal, int gameWinningGoals){
        this.playerName = playerName;
        this.Position = Position;
        this.teamName = teamName;
        this.gamesPlayed = gamesPlayed;
        this.goalsScored = goalsScored;
        this.Assists = Assists;
        this. penaltiesMinutes = penaltiesMinutes;
        this.shotsOnGoal = shotsOnGoal;
        this.gameWinningGoals = gameWinningGoals;
    }


    @Override
    public String toString() {
        return "PlayerRecord{" +
                "playerName='" + playerName + '\'' +
                ", Position='" + Position + '\'' +
                ", teamName='" + teamName + '\'' +
                ", gamesPlayed=" + gamesPlayed +
                ", goalsScored=" + goalsScored +
                ", Assists=" + Assists +
                ", penaltiesMinutes=" + penaltiesMinutes +
                ", shotsOnGoal=" + shotsOnGoal +
                ", gameWinningGoals=" + gameWinningGoals +
                '}';
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPosition(){
        return Position;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getAssists() {
        return Assists;
    }

    public int getPenaltiesMinutes() {
        return penaltiesMinutes;
    }

    public int getShotsOnGoal() {
        return shotsOnGoal;
    }

    public int getGameWinningGoals() {
        return gameWinningGoals;
    }


}
