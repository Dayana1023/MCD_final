/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximocomundivisor;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author dayan
 */
public class tresnumeros extends javax.swing.JPanel {
ArrayList<String> residuos;
ArrayList<Integer> listaA = new ArrayList<>();
ArrayList<Integer> listaB = new ArrayList<>();
ArrayList<Integer> listaC = new ArrayList<>();
ArrayList<Integer> todosNum = new ArrayList<>();
String auxS = "";
String convi="";
int resi, result;

    public tresnumeros() {
        this.residuos = new ArrayList<>();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        procedimiento = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        numero1 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        numero3 = new javax.swing.JTextField();
        resultado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(33, 71, 83));

        button1.setBackground(new java.awt.Color(48, 164, 176));
        button1.setFont(new java.awt.Font("Sitka Heading", 0, 21)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Calcular");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        procedimiento.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 0, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Minimo comun divisor de 3 numeros");

        numero1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });
        numero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero1KeyTyped(evt);
            }
        });

        numero2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        numero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero2KeyTyped(evt);
            }
        });

        numero3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        numero3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero3KeyTyped(evt);
            }
        });

        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        resultado.setForeground(new java.awt.Color(255, 255, 255));
        resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(procedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(procedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero1ActionPerformed

    private void numero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero1KeyTyped
          char c = evt.getKeyChar();       
        if (c<'0' || c>'9' ) evt.consume();
    }//GEN-LAST:event_numero1KeyTyped

    private void numero2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero2KeyTyped
        char c = evt.getKeyChar();       
        if (c<'0' || c>'9' ) evt.consume();
    }//GEN-LAST:event_numero2KeyTyped

    private void numero3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero3KeyTyped
        char c = evt.getKeyChar();       
        if (c<'0' || c>'9' ) evt.consume();
    }//GEN-LAST:event_numero3KeyTyped

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
todosNum.clear(); residuos.clear();
listaA.clear(); listaB.clear(); listaC.clear();

auxS = "";
resi=0;
result=0;
procedimiento.setEditable(false);
 String num1,num2,num3;
 num1 = numero1.getText();        
 num2 = numero2.getText(); 
 num3 = numero3.getText(); 
 
 
if("0".equals(num1) || "0".equals(num2)|| "0".equals(num3)){
         System.out.println("no se puede");
         resultado.setText( "no se puede");
         procedimiento.setText("no se puede");
            } 
         
else{
procedimiento.setText("\nProcedimiento: ");   
procedimiento.append("\n--------------------------------------------");    
procedimiento.append("\nPaso 1: Algoritmo de euclides ");

 todosNum.add(Integer.parseInt(num1));
 todosNum.add(Integer.parseInt(num2));
 todosNum.add(Integer.parseInt(num3));
mayores(todosNum);
//divisor(todosNum.get(0),todosNum.get(1));

residuosM();
procedimiento.append("\n");    
iteraciones();
resultado.setText( "\nMCD:  "+result);

repaint();
}
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    private javax.swing.JTextField numero3;
    private java.awt.TextArea procedimiento;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables

public int divisor(int A, int B) {

if (A == 0){
return B;}

if (B == 0){
return A;}

resi = (A % B);
procedimiento.append("\n"+A+" = " + B + " x " + (A / B) + " + " + resi);

if (resi != 0) {
residuos.add(resi + " =  " + A + " - " + (A / B) + " x " + B );
listaA.add(A);
listaB.add(-1 * (A / B));
listaC.add(B);
}

if (resi == 0) {
result = B;
procedimiento.append("\n");
}

return divisor(B, resi);
}

public void residuosM() {
if (!residuos.isEmpty())
{
procedimiento.append("\nPaso 2: Despejamos los residuos");
}
for (int i = residuos.size() - 1; i >= 0; i--) {
procedimiento.append("\n"+residuos.get(i));
}
	}

public void iteraciones() {
		
		
if (residuos.isEmpty())
{
procedimiento.append("\nNo hay valores a reemplazar");
}
else
{
procedimiento.append("\nPaso 3: Reemplazamos los valores anteriores");
procedimiento.append("\n"+residuos.get(residuos.size() - 1));

int a, b, c, auxA = listaA.get(listaA.size() - 1), auxB = listaB.get(listaB.size() - 1), aux = 1;
String signo = "";
for (int i = residuos.size() - 2; i >= 0; i--) {
a = listaA.get(i);
b = listaB.get(i);
c = listaC.get(i);
procedimiento.append("\n"+result + " = " + aux + " x " + auxA + " + (" + auxB + ")(" + a + b + " x " + c+ ")" + auxS );
signo = " - ";
if (auxA == c) {
int ay1 = auxB * b;
int ay2 = aux + ay1;
procedimiento.append("\n"+result + " = " + auxB + " x " + a + " + (" + ay2 + ") x " + c + auxS );

if(i==0)
{
procedimiento.append("\n");        
procedimiento.append("\nLa combinación lineal es:");
procedimiento.append("\n"+ result + " = " + auxB + " x " + a + " + (" + ay2 + ") x " + c + auxS );

}
aux = auxB;
auxA = a;
auxB = ay2;
					
} else {
int ay1 = auxB * b;
auxS = auxS + "+ (" + aux + ") x " + auxA;
procedimiento.append("\n"+ result + " = " + auxB + " x " + a + " + (" + ay1 + ") x " + c + auxS);

if(i==0)
{
procedimiento.append("\nLa combinación resultante es:");
procedimiento.append("\n"+ result + " = " + auxB + " x " + a + " + (" + ay1 + ") x " + c + auxS);
}
aux = auxB;
auxA = a;
auxB = ay1;					
}
  }
    }
		
}
public void mayores(ArrayList<Integer> numeros) {
	
int aux=numeros.get(1);
for(int i=0; i<numeros.size();i++)
{
    if(i==1)
    {
        i=2;
    }
    aux=divisor(numeros.get(i), aux);
    
}	}




}
