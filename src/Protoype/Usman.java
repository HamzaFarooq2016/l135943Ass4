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
public class Usman implements Person{
    
     private final String NAME = "usman";

    @Override
    public Person clone() {
        return new Usman();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
