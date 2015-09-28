package mx.iteso.observer;

import mx.iteso.observer.impl.JamaicanSportsApp;
import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);

        JamaicanSportsApp jamaicanSportsApp = new JamaicanSportsApp(scoresData);

        SoccerTeam intel = new SoccerTeam("Intel Iguanas");
        intel.setRanking(6);
        SoccerTeam tacit = new SoccerTeam("Tacit Tasmanians");
        tacit.setRanking(4);

        scoresData.setScore(new SoccerMatch(intel, 0, tacit, 0));

        scoresData.setScore(new SoccerMatch(intel, 0, tacit, 1));
        scoresData.setScore(new SoccerMatch(intel, 1, tacit, 1));

        jamaicanSportsApp.stopUpdates();

        scoresData.setScore(new SoccerMatch(intel, 1, tacit, 2));
        scoresData.setScore(new SoccerMatch(intel, 1, tacit, 3));
    }
}
