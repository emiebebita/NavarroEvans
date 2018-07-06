/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emie
 */
public abstract class Simpson {
    
    public double integral(double a, double b, int n){
        if(n%2==1) n++;     
        double h=(b-a)/n;
        double suma=f(a)+f(b);
        for(int i=1; i<n; i+=2){
            suma+=4*f(a+i*h);
        }
        for(int i=2; i<n; i+=2){
            suma+=2*f(a+i*h);
        }
        return (suma*h/3);
    }
    abstract public double f(double x);

}
