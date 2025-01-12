package DZ027;

public class PrintSpeed {
    public static void main(String[] args) {

        System.out.println("\nСкорость самолёта составляет " + Speed.AIRPLANE.speed + "миль в час.\n\nСкорость транспортных средств:");
        for (Speed s : Speed.values()){
            System.out.println(s + " типичная скорость составляет " + s.speed + " миль в час.");
        }
    }
}
