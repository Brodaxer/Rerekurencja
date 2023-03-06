class Cart {
    private final int maxProducts = 10;
    private int count = 0 ;
    private int reCount = 0;
    private double sum = 0;
    private int a = 0;

    private Product[] products = new Product[maxProducts];

    public void addProducts(Product product) {
        if (count < maxProducts) {
            products[count] = product;
            count++;
        }
    }
    private int licz(){
        return a++;
    }

    public double totalCost() {
        if (reCount <count) {
            reCount++;
            sum = totalCost() + products[licz()].getPrice();

        }
        return sum;
    }
}
