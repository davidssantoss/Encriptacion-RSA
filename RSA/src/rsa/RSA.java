
package rsa;

/**
 *
 * @author david
 */
public class RSA {
    
    public static void main(String[] args) {
        Interfaz i = new Interfaz();
        Encriptacion enc = new Encriptacion();
        
        Controlador c= new Controlador(enc, i);        
        i.asignarOyente(c);
        i.mostrar();
        
    }
    
}
