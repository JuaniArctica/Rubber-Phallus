

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menues;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Timer;
/**
 *
 * @author Damian
 */
public class BoldPrograming extends javax.swing.JFrame {

    private final JFXPanel jfxPanel = new JFXPanel();  
    
    /**
     * Creates new form BoldPrograming
     * @throws javax.sound.sampled.LineUnavailableException
     * @throws java.net.URISyntaxException
     * @throws javax.sound.sampled.UnsupportedAudioFileException
     * @throws java.io.IOException
     */
    public BoldPrograming() throws LineUnavailableException, URISyntaxException, UnsupportedAudioFileException, IOException  {
        
        initComponents();
        Main ventana = new Main();      
         

        //Añadimos el panel de JavaFX al JPanel Swing
        jPanel1.setSize(800, 600);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(jfxPanel,BorderLayout.CENTER);
        
        
        //VIDEO
        Platform.runLater(() -> {

              File file = new File("src/Menues/Videos/b.mp4");                                  
                    MediaPlayer oracleVid = new MediaPlayer(                                       
                        new Media(file.toURI().toString())
                    );

            //se añade video al jfxPanel
            jfxPanel.setScene(new Scene(new Group(new MediaView(oracleVid))));
            oracleVid.setVolume(0.1);//volumen
            oracleVid.setCycleCount(1);//repite video
            oracleVid.play();//play video   

//CERRAMOS LA VENTANA DESPUES DE 23 SEGUNDOS

//       Timer timer = new Timer (23000, (ActionEvent e) -> {        
//        
//        
//        ventana.setVisible(true);
//        this.dispose();
//        oracleVid.stop();
//        
//
//              }); 
//    timer.start(); 


//FIN TIMER       

        
        //Metodo para saltar presentacion con letra escape///////////////////////////////
        KeyboardFocusManager kb = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        kb.addKeyEventPostProcessor((KeyEvent e) -> {
            if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
            
              
            ventana.setVisible(true);
            this.dispose(); 
            oracleVid.stop();
            
            return true;
        });
        //Metodo para saltar presentacion con letra escape///////////////////////////////
            
    
            
        });
        //FIN SCRIPT VIDEO
        
        
       
        this.setLocationRelativeTo(null);
        this.setBackground(Color.BLACK);
                   

        
        


    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblescape = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setFocusable(false);
        setUndecorated(true);
        setSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblescape.setForeground(new java.awt.Color(255, 255, 255));
        lblescape.setText("Presione Escape para continuar...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(lblescape)
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(lblescape)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                    

 


    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BoldPrograming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoldPrograming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoldPrograming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoldPrograming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new BoldPrograming().setVisible(true);
            } catch (LineUnavailableException | URISyntaxException | UnsupportedAudioFileException | IOException ex) {
                Logger.getLogger(BoldPrograming.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblescape;
    // End of variables declaration//GEN-END:variables
}
