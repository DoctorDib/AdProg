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
}
