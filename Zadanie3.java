public class Zadanie3 {
    public static void main (String[] args) {
        int[][] mock = {{0, 0, 3}, {0, 2, 3}, {1, 2, 3}};
        boolean result = jestDolnotrojkatna(mock);
        System.out.println((result) ? "Spełnia warunki" : "Nie spełnia warunków");
    }
    public static boolean jestDolnotrojkatna(int[][]tab) {
        return isSquare(tab) && isTriangle(tab);
    }
    public static boolean isSquare(int[][]tab) {
        boolean result = true;

        for (int i = 0; i<tab.length; i++) {
          if (tab[i].length != tab.length) {
            result = false;
          }
        }

        return result;
    }
    public static boolean isTriangle(int[][]tab) {
        // Assuming I can pick diagonal

        boolean result = true;
        for (int i = 0; i<tab.length; i++) {
          for (int j = 0; j<tab.length; j++) {
            if (((i+j+1) < (tab.length))) {
              if (tab[i][j] != 0) {
                result = false;
              }
              // System.out.print(tab[i][j]+ " ");
            }
          }
          // System.out.println();
        }

        return result;
    }
}
