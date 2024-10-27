import java.util.ArrayList;

public class Note {

    // Methode 1: Nicht ausreichende Noten
    public static ArrayList<Integer> nichtAusreichendeNoten(int[] noten) {
        ArrayList<Integer> nichtAusreichend = new ArrayList<>();
        for (int note : noten) {
            if (note < 40) {
                nichtAusreichend.add(note);
            }
        }
        return nichtAusreichend;
    }

    // Methode 2: Durchschnittswert
    public static double durchschnittswert(int[] noten) {
        double summe = 0;
        for (int note : noten) {
            summe += note;
        }
        return Math.round((summe / noten.length) * 100.0) / 100.0;
    }

    // Methode 3: Abgerundete Noten
    public static int[] abgerundeteNoten(int[] noten) {
        int[] abgerundeteNoten = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            int note = noten[i];
            if (note >= 38 && note % 5 >= 3) {
                abgerundeteNoten[i] = note + (5 - note % 5);
            } else {
                abgerundeteNoten[i] = note;
            }
        }
        return abgerundeteNoten;
    }

    // Methode 4: Maximale abgerundete Note
    public static int maximaleAbgerundeteNote(int[] noten) {
        int[] abgerundeteNoten = abgerundeteNoten(noten);
        int max = abgerundeteNoten[0];
        for (int note : abgerundeteNoten) {
            if (note > max) {
                max = note;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] noten = {29, 37, 38, 41, 84, 67};

        // Methode 1: Nicht ausreichende Noten
        System.out.println("Nicht ausreichende Noten: " + nichtAusreichendeNoten(noten));

        // Methode 2: Durchschnittswert
        System.out.println("Durchschnittswert: " + durchschnittswert(noten));

        // Methode 3: Abgerundete Noten
        int[] abgerundeteNoten = abgerundeteNoten(noten);
        System.out.print("Abgerundete Noten: ");
        for (int note : abgerundeteNoten) {
            System.out.print(note + " ");
        }
        System.out.println();

        // Methode 4: Maximale abgerundete Note
        System.out.println("Maximale abgerundete Note: " + maximaleAbgerundeteNote(noten));
    }
}