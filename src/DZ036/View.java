package DZ036;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    Scanner input = new Scanner(System.in);

    public String waitUserAnswer(){
        System.out.println("========== Редактирование данных каталога фильмов =========");
        System.out.println("Действие со фильмами:");
        System.out.println("1 - добавление фильма\n" + "2 - каталог фильмов\n" + "q - выход из программы");
        System.out.print("Выберите вариант действия: ");
        String userAnswer = input.nextLine();
        System.out.println("===========================================================");
        return userAnswer;
    }

    public Map addUserFilm(){
        Map<String, String> dictFilm = new LinkedHashMap<>();
        dictFilm.put("название", "");
        dictFilm.put("жанр", "");
        dictFilm.put("режисёра", "");
        dictFilm.put("год выпуска", "");
        dictFilm.put("длительность", "");
        dictFilm.put("студию", "");
        dictFilm.put("актёров", "");
        System.out.println("=================== Добавление фильма =====================");
        for (Map.Entry<String, String> el : dictFilm.entrySet()){ // Проходимся по коллекции для ввода данных
            System.out.print("Введите " + el.getKey() + " фильма: ");
            dictFilm.put(el.getKey(), input.nextLine());
        }
        System.out.println("===========================================================");
        return dictFilm;
    }

    public void showAllFilms(Collection films){
        System.out.println("===================== Список фильмов ======================");
        for (var element : films){
            System.out.println(element);
        }
        System.out.println("===========================================================");
    }
}
