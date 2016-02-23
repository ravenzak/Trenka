package polymorphism;

/**
 * Created by Dovi on 05.02.2016.
 */
public class Brass extends Instrument {
    void play(Note n){
        System.out.println("Brass.play()"+n);
    }

    void adjust (){
        System.out.println("adj Brass");
    }

}
