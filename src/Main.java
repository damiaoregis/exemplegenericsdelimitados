//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.List;

import services.CalculationServices;
import entities.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

void main() {

    List<Product> list = new ArrayList<>();
    String path = "C:\\Users\\damia\\IdeaProjects\\exemplegenericsdelimitados\\src\\in.txt";
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
        String line = br.readLine();
        while (line != null) {
            String[] fields = line.split(",");
            list.add(new Product(fields[0], Double.parseDouble(fields[1]))); 
            line = br.readLine();
        }
        Product x = CalculationServices.max(list);
        System.out.println("Most expensive: ");
        System.out.println(x);
    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
