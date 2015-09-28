package mx.iteso.observer;

import java.util.ArrayList;

/**
 * Created by Alex on 27/09/2015.
 */
public class SoccerMatch {

    public SoccerTeam homeTeam;
    public SoccerTeam awayTeam;

    public int homeScore;
    public int awayScore;

    private ArrayList<SoccerPlayer> scorers;

    public SoccerMatch(SoccerTeam homeTeam, int homeScore, SoccerTeam awayTeam, int awayScore)
    {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public void addScorer(SoccerPlayer scorer)
    {
        this.scorers.add(scorer);
    }

    @Override
    public String toString()
    {
        return "Score is: " + homeTeam + " " + homeScore + " - " + awayScore + " " + awayTeam;
    }
}
