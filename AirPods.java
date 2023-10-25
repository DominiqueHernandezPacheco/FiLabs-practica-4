
import Electronicos.DispositivoMovil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



public class AirPods extends DispositivoMovil {
    
    private String modeloAirpods;
    private Boolean reproducir;
    
    public AirPods(String modeloAirpods){
        super(0);
        this.modeloAirpods = modeloAirpods;
    }
    
    public void pausarMusica(Boolean reproducir){
        this.reproducir = reproducir;
        if(reproducir==false){
            System.out.println("Musica Pausada ");
    } else {
        System.out.println("Reproduciendo Musica");
    }
    
}
}