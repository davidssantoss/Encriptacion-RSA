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

    public Controlador(Encriptacion encr, Interfaz inter) {
        this.encr = encr;
        this.inter = inter;
        textoPalabra="";
        textoEncriptado="";
    }

    
    @Override
    public void actionPerformed(ActionEvent evento) {
        
        try{
            String e,e2;
            int i;
            String s1 = inter.txtp.getText();
            encr.p = Integer.parseInt(s1);
            String s2 = inter.txtq.getText();
            encr.q = Integer.parseInt(s2);
            String s3 = inter.txtn.getText();
            encr.n = Integer.parseInt(s3);
            
            if (evento.getSource().equals(inter.getBtnEnc())){
                encr.FI(encr.p, encr.q);
                encr.Z(encr.p, encr.q);
                encr.S(encr.n);
                
                e=""; e2="";
                textoPalabra= inter.getTexto();
                for(i=0;i<textoPalabra.length();i++) {
                    e +=(char) encr.encriptar(textoPalabra.codePointAt(i));
                    e2 += encr.encriptar(textoPalabra.codePointAt(i)) + " , ";
                    inter.setTexto(e);
                    inter.setTexto2(e2);    
                    textoEncriptado=e;
                }
            }
            if (evento.getSource().equals(inter.getBtnDes())){
                encr.FI(encr.p, encr.q);
                encr.Z(encr.p, encr.q);
                encr.S(encr.n);
                e=""; e2="";
                for(i=0;i<textoEncriptado.length();i++) {
                    e +=(char) encr.desencriptar(textoEncriptado.codePointAt(i));
                    e2 += encr.desencriptar(textoEncriptado.codePointAt(i)) + " , ";
                    inter.setTexto(e);
                    inter.setTexto2(e2);
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor ingresa correctamente todos los datos");
        }
           
        }
    }
    

