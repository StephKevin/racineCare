
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        double x;
        System.out.println("entrez un nombre positif:");
        Scanner lectureClavier = new Scanner(System.in);
        x = lectureClavier.nextDouble();
        while (x!=0)
        {
            if(x<0){
                System.out.println("un nombre positif SVP!");
            }
            else{
                System.out.println("la racine care de "+x+" est "+Math.sqrt(x));
            }
            x=0;
        }
    }
}