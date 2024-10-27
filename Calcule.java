import java.util.Arrays;

public class Calcule {

    // Methode 1: Summieren der Arrays
    public static int[] addiereArrays(int[] zahl1, int[] zahl2) {
        int laenge = zahl1.length;
        int[] summe = new int[laenge + 1];
        int carry = 0;

        for (int i = laenge - 1; i >= 0; i--) {
            int tempSumme = zahl1[i] + zahl2[i] + carry;
            summe[i + 1] = tempSumme % 10;
            carry = tempSumme / 10;
        }
        summe[0] = carry;

        // Falls das erste Element 0 ist, kopieren wir nur den relevanten Teil
        return (summe[0] == 0) ? Arrays.copyOfRange(summe, 1, summe.length) : summe;
    }

    // Methode 2: Subtrahieren der Arrays
    public static int[] subtrahiereArrays(int[] zahl1, int[] zahl2) {
        int laenge = zahl1.length;
        int[] differenz = new int[laenge];
        int borrow = 0;

        for (int i = laenge - 1; i >= 0; i--) {
            int tempDifferenz = zahl1[i] - zahl2[i] - borrow;
            if (tempDifferenz < 0) {
                tempDifferenz += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            differenz[i] = tempDifferenz;
        }
        return differenz;
    }

    // Methode 3: Multiplikation des Arrays mit einer Ziffer
    public static int[] multipliziereArrayMitZiffer(int[] zahl, int ziffer) {
        int laenge = zahl.length;
        int[] produkt = new int[laenge + 1];
        int carry = 0;

        for (int i = laenge - 1; i >= 0; i--) {
            int tempProdukt = zahl[i] * ziffer + carry;
            produkt[i + 1] = tempProdukt % 10;
            carry = tempProdukt / 10;
        }
        produkt[0] = carry;

        return (produkt[0] == 0) ? Arrays.copyOfRange(produkt, 1, produkt.length) : produkt;
    }

    // Methode 4: Ganzzahlige Division des Arrays durch eine Ziffer
    public static int[] dividiereArrayDurchZiffer(int[] zahl, int ziffer) {
        int laenge = zahl.length;
        int[] quotient = new int[laenge];
        int rest = 0;

        for (int i = 0; i < laenge; i++) {
            int tempDividende = rest * 10 + zahl[i];
            quotient[i] = tempDividende / ziffer;
            rest = tempDividende % ziffer;
        }

        // Führe führende Nullen im Quotienten weg
        int startIndex = 0;
        while (startIndex < laenge && quotient[startIndex] == 0) {
            startIndex++;
        }
        return (startIndex == laenge) ? new int[]{0} : Arrays.copyOfRange(quotient, startIndex, laenge);
    }

    public static void main(String[] args) {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int ziffer = 2;

        // Methode 1: Addition
        System.out.println("Summe: " + Arrays.toString(addiereArrays(zahl1, zahl2)));

        // Methode 2: Subtraktion
        int[] zahl3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("Differenz: " + Arrays.toString(subtrahiereArrays(zahl3, zahl4)));

        // Methode 3: Multiplikation mit einer Ziffer
        int[] zahl5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        System.out.println("Multiplikation: " + Arrays.toString(multipliziereArrayMitZiffer(zahl5, ziffer)));

        // Methode 4: Ganzzahlige Division durch eine Ziffer
        System.out.println("Ganzzahlige Division: " + Arrays.toString(dividiereArrayDurchZiffer(zahl5, ziffer)));
    }
}