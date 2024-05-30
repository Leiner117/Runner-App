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
    //TODO: FIX ERROR
    public static Registration getRegistrationByParticipantNum(String participantNumber) {
        for (Registration registration : getInstance()) {
            if (registration.getParticipantNumber() == Integer.parseInt(participantNumber)) {
                return registration;
            }
        }
        return null;
    }
    
}
