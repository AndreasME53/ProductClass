/**
 * Class that implements products that can be playable.
 */
public abstract class Playable extends Product {
	protected double runtime;
	protected String title;
	protected boolean play;
	
	/**
	 * Create a new playable product.
	 * @param price The price of the product in pounds.
	 * @param numStock The amount of the product in stock. 
	 * @param runtime The runtime of the product.
	 * @param title The title of the product.
	 */
	public Playable(double price, int numStock, double runtime, String title) {
		super(price, numStock);
		setRuntime(runtime);
		setTitle(title);
	}

	/**
	 * Get the runtime of the product.
	 * @return The runtime of the product in minutes.
	 */
	public double getRuntime() {
		return runtime;
	}
	
	/**
	 * Set the runtime of the product in minutes.
	 * @param runtime The runtime of the product in minutes.
	 */
	public void setRuntime(double runtime) {
		this.runtime = runtime;
	}
	
	/**
	 * Get the title of the product.
	 * @return The title of the product.
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Set the title of the product.
	 * @param title The title of the product.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

       /**
        * Plays the playable media.  We really don't know what
        * to do here because media is not specified.
        */
       public abstract void play ();

       public double rentalCost(){
       	return 1.00;
	   }
}
