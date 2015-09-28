package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import mx.iteso.observer.SoccerMatch;
import mx.iteso.observer.Subject;

import java.util.ArrayList;

public class ScoresData implements Subject {
    private ArrayList<Observer> observers;
    private SoccerMatch match;


    public ScoresData(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.match);
        }
    }

    public void newScore(){
        notifyObservers();
    }

    public void setScore(SoccerMatch match){
        this.match = match;
        newScore();
    }
}
