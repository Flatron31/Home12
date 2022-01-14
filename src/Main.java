public class Main {
    public static void main(String[] args) throws InterruptedException {
        Product apple = new Product(3, "Apple", 2);
        Product banana = new Product(2, "Banana", 4);
        Product orange = new Product(1, "Оrange", 3);
        Product kiwi = new Product(1, "Kiwi", 4);
        Product ananas = new Product(5,"Ananas", 6);


        Shop shop = new Shop();
        shop.addProductInTotalListProducts(apple);
        Thread.sleep(1000);
        shop.addProductInTotalListProducts(banana);
        Thread.sleep(1000);
        shop.addProductInTotalListProducts(orange);
        Thread.sleep(1000);
        shop.addProductInTotalListProducts(kiwi);
        Thread.sleep(1000);
        shop.addProductInTotalListProducts(ananas);
        shop.printTotalListAllProducts();
        System.out.println("======================");




        shop.sortProductsByPriceAscending();
        System.out.println("======================");

        shop.removeProduct(3);
        shop.printTotalListAllProducts();
        System.out.println("======================");


        shop.editProductInTotalListAllProducts(kiwi);
        shop.printTotalListAllProducts();
        System.out.println("======================");




        shop.sortProductsByDateAddDescending();
        System.out.println("======================");
        shop.sortProductsByDateAddAscending();















    }
}
