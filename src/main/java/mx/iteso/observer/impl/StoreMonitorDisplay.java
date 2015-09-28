package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.SoccerMatch;
import mx.iteso.observer.Subject;

public class StoreMonitorDisplay implements Observer, Displayable {
    private SoccerMatch match;

    private Subject scoresData;

    public StoreMonitorDisplay(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }

    public void display() {
        System.out.println("STORE MONITOR DISPLAY:");
        System.out.println("\t"+match);
    }

    public void update(SoccerMatch match) {
        this.match = match;
        display();
    }

}
