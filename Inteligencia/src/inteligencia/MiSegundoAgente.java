/*
 * Agente con comportamiento simple
 */
package inteligencia;
import jade.core.Agent;
import jade.core.behaviours.*;


public class MiSegundoAgente extends Agent {
    
    //definicion de un comportanmineto simple dentro de una clase
    class TareaSimple extends SimpleBehaviour {
        public void action(){
            for(int i=0;i<10;i++)
                System.out.println("Ciclo "+" "+i);
        }
        
        public boolean done(){
            return true;
        }
        
    }
    protected void setup(){
         System.out.println("Mi Segundo Agente con comportamiento jade");
         TareaSimple cl = new TareaSimple();
         this.addBehaviour(cl);
        
    }
            
}
