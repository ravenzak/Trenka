
public class Flower {
    int petalCount = 0;
    String s = "init value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("konstruktor s param int, petalCount =" + petalCount);

    }

    Flower(String ss) {
        System.out.println("konstruktor s param String, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        System.out.println("argumentu String i int");

    }

    Flower() {
        this("ziga", 47);
        System.out.println("bez argumov");
    }

    void printPetalCount() {
        System.out.println("petalCount = " + petalCount + "s" + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
