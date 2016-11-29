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
    double price = 0;
    String bType = "IV";
    double total = 0;
    //Constructor
    public BoxType4(int g, double s){
        super(g, s);
        grade = g;
        size = s;
        
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
            case 5:
                {
                    price = size * 1.40;
                    break;
                }
            default:
                break;
        }
        return price;
    }
    public double getTotal(){
        return total + price;
    }
    String getReceipt(){
        total = round(price*0.16) + round(price*0.14);
        String receipt = "\n           - Grade: \t" + grade;
        receipt += "\n           - Colour: 2\t£" + round(price*0.16);
        receipt += "\n           - R-Bottom:\t£" + round(price*0.14);
        return receipt;
    }
    
}
