
package boletin23;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class boletin23 extends JFrame{

    public static void main (String[] args){
        boletin23 nueva = new boletin23();
    }
    private JPanel jPAutentificar, jPBotones, jPEscribir;
    private JLabel jLPassword, jLNombre;
    private JTextField jTNombre, jTTexto;
    private JPasswordField jPPassword;
    private JButton jBClick, jBDelete, jBClick2;
    private JList<String> jLLista;


    public boletin23() {
        jPAutentificar = new JPanel();
        jPEscribir = new JPanel();
        jPBotones = new JPanel();
        jLNombre =  new JLabel();
        jLPassword = new JLabel();
        jTNombre = new JTextField();
        jPPassword = new JPasswordField();
        jBClick = new JButton("Premer");
        jBDelete = new JButton("Borrar");
        jLLista = new JList<String>();
        jBClick2 = new JButton();
        jTTexto = new JTextField();

        this.setLayout(new BorderLayout());
        this.setSize(400, 300);

        jLNombre.setText("Nombre");
        jLNombre.setSize(100, 50);

        jLPassword.setText("Contraseña");
        jLPassword.setSize(100, 50);

        jTNombre.setSize(100, 50);

        jPPassword.setText("BOLETIN23");
        jPPassword.setSize(100, 50);

        jPAutentificar.setSize(400, 100);
        jPAutentificar.setLayout(new GridLayout(2,2));
        jPAutentificar.add(jLNombre);
        jPAutentificar.add(jTNombre);
        jPAutentificar.add(jLPassword);
        jPAutentificar.add(jPPassword);

        jBClick.setSize(100, 50);

        jBDelete.setSize(100, 50);

        jPBotones.setSize(400, 100);
        jPBotones.setLayout(new FlowLayout());
        jPBotones.add(jBClick);
        jPBotones.add(jBDelete);

        String[] contenido = {"a", "b", "c", "d"};
        jLLista.setListData(contenido);

        jBClick2.setText("Confirmar");
        jPEscribir.setSize(400, 100);
        jPEscribir.setLayout(new GridLayout(1, 3));
        jPEscribir.add(jLLista);
        jPEscribir.add(jBClick2);
        jPEscribir.add(jTTexto);

        this.add(jPAutentificar, BorderLayout.NORTH);
        this.add(jPBotones, BorderLayout.CENTER);
        this.add(jPEscribir, BorderLayout.SOUTH);

        this.setVisible(true);


    }


    
}
