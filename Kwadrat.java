public class Kwadrat {
  int bok;
  public Kwadrat(int bok) {
    this.bok = bok;
  }
  public void show() {
    System.out.println("Pole powierzchni tego kwadratu to: "+(this.bok*this.bok));
    System.out.println("Pole sześcianu zbudowanego z tego kwadratu to: "+(this.bok*this.bok*this.bok));
  }
}
