package mx.iteso.observer;

enum SoccerPosition
{
    GOALIE,
    LEFT_BACK,
    CENTER_BACK,
    RIGHT_BACK,
    CENTER_MID,
    LEFT_WING,
    RIGHT_WING,
    LEFT_FORWARD,
    RIGHT_FORWARD
};

public class SoccerPlayer
{
    public String name;
    public int number;
    public SoccerPosition position;

    public SoccerPlayer(String name, int number, SoccerPosition position)
    {
        this.name = name;
        this.number = number;
        this.position = position;
    }
}
