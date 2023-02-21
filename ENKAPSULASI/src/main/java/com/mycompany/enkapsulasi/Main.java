/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enkapsulasi;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main ( String args []) {
        website data=new website ("Trifena","Rajagukguk","1234medan");
        System.out.println("Nick Admin         :"+data.admin);
        System.out.println("Nama Asli Admin    :"+data.getnama());
        System.out.println("Password           :"+data.password);
        
    }
}
