public class test {
    public static void main(String[] args) {
        Cart test = new Cart();
        test.addProducts(new Product("asda",12.1));
        test.addProducts(new Product("sa",12.1));
        test.addProducts(new Product("asda",12.1));
        test.addProducts(new Product("str",121.1));
        System.out.println(test.totalCost());

        // Otrzymuje wynik 157,39999998 xd

    }
}
