
package rsa;


public abstract class abs {
    int p,q,n;
    int array[];
    double array2[];

          
    public abstract int FI(int p , int q);
    public abstract int Z(int p , int q);
    public abstract int S(int n);   
    
    public abstract int encriptar(int c);
    public abstract int desencriptar(int c);
    
            
    
    
}
