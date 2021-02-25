/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximocomundivisor;

import java.util.ArrayList;


public class dosnumeros extends javax.swing.JPanel {

ArrayList<String> residuos;
ArrayList<Integer> listaA = new ArrayList<>();
ArrayList<Integer> listaB = new ArrayList<>();
ArrayList<Integer> listaC = new ArrayList<>();
ArrayList<Integer> todosNum = new ArrayList<>();
String auxS = "";
String convi="";
int resi, result;
    public dosnumeros() {
        this.residuos = new ArrayList<>();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        numero1 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        button2 = new java.awt.Button();
        procedimiento = new java.awt.TextArea();

        setBackground(new java.awt.Color(33, 71, 83));
        setPreferredSize(new java.awt.Dimension(450, 350));

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 0, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Minimo comun divisor de 2 numeros");

        resultado.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        resultado.setForeground(new java.awt.Color(255, 255, 255));
        resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        numero1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        numero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero1KeyTyped(evt);
            }
        });

        numero2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });
        numero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero2KeyTyped(evt);
            }
        });

        button2.setBackground(new java.awt.Color(48, 164, 176));
        button2.setFont(new java.awt.Font("Sitka Heading", 0, 21)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setLabel("Calcular");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        procedimiento.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(procedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(procedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void numero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero1KeyTyped
         
        char c = evt.getKeyChar();       
        if (c<'0' || c>'9' ) evt.consume();
    }//GEN-LAST:event_numero1KeyTyped

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero2ActionPerformed

    private void numero2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero2KeyTyped
         char c = evt.getKeyChar();       
        if (c<'0' || c>'9' ) evt.consume();   
    }//GEN-LAST:event_numero2KeyTyped

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
todosNum.clear(); residuos.clear();
listaA.clear(); listaB.clear(); listaC.clear();

auxS = "";
resi=0;
result=0;
procedimiento.setEditable(false);
 String num1,num2;
 num1 = numero1.getText();        
 num2 = numero2.getText(); 
 
if("0".equals(num1) || "0".equals(num2)){
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
divisor(todosNum.get(0),todosNum.get(1));

residuosM();
procedimiento.append("\n");    
iteraciones();
resultado.setText( "\nMCD:  "+result);

repaint();
         }
    
    }//GEN-LAST:event_button2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
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
