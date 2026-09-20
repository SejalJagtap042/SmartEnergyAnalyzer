package model;

public class Appliance {

    private int id;
    private String name;
    private double powerRating;
    private double usageHours;

    public Appliance() {
    }
    public Appliance(String name,
                     double powerRating,
                     double usageHours) {

        this.name = name;
        this.powerRating = powerRating;
        this.usageHours = usageHours;
    }
    public Appliance(int id,
                     String name,
                     double powerRating,
                     double usageHours) {

        this.id = id;
        this.name = name;
        this.powerRating = powerRating;
        this.usageHours = usageHours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(double powerRating) {
        this.powerRating = powerRating;
    }

    public double getUsageHours() {
        return usageHours;
    }

    public void setUsageHours(double usageHours) {
        this.usageHours = usageHours;
    }
}