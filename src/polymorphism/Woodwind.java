package polymorphism;

/**
 * Created by Dovi on 05.02.2016.
 */
public class Woodwind extends Instrument {
    void play(Note n){
        System.out.println("Woodwind.play()"+n);
    }

    void adjust (){
        System.out.println("adj Woodwind");
    }

}
