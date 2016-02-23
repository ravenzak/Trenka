import java.util.Random;


public class WhileTest {
    public static void main(String[] args) {
       // for (int i = 1; i <= 100; i++)
         //   System.out.println(i);
        Random rnd = new Random(0);
        for (int x = 0; x<10; x++) {
            int z = rnd.nextInt(20);


            System.out.println(z);
        }


    }
}
