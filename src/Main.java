/**
 * Main class for Parser
 * By Daniel Burstein
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Test of utils
        String data = Utills.readFileAsString("data/2016_Presidential_Results.csv");

        ArrayList<ElectionResult> results = Utills.parse2016ElectionResults(data);

    }
}
