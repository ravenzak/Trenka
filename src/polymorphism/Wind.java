package polymorphism;

/**
 * Created by Dovi on 05.02.2016.
 */
public class Wind extends Instrument {
    void play(Note n){
        System.out.println("wind.play()"+n);
    }
    String what(){return "wind";}
    void adjust (){
        System.out.println("adj wind");
    }

}
