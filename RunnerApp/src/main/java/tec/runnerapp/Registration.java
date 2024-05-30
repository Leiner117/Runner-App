package tec.runnerapp;

public class Registration {
    private String distance;
    private String lateralization;
    private String category;
    private String emergencyContactName;
    private String emergencyContactPhone;
    private Runner runner;
    private int participantNumber;

    public Registration(String distance, String lateralization, String category,
                        String emergencyContactName, String emergencyContactPhone, Runner runner) {
        this.distance = distance;
        this.lateralization = lateralization;
        this.category = category;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
        this.runner = runner;
    }

    // Getters and Setters

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getLateralization() {
        return lateralization;
    }

    public void setLateralization(String lateralization) {
        this.lateralization = lateralization;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public Runner getRunner() {
        return runner;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
    }
    
    public int getParticipantNumber() {
        return participantNumber;
    }

    public void setParticipantNumber(int participantNumber) {
        this.participantNumber = participantNumber;
    }

}
