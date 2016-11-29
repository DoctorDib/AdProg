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
    public Box(int g, double s){
        grade = g;
        size = s;
    }
    
    abstract String getType();
    abstract double getPrice();
    abstract int getGrade();
    
    //no methods since subclasses will

}
