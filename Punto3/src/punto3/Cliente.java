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
public class Cliente extends UntypedActor {
    
    
    int a=0;

    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof Integer) {
            int a = (int) message;
            getSender().tell(a, getSelf());                       
        }
        else {
            unhandled(message);
        }
        

    }

    
    
    
    
}
