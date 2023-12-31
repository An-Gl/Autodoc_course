package homeworks.homework31;

public class UsersDataRequest {

    private String name;
    private String job;

    public UsersDataRequest(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
