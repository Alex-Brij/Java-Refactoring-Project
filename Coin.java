import java.lang.Math;
import java.util.*;

public class Coin {
    private int sequenceNumber=0;
    private String state;

    // Initialise the coin to be face-up
    public Coin() {
        state="Tail";
    }

    // Flips the coin
    public String flip() {
        if (Math.random()>=0.5)
            state="Head";
        else
            state="Tail";
        sequenceNumber++;
        return state;
    }
    
    public static void main(String[] args) {
        Coin c=new Coin();
        for (int i=0; i<10; i++)
            System.out.println(c.flip());
    }
}
