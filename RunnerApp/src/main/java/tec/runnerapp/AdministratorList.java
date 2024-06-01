package tec.runnerapp;

import java.util.ArrayList;

public class AdministratorList {
    private static ArrayList<Administrator> administrators;

    public static ArrayList<Administrator> getInstance() {
        if (administrators == null) {
            administrators = new ArrayList<Administrator>();
        }
        return administrators;
    }

    public static void addAdministrator(Administrator administrator) {
        getInstance().add(administrator);
    }
    public static Administrator getRegistrationByEmail(String email) {
        for (Administrator administrator : getInstance()) {
            if (administrator.getEmail().equals(email)) {
                return administrator;
            }
        }
        return null;
    }
    
}
