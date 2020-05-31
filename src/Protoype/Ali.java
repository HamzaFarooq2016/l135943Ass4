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
public class Ali implements Person{
    
     private final String NAME = "Ali";

    @Override
    public Person clone() {
        return new Ali();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
