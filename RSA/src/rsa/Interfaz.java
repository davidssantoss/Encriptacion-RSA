package rsa;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author david
 */
public class Interfaz extends JFrame{
    JLabel etqp = new JLabel("P: ");
    JLabel etqq = new JLabel("Q: ");
    JLabel etqn = new JLabel("N: ");
    JLabel etqpal = new JLabel("Digite la palabra a encriptar: ");
    JLabel etqres = new JLabel("Resultado: ");
    JLabel etqfrs = new JLabel();
    JTextField txtp = new JTextField();
    JTextField txtq = new JTextField();
    JTextField txtn = new JTextField();
    JTextField txtplbra = new JTextField();
    JButton enc = new JButton("Encriptar");
    JButton des = new JButton("Desencriptar");

    public Interfaz() {
        this.setTitle("Metodo de encriptacion RSA");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.add(etqp);
        c.setBounds(10, 10, 20, 20);
        
        c.add(txtp);
        c.setBounds(50, 10, 80, 20);
        
        c.add(etqq);
        c.setBounds(160, 10, 20, 20);
        
        c.add(txtq);
        c.setBounds(200, 10, 80, 20);
        
        c.add(etqn);
        c.setBounds(300, 10, 20, 20);
        
        c.add(txtn);
        c.setBounds(380, 10, 80, 20);
        
        c.add(etqpal);
        c.setBounds(10, 70, 200, 50);
        
        c.add(txtplbra);
        c.setBounds(50, 150, 300, 300);
        
        c.add(enc);
        c.setBounds(10, 500, 100, 70);
        
        c.add(des);
        c.setBounds(100, 500, 100, 70);
        
        c.add(etqres);
        c.setBounds(10, 610, 200, 80);
        
        c.add(etqfrs);
        c.setBounds(300, 500, 100, 70);
        
    }
    void mostrar(){
        setVisible(true);
        setSize(900, 900);
    }
    void asignarOyente (Controlador c){
        enc.addActionListener(c);
        des.addActionListener(c);        
    }
    
    public JButton getBtnEnc(){
        return enc;
    }
    public JButton getBtnDes(){
        return des;
    }
    public void setTexto(String s){
        etqfrs.setText(s);
    }
    public void setTexto2(String s){
        etqres.setText("letras en ASCII: "+s);
    }
    
    
    
}
