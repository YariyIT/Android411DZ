package DZ024;

public class Student {
    private String name, group;
    private int cash;

    public Student(String name, String group, int cash) {
        this.name = name;
        this.group = group;
        this.cash = cash;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }


    public void printSt() {
        System.out.println(name + group + cash);
    }
}
