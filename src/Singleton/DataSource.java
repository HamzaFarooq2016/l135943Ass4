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
public class DataSource {
    
    String host;
    String port;
    String username;
    String password;
    
    private static DataSource instance;
    
    private DataSource(){
        
        this.host = "some default host";
        this.password = "some default password";
        this.port = "some default port";
        this.username = "some default username";
    }
    
    private DataSource(String host, String port, String username, String password)
    {
        this.host = host;
        this.password = password;
        this.port = port;
        this.username = username;
    }
    
    public static DataSource getInstance(){
        if(instance == null){
            instance = new DataSource();
        }
        return instance;
    }
    
     public static DataSource getInstance(String host, String port, String username, String password){
        if(instance == null){
            instance = new DataSource(host, port, username, password);
        }
        return instance;
    }
}
