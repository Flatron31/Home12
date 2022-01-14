import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private ArrayList<Product> productList = new ArrayList<>();

    // добавление в список (проверка на сходство id)
    public void addProductInTotalListProducts(Product product) {
        if (!checkId(product)) {
            productList.add(0, product);
        } else {
            System.out.println("Товар и таким id уже имеется");
        }

    }
    // проверка на совпадение id
    private boolean checkId(Product product) {
        for (Product item : productList) {
            if (item.getId() == product.getId()) {
                return true;
            }
        }
        return false;
    }

    // список всех продуктов
    public void printTotalListAllProducts() {
        productList.stream()
                .forEach(value -> System.out.println("id=" + value.getId()+ " name-" + value.getName() +
                " цена=" + value.getPrice()));
    }

    // удаление продукта по id
    public void removeProduct(int id) {
        if (productList.size() == 0) {
            System.out.println("Список товаров пуст");
        } else {
            productList.removeIf(product -> product.getId() == id);
        }
    }

    //замена продукта по id
    public void editProductInTotalListAllProducts(Product product) {
        int counter = 0;
        for (Product item : productList){
            if (product.getId() == item.getId()) {
                productList.set(counter,product);
            }
        counter++;
        }
    }

    // сортровка по цене
    public void sortProductsByPriceAscending(){
        productList.stream()
                .sorted((o1, o2) -> (o1.getPrice() - o2.getPrice()))            // o2-o1 будет убывание
                .forEach(value -> System.out.println("id=" + value.getId()+ " name-" + value.getName() +
                        " цена=" + value.getPrice()));
    }

    public void sortProductsByDateAddDescending() {
        productList.stream()
                .sorted(((o1, o2) -> (o2.getDateAdd().compareTo(o1.getDateAdd()))))
                .forEach(value -> System.out.println("id=" + value.getId() + " name-" + value.getName() +
                        " цена=" + value.getPrice() + " дата добавления " +value.getDateAdd()));


    }

    public void sortProductsByDateAddAscending() {
        productList.stream()
                .sorted(((o1, o2) -> (o1.getDateAdd().compareTo(o2.getDateAdd()))))
                .forEach(value -> System.out.println("id=" + value.getId() + " name-" + value.getName() +
                        " цена=" + value.getPrice() + " дата добавления " +value.getDateAdd()));
    }

}


