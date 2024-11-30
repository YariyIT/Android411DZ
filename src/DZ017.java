public class DZ017 {
    public static void main(String[] args) {
        String strStart = "  Текст с повторяющимися  символами ";
        strStart = strStart.replace(" ", ""); // Убираем пробелы из строки
        StringBuffer str = new StringBuffer(strStart) ; // Переводим строку в изменяемый класс

        for (int i = 0; i < (str.length() - 1); i++) { // Запускаем цикл проверки и удаления повторяющихся символов
            for (int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){ // Проверяем символы строки на повторение
                    str.delete(j, (j + 1)); // При совподении удаляем

                }

            }
        }
        System.out.println(str);
    }
}
