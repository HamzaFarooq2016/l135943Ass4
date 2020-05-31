/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Protoype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hamza Farooq
 */
public class Factory {
    
    private static final Map<String, Person> prototypes = new HashMap<>();

    static {
        prototypes.put("Umer", new Umer());
        prototypes.put("Ali", new Ali());
        prototypes.put("Usman", new Usman());
    }

    public static Person getPrototype(String type) {
        try {
            return prototypes.get(type).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }
    }
}
