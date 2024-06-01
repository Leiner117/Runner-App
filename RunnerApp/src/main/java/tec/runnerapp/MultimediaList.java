package tec.runnerapp;

import java.util.ArrayList;

public class MultimediaList {
    private static ArrayList<Multimedia> multimedia;

    public static ArrayList<Multimedia> getInstance() {
        if (multimedia == null) {
            multimedia = new ArrayList<Multimedia>();
        }
        return multimedia;
    }

    public static void addMultimedia(Multimedia multimedia) {
        getInstance().add(multimedia);
    }

    //funcion para retornar multimedia por posicion de lista
    public static Multimedia getMultimediaByPosition(int position) {
        return getInstance().get(position);
    }

    public static ArrayList<Multimedia> getMultimediaByRunnerName(String name) {
        ArrayList<Multimedia> runnerMultimedia = new ArrayList<>();
        for (Multimedia multimedia : getInstance()) {
            if (multimedia.getRunner().getName().equals(name)) {
                runnerMultimedia.add(multimedia);
            }
        }
        return runnerMultimedia;
    }
}
