import org.junit.Test;

import java.util.Random;
import java.util.Vector;

import static org.junit.Assert.*;
public class VectorHelperTest {
    Random random = new Random();
    Vector<Integer> vector1=new Vector<>();
    Vector<Integer> vector2=new Vector<>();

    public VectorHelperTest()
    {
        for (int j=0;j<10;j++){
            vector1.add(random.nextInt(2000));
            vector2.add(random.nextInt(2000));
        }
    }

    @Test
    public void reverse() throws Exception {
        System.out.println("Le vecteur a a inverser");
        System.out.println(vector1);
        System.out.println("*******************************");

        System.out.println("Le vecteur résultat");
        System.out.println(VectorHelper.Reverse(vector1));
    }

    @Test
    public void maxMin() throws Exception {
        System.out.println("Le vecteur dans lequel on chereche le MAX et le MIN:");
        System.out.println(vector1);
        VectorHelper.MaxMin(vector1);
    }

    @Test
    public void function1() throws Exception {
        System.out.println("Le vecteur auquel s'applique la fonction (x2):");
        System.out.println(vector1);
        System.out.println("*******************************");

        VectorHelper.Function1(vector1);
        System.out.println("Le vecteur après l'application de la fonction (x2):");
        System.out.println(vector1);
    }

    @Test
    public void function1_Reverse() throws Exception {
        System.out.println("Le vecteur auquel s'applique la fonction (x2):");
        System.out.println(vector1);
        System.out.println("*******************************");

        VectorHelper.Function1(vector1);
        System.out.println("Le vecteur après l'application de la fonction (x2):");
        System.out.println(vector1);
        System.out.println("*******************************");

        VectorHelper.Function1_Reverse(vector1);
        System.out.println("Le vecteur après l'application de l'inverse de la fonction (x2):");
        System.out.println(vector1);

    }

    @Test
    public void trier() throws Exception {
        System.out.println("Le vecteur à trier:");
        System.out.println(vector1);
        System.out.println("*******************************");

        System.out.println("Le résultat du tri:");
        System.out.println(VectorHelper.Trier(vector1));
    }

    @Test
    public void somme_Vectors() throws Exception {
        System.out.println("Le premier vecteur:");
        System.out.println(vector1);
        System.out.println("*******************************");

        System.out.println("Le deuxième vecteur:");
        System.out.println(vector2);
        System.out.println("*******************************");

        System.out.println("La somme des deux vecteurs:");
        System.out.println(VectorHelper.Somme_Vectors(vector1,vector2));
    }

}