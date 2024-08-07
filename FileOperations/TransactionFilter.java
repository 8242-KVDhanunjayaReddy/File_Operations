package FileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TransactionFilter {

    public static void main(String[] args) {
        String inputFile = "transactions.txt";
        String outputFile = "filtered_transactions.txt";
        double threshold = 1000.0; // Specify your threshold here

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                double transactionAmount = Double.parseDouble(fields[2]);

                if (transactionAmount > threshold) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            System.out.println("Filtered transactions have been written to " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

