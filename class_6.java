public class class_6 {

    public int id;
    public int category_id;
    public String product_name;
    public String description;
    public String standard_cost;
    public long list_price;

    public void getData(String[] args) {

        System.out.println("........Product Details.........");
        System.out.println("ID : " + id);
        System.out.println("Category ID : " + category_id);
        System.out.println("Name : " + product_name);
        System.out.println("Description : " + description);
        System.out.println("Standard Cost : " + standard_cost);
        System.out.println("List Price : " + list_price);
        System.out.println();

    }

    public static void main(String[] args) {

        class_6 product = new class_6();
        product.id = 1;
        product.category_id = 2;
        product.product_name = "Product 1";
        product.description = "Description 1";
        product.standard_cost = "1000";
        product.list_price = 2000L;
        product.getData(args);

        class_6 product2 = new class_6();
        product2.id = 2;
        product2.category_id = 3;
        product2.product_name = "Product 2";
        product2.description = "Description 2";
        product2.standard_cost = "2000";
        product2.list_price = 3000L;
        product2.getData(args);

        System.out.println(product);
        System.out.println();
        System.out.println(product2);
   

    }

    @Override
    public String toString() {
        return "class_6 [id=" + id + ", category_id=" + category_id + ", product_name=" + product_name
                + ", description=" + description + ", standard_cost=" + standard_cost + ", list_price=" + list_price
                + "]";

    }
}
