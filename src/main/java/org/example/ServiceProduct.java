package org.example;

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
                // если элемент действительно является набором, то проверяем имя
                if (filter.apply(filterSet.getName())) {
                    count++;
                }

                // заменяем на массив продуктов из Набора товаров
                products = filterSet.getSetProduct();

                // перебираем новый массив
                for (PackageProduct product1: products) {
                    if (product1 instanceof Package dblProduct) {
                        if (filter.apply(dblProduct.getName())) {
                            count++;
                        }
                    }
                }


            }

        }

        return count;

    }

    public static boolean checkAllWeighted(PackageSetProduct setProducts) {

        PackageProduct[] products = setProducts.getSetProduct();

        for (PackageProduct product: products) {
            if (!(product instanceof WeightProduct)) {
                return false;
            }
        }

        return true;

    }

}
