import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Manager {
    public static void main(String[] args) {
        try {
            String pathname = "product_list.txt";
            File file = new File(pathname);
            if (file.exists()) {
                System.out.println("File is already exists.");
            } else {
                file.createNewFile();
            }


            ArrayList<Product> products = new ArrayList<>();
            products.add(new Product("1","IP2", "China", 10000,"White"));
            products.add(new Product("2","IP3", "China", 10000,"Black"));

            loadProduct(pathname,products);
            System.out.println(displayProduct(pathname).toString());



        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void loadProduct(String path, ArrayList<Product> products) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(products);
        oos.flush();
        oos.close();
        fos.close();
    }

    public static ArrayList<Product> displayProduct(String path) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Product> products = new ArrayList<>();
        if (fis.available() > 0){
            products = (ArrayList<Product>) ois.readObject();
        }
        ois.close();
        return products;
    }
}
