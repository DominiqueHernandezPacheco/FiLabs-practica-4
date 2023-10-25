/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electronicos;

public class Celular extends DispositivoMovil{
    
    private String numero;
    
    public Celular(String numero){
        super(0);
        this.numero = numero;
    }
    
    public void llamar(String numero){
        System.out.println("Llamando..." + numero);
    }
    

}
