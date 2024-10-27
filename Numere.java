public class Numere {

    // Methode 1: Maximale Zahl finden
    public static int maximaleZahl(int[] zahlen) {
        int max = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl > max) {
                max = zahl;
            }
        }
        return max;
    }

    // Methode 2: Minimale Zahl finden
    public static int minimaleZahl(int[] zahlen) {
        int min = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl < min) {
                min = zahl;
            }
        }
        return min;
    }

    // Methode 3: Maximale Summe von n-1 Zahlen
    public static int maximaleSummeVonNMinus1(int[] zahlen) {
        int summe = 0;
        int min = zahlen[0];
        for (int zahl : zahlen) {
            summe += zahl;
            if (zahl < min) {
                min = zahl;
            }
        }
        return summe - min;
    }

    // Methode 4: Minimale Summe von n-1 Zahlen
    public static int minimaleSummeVonNMinus1(int[] zahlen) {
        int summe = 0;
        int max = zahlen[0];
        for (int zahl : zahlen) {
            summe += zahl;
            if (zahl > max) {
                max = zahl;
            }
        }
        return summe - max;
    }

    public static void main(String[] args) {
        int[] zahlen = {4, 8, 3, 10, 17};

        // Methode 1: Maximale Zahl
        System.out.println("Maximale Zahl: " + maximaleZahl(zahlen));

        // Methode 2: Minimale Zahl
        System.out.println("Minimale Zahl: " + minimaleZahl(zahlen));

        // Methode 3: Maximale Summe von n-1 Zahlen
        System.out.println("Maximale Summe von n-1 Zahlen: " + maximaleSummeVonNMinus1(zahlen));

        // Methode 4: Minimale Summe von n-1 Zahlen
        System.out.println("Minimale Summe von n-1 Zahlen: " + minimaleSummeVonNMinus1(zahlen));
    }
}