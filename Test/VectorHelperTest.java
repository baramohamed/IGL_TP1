import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

/**
 * Created by Mohammed on 10/17/2017.
 */
public class VectorHelperTest {
    @Test
    public void reverse() throws Exception {
        Vector<Integer> vector = new Vector<Integer>();
        for (int i=0;i<5;i++)
        {
            System.out.println("Le vecteur a a inverser");
            System.out.println(vector);
            System.out.println("Le vecteur résultat");
            System.out.println(VectorHelper.Reverse(vector));
            vector.add(i*2);
        }
    }

    @Test
    public void maxMin() throws Exception {

    }

    @Test
    public void function1() throws Exception {

    }

    @Test
    public void function1_Reverse() throws Exception {

    }

    @Test
    public void trier() throws Exception {

    }

    @Test
    public void somme_Vectors() throws Exception {

    }

}