/**
 * Created by Dovi on 19.01.2016.
 */
public class InitShiz {

    static String x = "pirog h";
    static InitShiz init1;
    static InitShiz init2;

    static {
        init1 = new InitShiz();
        System.out.println(x);
    }


    public static void main(String[] args) {
        InitShiz huz = new InitShiz();
        System.out.println(InitShiz.init1);
        System.out.println(InitShiz.init2);
        System.out.println("gux");
        System.out.println(huz);

    }
}
