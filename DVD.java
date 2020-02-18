public class DVD extends Playable {
    private String director;

    /**
     * Create a new playable product.
     *
     * @param price    The price of the product in pounds.
     * @param numStock The amount of the product in stock.
     * @param runtime  The runtime of the product.
     * @param title    The title of the product.
     */
    public DVD(double price, int numStock, double runtime, String title,String director) {
        super(price, numStock, runtime, title);
        setDirector(director);
    }

    @Override
    public void play() {
        play=!play;
        if(play){
            System.out.println("The movie is playing");
        } else{
            System.out.println("the movie is not playing");
        }
    }

    @Override
    public double rentalCost() {
        return 1.20;
    }

    public String getDirector(){
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
