package tec.runnerapp;

import java.util.ArrayList;

public class RegistrationList {
    private static ArrayList<Registration> registrations;

    public static ArrayList<Registration> getInstance() {
        if (registrations == null) {
            registrations = new ArrayList<Registration>();
        }
        return registrations;
    }

    public static void addRegistration(Registration registration) {
        getInstance().add(registration);
    }
    public static Registration getRegistrationByName(String name) {
        for (Registration registration : getInstance()) {
            if (registration.getRunner().getName().equals(name)) {
                return registration;
            }
        }
        return null;
    }
    
}
