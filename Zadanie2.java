import java.util.Random;

public class Zadanie2 {

    public static void main (String[] args) {
        char[][] tab = new char[26][26];

        for (int i = 0; i < tab.length; i++) {
            fillTable(tab[i]);
            int result = countFragments(tab[i]);
            System.out.println(result);
        }
    }

    public static int countFragments(char[] tab) {
        char [] prefix = { tab[0], tab[1]};
        int result = 0;

        for (int i = 2; i<tab.length; i++) {
          if (prefix[0] == 'a' && prefix[1] == 'l' && tab[i] == 'a') {
            result++;
          }
          prefix[0] = prefix[1];
          prefix[1] = tab[i];
        }

        return result;
    }

    public static char[] fillTable(char[] tab) {
      Random r = new Random();

      for (int i = 0; i < tab.length; i++) {
        tab[i] = (char)(r.nextInt(26)+'a');
      }

      return tab;
    }
}
