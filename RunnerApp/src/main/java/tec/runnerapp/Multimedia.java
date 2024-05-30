package tec.runnerapp;

public class Multimedia {
    private String type; // Photo or Video
    private String url;

    public Multimedia(String type, String url) {
        this.type = type;
        this.url = url;
    }

    // Getters and Setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
