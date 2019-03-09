/**
 * Main class for Parser
 * By Daniel Burstein
 */

public class Main {
    public static void main(String[] args) {
        // Test of utils

        String data = Utills.readFileAsString("data/2016_Presidential_Results.csv");
        System.out.println(data);
    }
}
