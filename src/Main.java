public class Main {

    public static void main(String[] args) {
        Product p1 = new Product("Puma T_Shirts", "we have from xs-xl size", 20.99, ProductCategory.T_Shirts);
        Product p2 = new Product("Puma Trousers", "we have from xs-xl size", 19.99, ProductCategory.Trousers);
        Product p3 = new Product("Puma Shirts", "we have from xs-xl size", 17.99, ProductCategory.Shirts);
        Product p4 = new Product("Puma Jackets", "we have from xs-xl size", 79.99, ProductCategory.Jackets);
        Product p5 = new Product("Puma Accessories", "we have(caps,Gloves, medals) from xs-xl size", 9.99, ProductCategory.Trousers);

        Shop MariaSport = new Shop("MariaSport", "Land Straße 1");
        MariaSport.addProductToShop(p1);
        MariaSport.addProductToShop(p2);
        MariaSport.addProductToShop(p3);
        MariaSport.addProductToShop(p4);
        MariaSport.addProductToShop(p5);


        User user1 = new User("Mohanad", "Albadri", "Albadri@gmx.net", "1030", "068864425644");
        User user2 = new User("Doe", "Jone", "Doe@gmx.net", "1050", "06877425644");
        User user3 = new User("Maxi", "Sami", "Maxi@gmx.net", "1070", "063464425644");

        user1.buyProductFromShop(p1,MariaSport);
       user1.buyProductFromShop(p2, MariaSport);
        user2.buyProductFromShop(p3,MariaSport);
        user3.buyProductFromShop(p4, MariaSport);


        MariaSport.menuShop();


    }
}
