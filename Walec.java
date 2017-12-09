public class Walec {
  int podstawa;
  int wysokosc;

  public Walec(int podstawa, int wysokosc) {
    this.podstawa = podstawa;
    this.wysokosc = wysokosc;
  }
  public void show() {
    float polePodstawy = (float)(this.podstawa * this.podstawa * Math.PI);
    System.out.println("Pole powierzchni podstawy tego walca to: "+polePodstawy);
    System.out.println("Objetosc tego walca to: "+(polePodstawy * this.wysokosc));
  }
}
