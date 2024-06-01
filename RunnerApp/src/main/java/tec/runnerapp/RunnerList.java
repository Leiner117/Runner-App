package tec.runnerapp;

import java.util.ArrayList;

public class RunnerList {
    private static ArrayList<Runner> runners;

    public static ArrayList<Runner> getInstance() {
        if (runners == null) {
            runners = new ArrayList<Runner>();
        }
        return runners;
    }

    public static void addRunner(Runner runner) {
        getInstance().add(runner);
    }

    public static Runner getRunnerByName(String name) {
        for (Runner runner : getInstance()) {
            if (runner.getName().equals(name)) {
                return runner;
            }
        }
        return null;
    }
    public static Runner getRunnerByEmail(String email) {
        for (Runner runner : getInstance()) {
            if (runner.getEmail().equals(email)) {
                return runner;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        //ciclo for que recorre la lista para imprimirla
        for (Runner runner : getInstance()) {
            System.out.println(runner);
        }
        return "";
    }
}
