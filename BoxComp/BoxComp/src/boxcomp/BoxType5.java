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
public class BoxType5 extends Box{
    //fields
    
    int grade;
    double size;
    double price = 0;
    //Constructor
    public BoxType5(int g, double s){
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
    
}
