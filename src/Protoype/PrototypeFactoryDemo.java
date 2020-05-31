/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Protoype;

/**
 *
 * @author Hamza Farooq
 */
public class PrototypeFactoryDemo {
    
    public static void main(String[] args) {
        if (args.length > 0) {
            for (String type : args) {
                Person prototype = Factory.getPrototype(type);
                if (prototype != null) {
                    System.out.println(prototype);
                }
            }
        } else {
            System.out.println("Run again with arguments of command string ");
        }
    }
}
