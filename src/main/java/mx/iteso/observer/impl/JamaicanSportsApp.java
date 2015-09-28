package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.SoccerMatch;
import mx.iteso.observer.Subject;

/**
 * Created by Alex on 27/09/2015.
 */
public class JamaicanSportsApp implements Displayable, Observer{

    private Subject scoresData;
    private SoccerMatch match;

    public JamaicanSportsApp(ScoresData scoresData)
    {
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }

    public void stopUpdates()
    {
        this.scoresData.removeObserver(this);
    }

    public void display()
    {
        System.out.println("APP STATUS:");
        System.out.println("\t"+match);
    }

    public void update(SoccerMatch match)
    {
        this.match = match;
        display();
    }
}
