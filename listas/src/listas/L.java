/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;



/**
 *
 * @author Danie
 */
public class L{
   protected L next;
   protected Object val;
   public L(){
       
   }
    public L(Object c, L n) {
        this.val = c;
        this.next = n;
    }
    
    
}
