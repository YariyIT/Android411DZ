package DZ022.person;

public class Specialist extends Graduate{
    private int num;

    public Specialist(String lastName, String firstName, int age, String speciality, String group, double rating, double attendance, String subject, int num) {
        super(lastName, firstName, age, speciality, group, rating, attendance, subject);
//        this.num = num;
        setNum(num);
        System.out.println("SpecialistConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public Specialist(Student student, String subject, int num) {
        super(student, subject);
//        this.num = num;
        setNum(num);
        System.out.println("SpecialistConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
