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
    private int grade;
    double size;
    String bType = null;
    
    //constructor
    public Box(int g, double l, double w, double h){
        grade = g;
        size = ((w*l) + (w*h) + (l*h))*2;;
    }
    
    abstract String getType();
    abstract double getPrice();
    abstract int getGrade();
     abstract double getTotal();
    abstract String getReceipt();
    
    //no methods since subclasses will
    /**
     * 
     * @param num
     * @return Rounds to 2 decimal places
     */
    public double round(double num){
        return ((double)(Math.round(num*100)))/100;
    }
    //no methods since subclasses will

}
