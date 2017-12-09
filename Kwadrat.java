public class Kwadrat {
  int bok;
  public Kwadrat(int bok) {
    this.bok = bok;
  }
  public void show() {
    System.out.println("Pole powierzchni tego kwadratu to: "+(this.bok*this.bok));
    System.out.println("Pole sześcianu zbudowanego z tego kwadratu to: "+(this.bok*this.bok*this.bok));
  }
  public void showCylinder() {
    float polePodstawy = (float)(this.bok * this.bok * Math.PI / 4);
    System.out.println("Pole powierzchni podstawy tego walca to: "+polePodstawy);
    System.out.println("Objetosc tego walca to: "+(polePodstawy * this.bok));
  }
}
