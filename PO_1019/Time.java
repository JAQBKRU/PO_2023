import java.time.LocalTime;

public class Time {
    public int hours;
    public int minutes;

    public Time addTime(Time otherTime){
        int h = this.hours + otherTime.hours;
        int m = this.minutes + otherTime.minutes;
        Time returnTime = new Time();

        returnTime.minutes = minutes % 60;
        returnTime.hours = hours % 24;

        return returnTime;
    }
}
