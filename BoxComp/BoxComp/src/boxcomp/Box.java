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
    public Box(int g, double l, double w, double h, boolean s){
        grade = g;
        size = ((w*l) + (w*h) + (l*h))*2;
    }
    
    abstract String getType();
    //abstract void getPrice();
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
    
    public double getPrice(double size, int grade){
        double price = 0;
        switch (grade) {
            case 1:
                {
                    price = size*0.5;
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
    //no methods since subclasses will

}
