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
public class BoxType2 extends Box{
    //fields
    
    int grade;
    double size;
    double price = 0;
    String bType = "II";
    double total = 0;
    double length, width, height;
    //Constructor
    public BoxType2(int g, double l, double w, double h){
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
    double getPrice(){
        
        switch (grade) {
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
            default:
                break;
        }
        return price;
    }
    
    public double getTotal(){
        return total+price;
    }
    
    String getReceipt(){
        total = round(price*0.13);
        String receipt = "\n           - Dimensions: " + length + " x " + width + " x " + height + "\t" + grade;
        receipt += "\n           - Grade: " + grade;
        receipt += "\n           - Colour: 1\t£" + round(price*0.13);
        return receipt;
    }
    
}
