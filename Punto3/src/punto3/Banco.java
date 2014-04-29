/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto3;

import akka.actor.UntypedActor;

/**
 *
 * @author camilo
 */
public class Banco extends UntypedActor{
    
    int base=0;
    
    
    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof Integer) {
            int a = (int) message;
            base=base+a;            
        } else if(message instanceof String) {
            String s= (String) message;
            System.out.println("Base: "+base);
            
        }
        else {
            unhandled(message);
        }
        

    }
    
}
