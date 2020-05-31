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
public class Umer implements Person{
    
     private final String NAME = "Umer";

    @Override
    public Person clone() {
        return new Umer();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
