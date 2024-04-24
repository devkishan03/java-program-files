public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int sec) {
        hour = 0;
        minute = 0;
        setSecond(sec);
    }

    public Time(int min, int sec) {
        hour = 0;
        setMinute(min);
        setSecond(sec);

    }

    public Time(int hour, int min, int sec) {
        setHour(hour);
        setMinute(min);
        setSecond(sec);
    }

    public void setHour(int hour) {
        if (hour > 0 && hour < 24) {
            this.hour = hour;
        } else {
            System.err.println("Hour must be range b/w 0-23");
            System.exit(1);
        }

    }

    public void setMinute(int min) {
        if (min > 0 && min < 60) {
            minute = min;
        } else {
            System.err.println("Minute must be range b/w 0-59");
            System.exit(1);
        }
    }

    public void setSecond(int sec) {
        if (sec > 0 && sec < 60) {
            second = sec;
        } else {
            System.err.println("Second must be range b/w 0-59");
            System.exit(1);
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }

    public static void main(String[] args) {
        // Time t = new Time();
        // t.setHour(23);
        // t.setMinute(35);
        // t.setSecond(55);

        Time t = new Time(2, 5, 6);
        t.displayTime();
    }
}
