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
public class BoxType1 extends Box{
    //fields
    
    private int grade;
    private double size;
    private double price;
    private String bType = "I";
    private boolean seal;
    double total = 0;
    double length, width, height;
    //Constructor
    public BoxType1(int g, double l, double w, double h, boolean s){
        super(g, l, w, h, s);
        seal = s;
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
    
    public double getTotal(){
        return total + price;
    }
    
    String getReceipt(){
        price = getPrice(size, grade);
        String receipt = "\n           - Size: " + length + " x " + width + " x " + height + "\t£" + round(price);
        receipt += "\n           - Grade: " + grade; 
        if (seal){
            receipt += "\n           - Sealable Top: \t£" + round(price*0.08); 
            total = round(price*0.08);
        }
        return receipt;
    }
}
