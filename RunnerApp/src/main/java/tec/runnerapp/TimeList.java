package tec.runnerapp;

import java.util.ArrayList;

public class TimeList {
    private static ArrayList<Time> times;

    public static ArrayList<Time> getInstance() {
        if (times == null) {
            times = new ArrayList<Time>();
        }
        return times;
    }

    public static void addTime(Time time) {
        getInstance().add(time);
    }
    //retornar tiempo por posicion de lista
    public static Time getTimeByPosition(int position) {
        return getInstance().get(position);
    }
    public static ArrayList<Time> getTimesByName(String name) {
        ArrayList<Time> runnerTimes = new ArrayList<>();
        for (Time time : getInstance()) {
            if (time.getRunner().getName().equals(name)) {
                runnerTimes.add(time);
            }
        }
        return runnerTimes;
    }
}
