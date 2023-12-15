package products;

import Interface.Filter;
import Interface.PackageProduct;

public class ServiceProduct{

    public static int countByFilter(SetProduct setProduct, Filter filter) {

        int count = 0;

        PackageProduct[] products = setProduct.getSetProduct(); // массив упакованных товаров

        // перебираем все товары в массиве
        for (PackageProduct product: products) {

            // проверяем принадлежность элемента массива к классу Product
            if (product instanceof Product filterProduct) {

                // если элемент действительно является продуктом, то проверяем имя
                if (filter.apply(filterProduct.getName())) {
                    count++;
                }

                // проверяем принадлежность элемента массива к классу PackageSetProduct
            } else if (product instanceof PackageSetProduct filterSet) {
                // если элемент действительно является набором, то проверяем имя
                if (filter.apply(filterSet.getName())) {
                    count++;
                }
            }

        }

        return count;

    }

    public static int countByFilterDeep(SetProduct setProduct, Filter filter) {

        int count = 0;

        PackageProduct[] products = setProduct.getSetProduct(); // массив упакованных товаров

        // перебираем все товары в массиве
        for (PackageProduct product: products) {

            // проверяем принадлежность элемента массива к классу Product
            if (product instanceof Product filterProduct) {

                // если элемент действительно является продуктом, то проверяем имя
                if (filter.apply(filterProduct.getName())) {
                    count++;
                }

                // проверяем принадлежность элемента массива к классу PackageSetProduct
            } else if (product instanceof PackageSetProduct filterSet) {
                if (recursionFilterDeep(filterSet, filter)) {
                    count++;
                }
            }

        }

        return count;

    }

    public static boolean recursionFilterDeep(PackageSetProduct set, Filter filter) {

        PackageProduct[] setProducts = set.getSetProduct();

        // перебираем массив продуктов
        for (PackageProduct product : setProducts) {

            // если элемент является Товаром
            if (product instanceof Product productNamed) {
                if (filter.apply(productNamed.getName())) {
                    return true;
                }
                // если элемент является Набором Упакованных товаров
            } else if (product instanceof PackageSetProduct deepSet) {
                // переходим на следующий уровень "глубины"
                if (recursionFilterDeep(deepSet, filter)) {
                    return true;
                }
            }

        }

        return false;

    }

    // рекурсия
    //массив аргументов

    public static boolean checkAllWeighted(SetProduct setProducts) {
        PackageProduct[] products = setProducts.getSetProduct();
        return recursionWeight(products);
    }

    public static boolean recursionWeight(PackageProduct[] products) {

        // перебираем массив продуктов
        for (PackageProduct product: products) {

            // если продукт не является весовым
            if (!(product instanceof WeightProduct)) {

                // проверяем является ли товар Упакованным набором товаров
                if (product instanceof PackageSetProduct deepSet) {
                    PackageProduct[] deepSetProduct = deepSet.getSetProduct();
                    // если является, то вызываем функцию снова чтобы перейти на следующий уровень "глубины"
                    if (!recursionWeight(deepSetProduct)) {
                        return false;
                    }
                } else return false;

            }

        }

        return true;

    }

}
