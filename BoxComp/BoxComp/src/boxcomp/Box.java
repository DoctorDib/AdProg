/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxcomp;

/**
 * This class is used to define from the user input
 * which box (subclass) is to be used.
 * @author Ben, James, Jake
 */
abstract class Box {
    //fields
    private int quant;
    private double size;
    
    //constructor
    public Box(int q, double s){
        quant = q;
        size = s;
    }
    
    abstract double getPrice();
    //no methods since subclasses will
    
    public String validate(int grade, int colour, boolean bottom, boolean corner){
        boolean fail = false;
        String cause = "";
        if(corner&&!bottom){
            fail = true;
            cause += "Reinforced Bottom is required for Reinforced Corners \n";
        }
        if(bottom&&grade==1){
            fail = true;
            cause += "Grade 2 or higher is required for Reinforced Bottom \n";
        }
        if(corner&&grade<3){
            fail = true;
            cause += "Grade 3 or higher is required for Reinforced Corners \n";
        }
        if (colour!=2&&bottom){
            fail = true;
            cause += "2 Colours are required for Reinforced Bottom \n";
        }
        if(colour==2&&grade==1){
            fail = true;
            cause += "Grade 2 or higher is required for 2 Colours \n";
        }
        if((grade<2 || grade>4) && colour==2){
            fail = true;
            cause += "Grade 2-4 is required for 1 Colour \n";
        }
        if(colour==0&&grade>3){
            fail = true;
            cause += "Grade 3 or lower is required for no Colours \n";
        }
        if(fail){
            return cause;
        } else {
            return "good";
        }
    }
}
