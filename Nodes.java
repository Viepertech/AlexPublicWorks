/**
 * This is the Nodes class for Project0 used in "Part 1: Make a box that can hold any network node".
 */
public class Nodes {
	
    /** This is a limit, given by the user in args in our main method.
     * 
     * @param limit is the limit of the nodes to be printed.
     */
    private int limit;

    /**
     * Constructor for Nodes class.
     * 
     * @param limit The limit of the nodes to be printed.
     */
    public Nodes(int limit) {
        this.limit = limit;
    }

    /**
     * Method to print the network nodes based on the limit.
     */
    public void printNodes() {
        int x = 1;
        while (x <= limit) { // as long as x doesn't exceed limit we keep going
            if (x == 3 || x == 12) { // specified cases 3 and 12
                System.out.print(" Router");
            } else if (x % 2 == 0) { // evens
                System.out.print(" Server");
            } else { // odds
                System.out.print(" Client");
            }
            x++; // allows iteration
            
        }
    }

    /**
     * This Main method accepts a string of args, checks if the array of args is greater
     * in length than 1, and if it contains a valid integer argument. 
     * 
     * @param args the command line arguments given to Nodes.
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("One positive number required as a command line argument.");
            System.err.print("Example Usage: java Nodes [number]");
            return;
        }
        try {
            int limit = Integer.parseInt(args[0]);
            if (limit <= 0) {
                System.err.println("One positive number required as a command line argument.");
                System.err.print("Example Usage: java Nodes [number]");
                return;
            }
            Nodes nodes = new Nodes(limit);
            nodes.printNodes();
        } catch (NumberFormatException e) {
            System.err.println("One positive number required as a command line argument.");
            System.err.print("Example Usage: java Nodes [number]");
        }
    }
}
