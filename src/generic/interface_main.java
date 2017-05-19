/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author Nahian
 */
public class interface_main implements Gen_Interface<Integer>{
    
    @Override
    public void Gen_method(Integer ob1, Integer ob2) {
        if(ob1>ob2)
        {
            System.out.println("obect 1 is bigger");
        }
        else{
            System.out.println("Object 2 is bigger");
        }
    }
    
}
