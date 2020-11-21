import java.util.*;

public class User {

    private int Id;
    private String firstName;
    private String lastName;
    private String E_Mail;
    private String zip;
    private String phone;
    private static int idUserIncrement=1;
    private ArrayList<Product> purchase_History;

    public User(String firstName, String lastName, String E_Mail, String zip, String phone) {
        this.firstName = firstName;
        this.E_Mail = E_Mail;
        this.zip = zip;
        this.phone = phone;
        this.Id=idUserIncrement++;
        purchase_History=new ArrayList<>();
    }

    public void buyProductFromShop(Product product,Shop shop) {


        for (int i = 0; i < shop.getProducts().size(); i++) {

            if (shop.getProducts().get(i).getProductName().equals(product.getProductName()) && shop.getProducts().get(i).getProductPrice() == product.getProductPrice()) {

                int stock_old = shop.getProducts().get(i).getStock();

                if (stock_old == 0) {

                    System.out.println("Product out of stock");
                }
                else {
                    stock_old = stock_old - 1;
                    shop.getProducts().get(i).setStock(stock_old);
                    shop.addUserToBuyHistory(this);
                    this.purchase_History.add(product);
                }


            }
        }
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getE_Mail() {
        return E_Mail;
    }

    public void setE_Mail(String E_Mail) {
        this.E_Mail= E_Mail;

    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}