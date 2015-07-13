import com.restdownloader.network.Client;

/**
 * The Class Main.
 */
public class Main {
	
	/**
	 * Prints usage message
	 */
	public static void usage() {
		
		System.out.println("java -jar GoEuroTest.jar STRING");
		
	}
	
	
	/**
	 * Checkes the arguments.
	 * Mainly for future uses, for now we just check that
	 * there is only one argument
	 *
	 * @param args the args
	 * @return true, if successful
	 */
	public static boolean checkArguments(String[] args) {
		
		return args.length == 1;
	}
	
	
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

    	if(Main.checkArguments(args))
    	{
    		try {
        		Client client = new Client();
        		client.run(args[0]);
			} catch (Exception e) {
				e.printStackTrace();
			}
    		
    		
    	}
    	else
    		Main.usage();
    		
    }
    	
    
}

