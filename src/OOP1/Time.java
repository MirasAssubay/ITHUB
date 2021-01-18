package OOP1;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time nextSecond(){
        if (second == 59) {
            if (minute == 59) {
                if(hour == 23) {
                    hour = 0;
                    minute = 0;
                    second = 0;
                }
                else {
                    ++hour;
                    minute = 0;
                    second = 0;
                }
            }
            else {
                ++minute;
                second = 0;
            }
        }
        else ++second;
        return this;
    }

    public Time previousSecond(){
        if(this.second > 0){
            this.second = this.second - 1;
            return this;
        }

        this.second = 59;
        this.minute--;

        if(this.minute > 0){
            return this;
        }

        this.minute = 59;
        this.hour--;

        if(this.hour > 0) {
            return this;
        }

        this.hour = 23;

        return this;
    }

    public String toString(){
        return "OOP1.Time: " + hour + ":" + minute + ":" + second;
    }

}
