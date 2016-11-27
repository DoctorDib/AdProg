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
    int price;
    //Constructor
    public BoxType4(int g, double s){
        super(g, s);
        grade = g;
        size = s;
        
    }
    
    //Methods
    public double getPrice(){
        
        if (grade == 2){
            double price = size * 0.60;
        }
        else if (grade == 3){
            double price = size * 0.72;
        }
        else if(grade == 4){
            double price = size * 0.90;
        }
        else if(grade == 5){
            double price = size * 1.40;
        }
        return price;
    }
    
}
