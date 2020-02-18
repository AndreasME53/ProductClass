public class Teacup extends Product {
    private int volumeOfTea;
    /**
     * Create a new product.
     *
     * @param price    The price of the product in pounds.
     * @param numStock The amount of the product in stock.
     */
    public Teacup(double price, int numStock, int volumeOfTea) {
        super(price, numStock);
        setVolumeOfTea(volumeOfTea);
    }

    public int getVolumeOfTea() {
        return volumeOfTea;
    }

    public void setVolumeOfTea(int volumeOfTea) {
        this.volumeOfTea = volumeOfTea;
    }
}
