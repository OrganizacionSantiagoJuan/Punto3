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
public class HelloActor extends UntypedActor {
    
    
    int a=0;

    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof String) {
            String s = (String) message;
            switch (s) {
                case "Impresion": {   
                    
                    System.out.println("Base: "+a);
                    break;
                }
                default:                    
                    System.out.println("huu?");
            }
        } else if (message instanceof Integer){
            int x=(int) message;
            a=a+x;            
        }
        else {
            unhandled(message);
        }
        

    }

    public int getA() {
        return a;
    }
    
    
    
}
