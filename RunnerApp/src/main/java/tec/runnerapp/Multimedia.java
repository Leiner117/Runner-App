package tec.runnerapp;

import java.io.File;

public class Multimedia {
    private Runner runner; // Photo 
    private File photo;

    public Multimedia(Runner runner, File photo) {
        this.runner = runner;
        this.photo = photo;
    }

    public Runner getRunner() {
        return runner;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    
}