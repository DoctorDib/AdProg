package boxcomp;

/**
 * This class is used to define from the user input
 * which box (subclass) is to be used.
 * @author UP780104, UP780065, UP793946
 */
abstract class Box {
    
    /**
     * 
     * @param g The grade of the cardboard
     * @param l The length of the box
     * @param w The width of the box
     * @param h The height of the box
     * @param s Does the box have a sealable top?
     */
    public Box(int g, double l, double w, double h, boolean s){}
    
    abstract String getType();
    abstract double getTotal();
    abstract String getReceipt();
    
    /**
     * Rounds a double to 2 decimal places.
     * @param num The inputted double
     * @return Rounds to 2 decimal places
     */
    public double round(double num){
        return ((double)(Math.round(num*100)))/100;
    }
    
    /**
    * Calculates the price of the box without any extras, this depends on the
    * grade of the cardboard.
    * @param size The surface area of the box.
    * @param grade The grade of the cardboard.
    * @return The base price of the box.
    */
    public double getPrice(double size, int grade){
        double price = 0;
        //Calculate price depending on what grade the cardboard is
        switch (grade) {
            case 1:
                {
                    price = size*0.5;
                    break;
                }
            case 2:
                {
                    price = size * 0.60;
                    break;
                }
            case 3:
                {
                    price = size * 0.72;
                    break;
                }
            case 4:
                {
                    price = size * 0.90;
                    break;
                }
            case 5:
                {
                    price = size * 1.40;
                    break;
                }
            default:
                break;
        }
        //Return the base price of the box.
        return price;
    }
}
