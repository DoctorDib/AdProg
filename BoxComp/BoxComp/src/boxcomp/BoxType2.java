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
    double price;
    //Constructor
    public BoxType2(int g, double s){
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
            default:
                break;
        }
        return price;
    }
    
}
