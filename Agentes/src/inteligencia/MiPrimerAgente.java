/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligencia;
import jade.core.*;


public class MiPrimerAgente extends Agent {
    

    public void setup(){
        Object [] listaparametros = getArguments();
        String primerArgumento = (String)listaparametros[0];
        System.out.println("hola soy el Primer Agente "+getLocalName()+"Argumento "+ primerArgumento);
    }



}
