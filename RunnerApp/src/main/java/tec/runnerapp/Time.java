package tec.runnerapp;

public class Time {
    private String segment;
    private long time;

    public Time(String segment, long time) {
        this.segment = segment;
        this.time = time;
    }

    // Getters and Setters

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
