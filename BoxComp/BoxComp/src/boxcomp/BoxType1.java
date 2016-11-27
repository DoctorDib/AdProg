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
    
    int grade;
    double size;
    int price;
    //Constructor
    public BoxType1(int g, double s){
        super(g, s);
        grade = g;
        size = s;
        
    }
    
    //Methods

    /**
     *
     * @return
     */
    @Override
    public double getPrice(){
        
        switch (grade) {
            case 1:
                {
                    double price = size * 0.50;
                    break;
                }
            case 2:
                {
                    double price = size * 0.60;
                    break;
                }
            case 3:
                {
                    double price = size * 0.72;
                    break;
                }
            default:
                break;
        }
        return price;
    }
    
}
