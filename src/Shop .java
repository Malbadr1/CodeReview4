import java.io.File;
import java.io.FileWriter;
import java.util.*;

class Shop {

    private String name;
    private String address;
    private ArrayList<Product> products;
    private ArrayList<User> users;

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
        products = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addUserToBuyHistory(User user) {
        users.add(user);
    }

    public void addProductToShop(Product product) {

        boolean found = false;

        for (int i = 0; i < products.size(); i++) {

            if (products.get(i).getProductName().equals(product.getProductName()) && products.get(i).getProductPrice() == product.getProductPrice()) {

                if (products.get(i).getStock() >= 15) {
                    System.out.println("Product has more then 15 items in stock");
                    found = true;
                } else {
                    int newStock = products.get(i).getStock() + 1;
                    products.get(i).setStock(newStock);
                    found = true;
                }
            }
        }

        if (found == false) {
            products.add(product);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Product> getProducts() {

        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }


    public boolean menuShop() {
        int n = 0;
        int choice;


        System.out.println("+----------------------+");
        System.out.println("|       Welcome        |");
        System.out.println("|         to           |");
        System.out.println("|        Shop          |");
        System.out.println("+----------------------+");
        System.out.println("Make a selection.");
        System.out.println("1. Display all products.");
        System.out.println("2. Display all products of category x.");
        System.out.println("3. Display all products where stock <5.");
        System.out.println("4. Display all products out of stock.");
        System.out.println("5. Exit.");



        try {
            do {


                Scanner sca = new Scanner(System.in);
                System.out.println("Enter your choice:");

                choice = sca.nextInt();

                switch (choice) {

                    case 1:
                        for (int i = 0; i < products.size(); i++) {
                            System.out.println(products.get(i));
                        }
                        break;

                    case 2:
                        int category ;
                        ProductCategory productCategory=null;
                        System.out.println("Choose category");
                        System.out.println("1. T_Shirts");
                        System.out.println("2. Trousers");
                        System.out.println("3. Shirts");
                        System.out.println("4. Jackets");
                        System.out.println("5. Accessories");

                        Scanner sc = new Scanner(System.in);
                        category = sc.nextInt();

                        switch (category){
                            case 1:
                                productCategory = ProductCategory.T_Shirts;
                                break;
                            case 2:

                             productCategory = ProductCategory.Trousers;
                             break;
                             case 3:
                                 productCategory = ProductCategory.Shirts;
                                 break;
                                case 4:
                              productCategory =ProductCategory.Jackets;
                              break;
                                case 5:
                               productCategory =ProductCategory.Accessories;
                                break;
                            default:
                                System.out.println("please Enter Number from 1 to 5");

                        }

                        for (int i = 0; i < products.size(); i++) {
                            if (products.get(i).getProductCategory() == productCategory)
                                System.out.println(products.get(i));
                        }

                        break;

                    case 3:
                        for (int i = 0; i < products.size(); i++) {
                            if (products.get(i).getStock() < 5)
                                System.out.println(products.get(i));
                        }
                        break;
                    case 4:
                        for (int i = 0; i < products.size(); i++) {
                            if (products.get(i).getStock() == 0) {
                                System.out.println(products.get(i));
                            } else {
                                System.out.println(" The  products  not out of stock you can check this list: " + "\n" + products.get(i));
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Are you sure you want exit?, please Enter (1 to Yes) ");
                        Scanner scanner=new Scanner(System.in);
                       int prov=scanner.nextInt();
                        if (prov==1) {
                            choice = 5;
                            n = choice;
                            System.out.println("thank you and We wish to visit us again");
                        }
                        else  {
                            choice = 0;
                            n = choice;
                            System.out.println("Welcome back please Choice what you wish from Menu");
                        }

                        break;

                    default:
                        System.out.println("please Enter Number from 1 to 5");

                }

            } while (n == 0);

        } catch (Exception ex) {

            System.out.println("Error, please Enter Number ");
        }
        return true;


    }
    public User getRport(User user) {
        try {
            File file = new File("g://User.txt");

            if (file.createNewFile()) {
                System.out.println("done");
            } else {
                System.out.println("it's already created");
            }
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write(String.valueOf(user));
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }
}