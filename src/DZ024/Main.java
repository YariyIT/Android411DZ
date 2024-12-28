package DZ024;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Виктор Вербов, ", "группа Gr111, ", 1000);
        s1.printSt();

        Aspirant as1 = new Aspirant("Александр Невзоров, ", "группа Gr222, ", "тема работы : 'Work1', ", 1800);
        as1.printAs();
        Aspirant as2 = new Aspirant("Антон Бобров, ", "группа Gr333, ", "тема работы : 'Work2', ", 2000);
        as2.printAs();


    }
}
