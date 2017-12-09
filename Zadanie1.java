public class Zadanie1 {
    public static void main (String[] args) {
        drawSquare(8, 'x');
    }
    public static void drawSquare(int len, char start) {
        if (start != 'x' && start != 'o') {
            System.out.println("Błędny argument startowy");
        }
        boolean startsWithX = (start == 'x');

        for (int i = 0; i<len; i++) {
            for (int j = 0; j<len; j++) {
                System.out.print( (startsWithX) ? 'x' : 'o');
                startsWithX = !startsWithX;
            }
            System.out.println();
            if (len%2 == 0) {
                startsWithX = !startsWithX;
            }
        }
    }
}
