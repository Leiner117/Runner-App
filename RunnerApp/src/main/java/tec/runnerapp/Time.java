package tec.runnerapp;

public class Time {
    private String segment;
    private long time;
    private Runner runner;

    public Time(String segment, long time, Runner runner) {
        this.segment = segment;
        this.time = time;
        this.runner = runner;
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

    public Runner getRunner() {
        return runner;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
    }
}
