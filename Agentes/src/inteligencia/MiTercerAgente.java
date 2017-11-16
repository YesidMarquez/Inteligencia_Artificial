/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inteligencia;
import jade.core.Agent;
import jade.core.behaviours.*;

/**
 *
 * @author Matias
 */
public class MiTercerAgente extends Agent{
    //Comportamiento ciclico
    class Comportamiento extends CyclicBehaviour {
        int limite = 100;
        public void action(){
            limite++;
             System.out.println("Limite es "+limite);
            
        }
        
        
    }
    protected void setup(){
        System.out.println("Hola soy un agente con um comportamiento Ciclico");
        Comportamiento c1= new Comportamiento();
        addBehaviour(c1);
        System.out.println("Ya se Cargo el Comportamiento");      
    }
    
}
