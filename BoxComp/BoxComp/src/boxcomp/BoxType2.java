package boxcomp;
import java.text.DecimalFormat;

/**
 * A subclass of box for box type 2. This box will have grade 2-4 and 1 colour.
 * @author UP780104, UP780065, UP793946
 */
public class BoxType2 extends Box{
    
    private int grade; //The grade of the cardboard
    private double size; //The surface area of the box
    private double price; //The base price of the box
    private boolean seal; //Does the box have a sealable top
    private double eTotal = 0; //The total price for the extras
    private double length, width, height; // The dimensions of the box
    
    /**
     * 
     * @param g The grade of the cardboard
     * @param l The length of the box
     * @param w The width of the box
     * @param h The height of the box
     * @param s Does the box have a sealable top?
     */
    public BoxType2(int g, double l, double w, double h, boolean s){
        super(g, l, w, h, s);
        seal = s;
        grade = g;
        length = l;
        width = w;
        height = h;
        size = ((w*l) + (w*h) + (l*h))*2; //Calculate the surface area in m^2
        
    }
    
    /**
     * Returns a string of what boxType this is.
     * @return Returns "II" as String
     */
    String getType(){
        return "II";
    } 
    
    /**
     * Returns the total price for this box. The base price + the total price for
     * extras.
     * @return The total price of the box.
     */
    double getTotal(){
        return eTotal+price;
    }
    
    /**
     * Return the receipt of the extras to print on the
     * receipt with the prices for individual extras.
     * @return A string of extras with their pricing
     * for the receipt.
     */
    String getReceipt(){
        DecimalFormat dFormat = new DecimalFormat("0.00");
        //Get the price of the box and the total price for the extras
        price = getPrice(size, grade);
        eTotal = round(price*0.13);
        
        //Get the extras we will be returning
        String receipt = "\n           - Size: " + width + " x " + length + " x " + height + "\t£" + dFormat.format(round(price));
        receipt += "\n           - Grade: " + grade;
        receipt += "\n           - Colour: 1\t£" + dFormat.format(round(price*0.13));
        
        //Does the box have a sealable top?
        if (seal){
            receipt += "\n           - Sealable Top: \t£" + dFormat.format(round(price*0.08)); 
            eTotal += round(price*0.08);
        }
        //Return the receipt of extras
        return receipt;
    }
    
}
