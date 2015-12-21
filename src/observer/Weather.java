package observer;

/**
 * Created by Mr_Wrong on 15/12/21.
 */
public class Weather {
    public Weather(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String description;
}
