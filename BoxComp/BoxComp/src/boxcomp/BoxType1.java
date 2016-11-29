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
    private double price = 0;
    private String bType = "I";
    //Constructor
    public BoxType1(int g, double s){
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
    
    double getPrice(){
        
        switch (grade) {
            case 1:
                {
                    price = size * 0.50;
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
            default:
                break;
        }
        return price;
    }
    
    String getReceipt(int grade){
        String receipt = "\n           - Grade: \t" + grade;  
        return receipt;
    }
    
}
