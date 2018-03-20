package rsa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Controlador implements ActionListener {
    Encriptacion encr;
    Interfaz inter;
    String textoPalabra;
    String textoEncriptado;

    public Controlador(Encriptacion encr, Interfaz i) {
        this.encr = encr;
        this.inter = inter;
        textoPalabra="";
        textoEncriptado="";
    }

    
    @Override
    public void actionPerformed(ActionEvent evento) {
        try{
            String e = "",e2 = "";
            
            if (evento.getSource().equals(inter.getBtnEnc())){
                for(int i=0;i<textoPalabra.length();i++) {
                    e +=(char) encr.encriptar(textoPalabra.codePointAt(i));
                    e2 += encr.encriptar(textoPalabra.codePointAt(i)) + " | ";
                    inter.setTexto(e);
                    inter.setTexto2(e2);    
                    textoEncriptado=e;
                }
            }
            if (evento.getSource().equals(inter.getBtnDes())){
                for(int i=0;i<textoEncriptado.length();i++) {
                    e +=(char) encr.desencriptar(textoEncriptado.codePointAt(i));
                    e2 += encr.desencriptar(textoEncriptado.codePointAt(i)) + " | ";
                    inter.setTexto(e);
                    inter.setTexto2(e2);
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor ingresa correctamente todos los datos");
        }
            
        }
    }
    

