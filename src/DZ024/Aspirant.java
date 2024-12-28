package DZ024;

public class Aspirant extends Student{
    String asp;

    public Aspirant(String name, String group, String asp, int cash) {
        super(name, group, cash);
        this.asp = asp;
    }

    public String getAsp() {
        return asp;
    }

    public void setAsp(String asp) {
        this.asp = asp;
    }

    public void printAs() {
        System.out.println(getName() + getGroup() + asp + getCash());
    }
}
