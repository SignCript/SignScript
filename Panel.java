/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackathon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashok
 */
public class Panel extends javax.swing.JPanel {

    /**
     * Creates new form Panel
     */
 
    int X=100,Y=100,thick,Block,pow;
    double result;
    double count;
    boolean b;
    ArrayList<Point> P;
    Stack<Point> S;
    Color C;
    
    public Panel() {
        initComponents();
        P=new ArrayList<Point>(1);
        P.add(new Point(2,2));
        S=new Stack<Point>();
        result=0.0;
        thick=5;
        Block=5;
        pow=3;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
        enter(evt.getPoint());
       
       
    }//GEN-LAST:event_formMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
       enter(evt.getPoint());
    }//GEN-LAST:event_formMouseDragged

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        b=true;
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        b=false;
    }//GEN-LAST:event_formMouseExited
     public void paintComponent(Graphics g){
         
         super.paintComponent(g);
         if(b){
         for(int i=0;i<P.size();i++){
             g.fillOval(P.get(i).x,P.get(i).y,thick,thick); 
           
         }
        }
     }
     
     public void check(Point P){
         
     }
     
      public void set(int t){
          thick=t;
      }
      
      public void erase(){
          P.clear();
          S.clear();
          result=0.0;
          repaint();
      }
      
      public void enter(Point M){
         /* M.x /=Block;
          M.y /=Block;*/
           P.add(M);
        if(b){
            if(S.isEmpty()){
                S.push(M);
                add(M);
                            }else{
                if(!S.peek().equals(M)){
                   S.push(M);
                   add(M);
                                   }
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Panel Disabled","Error",1);
        }
        repaint();
      }
      
      public void setReady(boolean state ){
          b=state;
      }
     public double res(){
          return result;
        
     }
     
      public void add(Point P){
          result +=(pow*P.x)+(P.y/pow);
         
     }
      
     /* public void res(){
          
          JOptionPane.showMessageDialog(this,"Resullt = "+result+" , Size = "+S.size());
      }*/
      
      public void setColor(Color c){
          setForeground(c);
      }
      
      
      public void setBlock(int a){
          Block=a;
      }
      
      public void setPow(int a){
        pow=a;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
