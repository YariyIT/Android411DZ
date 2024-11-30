public class DZ009 {
    public static void main(String[] args) {

        int [][] tabl = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for (int i = 0; i < tabl.length; i++) {
            for (int j = 0; j < tabl[i].length; j++) {
                System.out.print(tabl[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < tabl.length; i++) {
            for (int j = 0; j < tabl[i].length; j++) {
                tabl[i][j] *= tabl[i][j];
                System.out.print(tabl[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
