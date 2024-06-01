package tec.runnerapp;

public class Runner extends User {
    private String bloodType;
    public Runner(String name, String email,String password, String phone, String bloodType) {
        super(name, email, phone,password);
        this.bloodType = bloodType;
    }

    // Getters and Setters

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }


}
