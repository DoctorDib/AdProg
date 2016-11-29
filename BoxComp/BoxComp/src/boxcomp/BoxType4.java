/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxcomp;

/**
 *
 * @author Ben, James, Jake
 */
public class BoxType4 extends Box{
    //fields
    
    int grade;
    double size;
    double price;
    String bType = "IV";
    double total = 0;
    double length, width, height;
    //Constructor
    public BoxType4(int g, double l, double w, double h){
        super(g, l, w, h);
        grade = g;
        length = l;
        width = w;
        height = h;
        size = ((w*l) + (w*h) + (l*h))*2;
        
    }
    
    //Methods
    public int getGrade(){
        return grade;
    }
    String getType(){
        return bType;
    }
    /**
     *
     * @return
     */
    public double getTotal(){
        return total + price;
    }
    String getReceipt(){
        price = getPrice(size, grade);
        total = round(price*0.16) + round(price*0.14);
        String receipt = "\n           - Size: " + length + " x " + width + " x " + height + "\t" + grade;
        receipt += "\n           - Grade: " + grade;
        receipt += "\n           - Colour: 2\t£" + round(price*0.16);
        receipt += "\n           - R-Bottom:\t£" + round(price*0.14);
        return receipt;
    }
    
}
