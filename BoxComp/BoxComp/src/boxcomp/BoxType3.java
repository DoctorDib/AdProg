/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxcomp;

import java.text.DecimalFormat;

/**
 * A subclass of box for box type 3. This box will have grade 2-5 and 2 colours.
 * @author Ben, James, Jake
 */
public class BoxType3 extends Box{
    //fields
    
    private int grade;
    private double size;
    private double price;
    private String bType = "III";
    private boolean seal;
    private double total = 0;
    private double length, width, height;
    
    /**
     * The constructor for the BoxType3 Class.
     * @param g The grade of the cardboard
     * @param l The length of the box
     * @param w The width of the box
     * @param h The height of the box
     * @param s Does the box have a sealable top?
     */
    public BoxType3(int g, double l, double w, double h, boolean s){
        super(g, l, w, h, s);
        seal = s;
        grade = g;
        length = l;
        width = w;
        height = h;
        size = ((w*l) + (w*h) + (l*h))*2;
        
    }
    
    //Methods
    int getGrade(){
        return grade;
    }
    String getType(){
        return bType;
    }

    
    
    double getTotal(){
        return total + price;
    }

    /**
     * Return the receipt of the extras to print on the
     * receipt with the prices for individual extras.
     * @return 
     */
    String getReceipt(){
        DecimalFormat dFormat = new DecimalFormat("0.00");
        price = getPrice(size, grade);
        total = round(price*0.16);
        String receipt = "\n           - Size: " + width + " x " + length + " x " + height + "\t£" + dFormat.format(round(price));
        receipt += "\n           - Grade: " + grade;
        receipt += "\n           - Colour: 2\t£" + dFormat.format(round(price*0.16));
        if (seal){
            receipt += "\n           - Sealable Top: \t£" + dFormat.format(round(price*0.08)); 
            total += round(price*0.08);
        }
        return receipt;
    }
    
}
