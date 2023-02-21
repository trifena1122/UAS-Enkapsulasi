/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enkapsulasi;

/**
 *
 * @author LENOVO
 */
public class website {
    public String admin;
    private String nama;
    protected String password;
    
    public website(String admin, String nama, String password) {
        
        this.admin=admin;
        this.nama=nama;
        this.password=password;
    }
   public String getadmin(){
       return admin;
       } 
   public String getnama(){
       return nama;
   }   
       public String getpassword (){
       return password;
       
       }
    
}


