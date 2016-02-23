package polymorphism;

/**
 * Created by Dovi on 05.02.2016.
 */
public class Stringed extends Instrument {
    void play(Note n){
        System.out.println("Stringed.play()"+n);
    }
    String what(){return "Stringed";}
    void adjust (){
        System.out.println("adj stringed");
    }

}
