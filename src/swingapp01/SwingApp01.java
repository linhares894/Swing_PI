
package swingapp01;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingApp01 {
 
    public static void main(String[] args) {
        
        Runnable thread = new Runnable() {
	public void run() {
		criarGUI();
	  }
       };
       
       SwingUtilities.invokeLater(thread);

    }
    public static void criarGUI () {
            
            // nova instancia de um JFrame
            JFrame frame = new JFrame();
            
            // fechamento do JFrame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // criando uma label
            JLabel label = new JLabel("Welcome to World! ");
            frame.getContentPane().add(label);

            //abrir janela
            frame.pack();
            frame.setVisible(true);

    }
}
    

