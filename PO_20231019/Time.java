public class Time {
    public int hours;
    public int minutes;

    public Time addTime(Time otherTime){
        Time returnTime = new Time();
        returnTime.minutes = (this.hours + otherTime.hours) % 60;
        returnTime.hours = (this.minutes + otherTime.minutes) % 24;

        return returnTime;
    }
}
