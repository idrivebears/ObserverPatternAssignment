package mx.iteso.observer;

import java.util.ArrayList;

/**
 * Created by Alex on 27/09/2015.
 */
public class SoccerTeam {
    public String name;
    public int ranking;
    ArrayList<SoccerPlayer> teamMembers;

    public SoccerTeam(String name)
    {
        this.name = name;
    }

    public void setRanking(int ranking)
    {
        this.ranking = ranking;
    }

    public void addPlayer(SoccerPlayer player)
    {
        this.teamMembers.add(player);
    }

    @Override
    public String toString()
    {
        return "(" + ranking + ") " + name;
    }

}
