/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;
import java.util.*;
/**
 *
 * @author Nahian
 */
public class generic_nethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     gen(1);//passing integer
     gen("Nahian Ahmed");//passing string
    }
    
    
    
    public static <t> void  gen(t i){
        System.out.println(i);
}
}

