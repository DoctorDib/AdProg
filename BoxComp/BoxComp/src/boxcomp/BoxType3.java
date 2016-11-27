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
public class BoxType3 extends Box{
    //fields
    
    int grade;
    double size;
    int price;
    //Constructor
    public BoxType3(int g, double s){
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
            case 4:
                {
                    double price = size * 0.90;
                    break;
                }
            case 5:
                {
                    double price = size * 1.40;
                    break;
                }
            default:
                break;
        }
        return price;
    }
    
}
