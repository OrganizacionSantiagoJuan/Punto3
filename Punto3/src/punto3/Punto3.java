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
        
               
        Props prop=Props.create(HelloActor.class);
        
        
        
        ActorSystem system = ActorSystem.create("Hola");
        ActorRef helloActor = system.actorOf(prop , "hola");
        
        for(int i=0;i<a.length;i++)
            helloActor.tell(a[i], helloActor);
        
        for(int i=0;i<b.length;i++)
            helloActor.tell(b[i], helloActor);
        
        helloActor.tell("Impresion", helloActor);
        
        
        system.shutdown();
        system.awaitTermination();//JOIN
        
        
        
        
        
        

    }

}
