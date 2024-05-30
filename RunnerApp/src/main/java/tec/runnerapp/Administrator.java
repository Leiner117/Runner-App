package tec.runnerapp;

public class Administrator extends User {

    public Administrator(String name, String email, String phone, String password) {
        super(name, email, phone, password);
    }


    // Methods to manage runners, registrations, and times
    public void registerRunner(Runner runner) {
        // Implementation for registering a runner
    }

    public void registerTime(Runner runner, Time time) {
        // Implementation for registering time
    }

    public void uploadMultimedia(Runner runner, Multimedia multimedia) {
        // Implementation for uploading photos and videos
    }
}
