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
        Vector<Integer> vector;

        for (int i=0;i<10;i++)
        {
            vector = new Vector<>();
            for (int j=0;i<10;i++) vector.add((int)Math.random());
            System.out.println(vector);
            VectorHelper.MaxMin(vector);
        }
    }

    @Test
    public void function1() throws Exception {
        Vector<Integer> vector;
        for (int i=0;i<10;i++)
        {
            vector = new Vector<>();
            for (int j=0;i<10;i++) vector.add((int)Math.random());
            System.out.println(vector);
            VectorHelper.Function1(vector);
            System.out.println(vector);
        }
    }

    @Test
    public void function1_Reverse() throws Exception {
        Vector<Integer> vector;
        for (int i=0;i<10;i++)
        {
            vector = new Vector<>();
            for (int j=0;i<10;i++) vector.add((int)Math.random());
            System.out.println(vector);
            VectorHelper.Function1(vector);
            System.out.println(vector);
            VectorHelper.Function1_Reverse(vector);
            System.out.println(vector);
        }
    }

    @Test
    public void trier() throws Exception {
        Vector<Integer> vector;
        for (int i=0;i<10;i++)
        {
            vector = new Vector<>();
            for (int j=0;i<10;i++) vector.add((int)Math.random());
            System.out.println(vector);
            VectorHelper.Trier(vector);
            System.out.println(VectorHelper.Trier(vector));
        }
    }

    @Test
    public void somme_Vectors() throws Exception {
        Vector<Integer> vector1;
        Vector<Integer> vector2;
        for (int i=0;i<10;i++)
        {
            vector1 = new Vector<>();
            vector2 = new Vector<>();
            for (int j=0;i<10;i++) {
                vector1.add((int)Math.random());
                vector2.add((int)Math.random());
            }
            System.out.println(vector1);
            System.out.println(vector2);
            System.out.println(VectorHelper.Somme_Vectors(vector1,vector2));
        }
    }

}