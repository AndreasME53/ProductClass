public class CD extends Playable {
    private String artist;


    /**
     * Create a new playable product.
     *
     * @param price    The price of the product in pounds.
     * @param numStock The amount of the product in stock.
     * @param runtime  The runtime of the product.
     * @param title    The title of the product.
     */
    public CD(double price, int numStock, double runtime, String title,String artist) {
        super(price, numStock, runtime, title);
        setArtist(artist);
    }

    @Override
    public void play() {
        play =! play;
        if(play){
            System.out.println("The song is playing");
        } else{
            System.out.println("the song is not playing");
        }
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
