package DZ022.person;

public class Graduate  extends Student {
    private String subject;

    public Graduate(String lastName, String firstName, int age, String speciality, String group, double rating, double attendance, String subject) {
        super(lastName, firstName, age, speciality, group, rating, attendance);
//        this.subject = subject;
        setSubject(subject);
        System.out.println("GraduateConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public Graduate(Student student, String subject){
        super(student);
        setSubject(subject);
        System.out.println("GraduateConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + "Graduate{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
