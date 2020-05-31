/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Hamza Farooq
 */
public class SingletonDemo {
    
    public static void main(String args[]){
        
            DataSource ds = DataSource.getInstance("localhost" , "6060" , "Hamza Farooq" , "nopassword");
            System.out.println(ds.host);
            
            DataSource ds1 = DataSource.getInstance("172.19.10.1" , "5050" , "Haris Farooq" , "nopassword");
            System.out.println(ds1.host);
    }
}
