package DZ032;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Raindow c1 = new Raindow("Красный"); // Создаём переменные цветов радуги
        Raindow c2 = new Raindow("Оранжевый");
        Raindow c3 = new Raindow("Жёлтый");
        Raindow c4 = new Raindow("Зелёный");
        Raindow c5 = new Raindow("Голубой");
        Raindow c6 = new Raindow("Синий");
        Raindow c7 = new Raindow("Фиолетовый");

        LinkedList<Raindow> col = new LinkedList<>(); // Создаём коллкцию и наполняем её
        col.add(c1);
        col.add(c2);
        col.add(c3);
        col.add(c4);
        col.add(c5);
        col.add(c6);
        col.add(c7);

        ListIterator<Raindow> listIterator = col.listIterator(); // Создаём переменную итератора

        System.out.println("Список итераторов в прямом направлении:");
        while (listIterator.hasNext()){ // Проходимся по коллкции в прямом направлении
            System.out.println("Индекс = " + listIterator.nextIndex() + ", Элемент = " + listIterator.next());
        }
        System.out.println();

        System.out.println("Список итераторов в обратном направлении:");
        while (listIterator.hasPrevious()){ // Проходимся по коллкции в обратном направлении
            System.out.println("Индекс = " + listIterator.previousIndex() + ", Элемент = " + listIterator.previous());
        }
    }
}

class Raindow{ // создали новый класс с переменной цвета
    String colour;

    public Raindow(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Raindow{" +
                "colour='" + colour + '\'' +
                '}';
    }
}