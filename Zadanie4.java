import java.util.Random;
public class Zadanie4 {
    public static void main (String[] args) {
        int[][] mock = new int[10][2];
        fillTab(mock);
        for (int i = 0; i<mock.length; i++) {
          System.out.println("NWD dla pary "+mock[i][0]+" i "+mock[i][1]+" to: "+nwd(mock[i]));
        }
    }
    public static int[][] fillTab(int[][] tab) {
      Random r = new Random();
      for (int i = 0; i<tab.length; i++) {
        for (int j = 0; j<tab[i].length; j++) {
          tab[i][j] = r.nextInt(101);
        }
        System.out.println(i+": "+tab[i][0]+" "+tab[i][1]);
      }
      System.out.println();

      return tab;
    }
    public static int nwd(int[] tab) {
      int a = tab[0];
      int b = tab[1];
      int c;
      while (b != 0) {
        c = a % b;
        a = b;
        b = c;
      }
      return a;
    }
}
