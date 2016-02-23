/**
 * Created by Dovi on 19.01.2016.
 */
public class Leaf {
    int i =0;
    Leaf increment(){
        i++;
        return  this;
    }
    void print(){
        System.out.println("i="+i);
    }
    public static void main(String[] args){
        Leaf xz = new Leaf();
        xz.increment().increment().increment().print();
    }
}
