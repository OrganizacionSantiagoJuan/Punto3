/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import akka.actor.*;

/**
 *
 * @author camilo
 */
public class Punto3 {
    
    
      

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        
        int a[]={47,10,-5};
        int b[]={-15,5};
        
               
        Props propCliente=Props.create(Cliente.class);
        Props propBanco=Props.create(Banco.class);
        
        
        
        ActorSystem system = ActorSystem.create("Hola");
        
        ActorRef clienteA = system.actorOf(propCliente , "ClienteA");
        ActorRef clienteB = system.actorOf(propCliente , "ClienteB");
        ActorRef banco = system.actorOf(propBanco , "Banco");

        for(int i=0;i<a.length;i++)
            clienteA.tell(a[i], banco);
        
        for(int i=0;i<b.length;i++)
            clienteB.tell(b[i], banco);
        
        Thread.sleep(10);
        banco.tell("a", banco);
        
        system.shutdown();
        system.awaitTermination();//JOIN       

    }

}
