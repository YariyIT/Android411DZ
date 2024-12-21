package DZ022.person;

public class Teacher extends Human{
    private String pred;

    public Teacher(String lastName, String firstName, int age, String pred) {
        super(lastName, firstName, age);
        this.pred = pred;
        System.out.println("TeacherConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public String getPred() {
        return pred;
    }

    public void setPred(String pred) {
        this.pred = pred;
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" +
                "pred='" + pred + '\'' +
                '}';
    }
}

