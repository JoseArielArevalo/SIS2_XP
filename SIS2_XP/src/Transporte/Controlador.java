/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Transporte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class Controlador {
    
 private Timer t;   
 int hora,min;
 
public Controlador(){
hora=00;
min=00;
t= new Timer(1000*60, acciones);
    
} 

private ActionListener acciones = new ActionListener() {

     @Override
     public void actionPerformed(ActionEvent e) {
         min++;
         
         if(min==60){
         hora++;
         min=00;
         }
         
         //actualizar panel
    }
    };

public String getHora(){
String tiempo = (hora<=9?"0":"")+hora+":"+(min<=0?"0":"")+min;
return tiempo ;
}

 
public void contadorTiempo(Chofer chof){
Chofer chofer= chof;

}    
    
    
    
    
}
