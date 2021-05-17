package labor12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Storage {
    private HashMap<Integer, Product> products;

    public Storage(String fileName) {
        products = new HashMap<>();
        Scanner scanner;
        try {
            scanner = new Scanner(new File(fileName));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(" ");
                if(values.length != 4) {
                    System.out.println("Unacceptable line: \"" + line + '"');
                    return;
                }
                int id, amount, price;
                try{
                    id = Integer.parseInt(values[0].trim());
                    amount = Integer.parseInt(values[2].trim());
                    price = Integer.parseInt(values[3].trim());
                } catch (NumberFormatException nfe) {
                    System.out.println("Input is not a number!");
                    nfe.printStackTrace();
                    return;
                }
                products.put(id, new Product(id, values[1].trim(), amount, price));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't access file! " + fileName);
            e.printStackTrace();
        }
    }

    public int update(String fileName) {
        Scanner scanner;
        try {
            int updated = 0;
            scanner = new Scanner(new File(fileName));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(" ");
                if(values.length != 2) {
                    System.out.println("Unacceptable line: \"" + line + '"');
                    return 0;
                }
                int id, amount;
                try{
                    id = Integer.parseInt(values[0].trim());
                    amount = Integer.parseInt(values[1].trim());
                } catch (NumberFormatException nfe) {
                    System.out.println("Input is not a number!");
                    nfe.printStackTrace();
                    return 0;
                }
                Product product = products.get(id);
                if(product != null) {
                    product.increaseAmount(amount);
                    ++updated;
                }
            }
            return updated;
        } catch (FileNotFoundException e) {
            System.out.println("Can't access file! " + fileName);
            e.printStackTrace();
            return 0;
        }
    }
}
