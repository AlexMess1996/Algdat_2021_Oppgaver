package com.company;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.OptionalInt;
public class Main {

    public static void main(String[] args) {

        /*
        Seksjon 1.1.2: oppgave 1, 2, 3

        Oppgave 1:
        Anta at vi har en min-metode,dvs. en metode som finner (og returnerer) posisjonen til den minste verdien i en tabell.
        Hva ville metodekallet min(a) returnere med hvis a er tabellen i Figur 1.1.2?


           Verdier:  8	4	17	10	6	20	1	11	15	3	18	9	2	7	19
           Index:    0	1	2	3	4	5	6	7	8	9	10	11	12	13	14

        Løsning:
                Index : 6 --> Verdi : 1

        Oppgave 2:
        Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs. en metode
        som finner (og returnerer) posisjonen til den minste verdien i en tabell.

         */

        //Oppgave 2
        //int [] values = {8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};
        //System.out.println("Index til det minste verdi i tabelen er: "+findMin(values));

        /*
        Oppgave 3:
        Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen til den første av dem.
        Hva må endres for at den skal returnere posisjonen til den siste?

        Løsning: ???

        -------------------------------------------------------------------------------------------------------------------------

        Seksjon 1.1.3: oppgave 5, 6

        Oppgave 5:
        Lag en metode public static int[] minmaks(int[] a). Den skal ved hjelp av en int-tabell med lengde 2 returnere posisjonene til
        minste og største verdi i tabellen a. Hvis du har funnet at m1 er posisjonen til den minste og m2 til den største, kan du returnere tabellen b
        definert ved:   int[] b = {m1, m2}; Hvor mange sammenligninger bruker metoden din?

         */
        //Oppgave 5
        //int [] a = {2,4,6,8,3,1};
        //minmaks(a);


        /*
        Oppgave 6:
        Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 .
        Lag en metode long fak(int n) som regner ut n!. Hvor mange multiplikasjoner utføres i metoden?

        -------------------------------------------------------------------------------------------------------------------------

        Seksjon 1.1.4: deloppgave i og deloppgave ii


        -------------------------------------------------------------------------------------------------------------------------

        Seksjon 1.1.5: oppgave 1

        Oppgave 1:
        a = 0 lengde
        Hvis det Programkode 1.1.5 brukes på en tabell a med ingen elementer (dvs. a.length lik 0),
        finnes det ikke noe element med indeks lik 0. Dermed vil setningen int maksverdi = a[0] gi en ArrayIndexOutOfBoundsException.

        a = 1 lengde
        Hvis tabellen a har kun ett element, vil for-løkken gå én gang siden sist er 0. Dermed returneres 0 som er posisjonen til den største.
        Hvis det er kun ett element, er det også størst.

        -------------------------------------------------------------------------------------------------------------------------
        Seksjon 1.1.10: oppgave 1

        Oppgave 1:
        int[] a = {8,3,5,7,9,6,10,2,1,4};  // en heltallstabell
        IntStream s = Arrays.stream(a);    // fra int-tabell til IntStream

        OptionalInt resultat = s.max();    // kaller max-metoden

        IntStream c = Arrays.stream(a);
        OptionalInt resultat_2 = c.min();
        if (resultat.isPresent() && resultat_2.isPresent())
        {
            System.out.println(resultat.getAsInt());
            System.out.println(resultat_2.getAsInt());
        }
        else System.out.println("Ingen verdi!");
        */


    }



    public static int findMin(int [] values){

        int minValue = values[0];
        int index = 0;
        for (int i = 1; i<values.length; ++i){
            if(minValue>values[i]){
                minValue = values[i];
                index = i;
            }
        }
        return  index;
    }

    public static int [] minmaks(int[] a){
        int [] b = {0,0};
        int minValue = a[0];
        int maxValue = a[0];
        for (int j = 1; j<a.length; ++j){
            if(minValue>a[j]){
                minValue = a[j];
                b[0] = minValue;
            }else if(maxValue<a[j]){
                maxValue = a[j];
                b[1] = maxValue;
            }
            for (int k = 0; k<b.length; ++k){
                System.out.print(b[k]+",");

            }
            System.out.println("Sammenligning:"+j);
        }


        return b;
    }
}
