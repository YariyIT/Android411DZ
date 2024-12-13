package DZ020.Car;

public class Car {
    private String mod;
    private String year;
    private String made;
    private String power;
    private String colour;
    private String price;

    public Car(String mod, String year, String made, String power, String colour, String price) {
        this.mod = mod;
        this.year = year;
        this.made = made;
        this.power = power;
        this.colour = colour;
        this.price = price;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
