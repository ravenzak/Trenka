package polymorphism;

/**
 * Created by Dovi on 05.02.2016.
 */
public class Percussion extends Instrument {
    void play(Note n){
        System.out.println("Percussion.play()"+n);
    }
    String what(){return "percussion";}
    void adjust (){
        System.out.println("adj percussion");
    }

}
