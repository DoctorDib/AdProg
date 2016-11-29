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
    double total = 0;
    double length, width, height;
    //Constructor
    public BoxType1(int g, double l, double w, double h){
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
    
    public double getTotal(){
        return total + price;
    }
    
    String getReceipt(){
        String receipt = "\n           - Size: " + length + " x " + width + " x " + height + "\t" + grade;
        receipt += "\n           - Grade: " + grade; 
        return receipt;
    }
}
