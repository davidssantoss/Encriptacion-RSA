package rsa;

import java.awt.Color;
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
    JLabel etqfrs = new JLabel("ASCII: ");
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
        c.setBackground(Color.LIGHT_GRAY);
        c.add(etqp);
        etqp.setBounds(10, 10, 20, 20);
        
        c.add(txtp);
        txtp.setBounds(50, 10, 80, 20);
        
        c.add(etqq);
        etqq.setBounds(160, 10, 20, 20);
        
        c.add(txtq);
        txtq.setBounds(200, 10, 80, 20);
        
        c.add(etqn);
        etqn.setBounds(300, 10, 20, 20);
        
        c.add(txtn);
        txtn.setBounds(380, 10, 80, 20);
        
        c.add(etqpal);
        etqpal.setBounds(10, 70, 200, 50);
        
        c.add(txtplbra);
        txtplbra.setBounds(50, 150, 300, 50);
        
        c.add(enc);
        enc.setBounds(10, 250, 100, 70);
        
        c.add(des);
        des.setBounds(150, 250, 200, 70);
        
        c.add(etqres);
        etqres.setBounds(10, 410, 400, 80);
        
        c.add(etqfrs);
        etqfrs.setBounds(500, 300, 300, 70);
        
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
    public String getTexto(){
		return txtplbra.getText();
	}
    public void setTexto(String s){
        etqfrs.setText(s);
    }
    public void setTexto2(String s){
        etqres.setText("letras en ASCII: "+s);
    }
    
    
}
