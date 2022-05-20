package torpedoprojekt;

import java.util.Random;
import java.util.Scanner;

public class Hajo {

    int[] pozicio = new int[3];
    int lovesek = 0;

    public Hajo() {
        setPozicio(pozicio);
    }

    public void setPozicio(int[] pozicio) {
        Random rnd = new Random();
        int kezdoPoz = rnd.nextInt(2);
        for (int i = 0; i < pozicio.length; i++) {
            this.pozicio[i] = kezdoPoz;
            kezdoPoz++;
        }
    }

    public String talalat() {
        String valasz = "";
        int talalatSzam = 0;
        boolean elsullyedt = false;
            Scanner sc = new Scanner(System.in);
            System.out.print("Kérem adja meg hogy hova szeretne lőni:");
            talalatSzam = sc.nextInt();
            int i = 0;
            while (i < pozicio.length) {
                if (pozicio[i] == talalatSzam) {
                    valasz = "Talált";
                    talalatSzam++;
                } else {
                    valasz = "Nem talált";
                }
                i++;
            }

            System.out.println(valasz);

        
        return valasz;
    }

}
