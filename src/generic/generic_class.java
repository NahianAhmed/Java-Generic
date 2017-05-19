/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author Nahian
 * @param <t>
 */
public class generic_class<t> {
    t ob;
    t ob1;
            

    public generic_class(t x,t y) {
        ob = x;
        ob1 = y;
        
    }
    public <t> void genmethod(){
        System.out.println(ob+" "+ob1);
    
    }
    

    
    
}
