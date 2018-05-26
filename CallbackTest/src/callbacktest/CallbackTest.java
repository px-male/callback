/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callbacktest;

/**
 *
 * @author katsubehiroshi
 */
public class CallbackTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Foo foo = new Foo();
        Bar bar = new Bar();
        bar.addCallback(foo);
        bar.execute();
        
    }   
    
}
