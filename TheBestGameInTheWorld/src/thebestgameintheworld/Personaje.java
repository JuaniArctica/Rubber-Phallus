/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebestgameintheworld;

import javax.swing.JOptionPane;
import Menues.CrearPj;
import Menues.PantallaJuego;
import javax.swing.JTextField;
/**
 *
 * @author prouser
 */
public class Personaje extends CrearPj {
    
//ATRIBUTOS    
    private CrearPj refCrearPj;
    
    private String Nombre;
    
    private int VidaMax;
    
    private int GolpeMax;
    
    private int GolpeMin;
    
    private int Defensa;

    private int Nivel;

    private int ExpMin;

    private int ExpMax;
    
    private int Clase;
    
    //private Combate refCombate;


//CONSTRUCTORES    
    public Personaje() {
    }

    public Personaje(String Nombre, int VidaMax, int GolpeMax, int GolpeMin, int Defensa, int Nivel, int ExpMin, int ExpMax) {
        this.Nombre = Nombre;
        this.VidaMax = VidaMax;
        this.GolpeMax = GolpeMax;
        this.GolpeMin = GolpeMin;
        this.Defensa = Defensa;
        this.Nivel = Nivel;
        this.ExpMin = ExpMin;
        this.ExpMax = ExpMax;
    }
    
    

    
//METODOS
    public int getGolpeMin() {
        return GolpeMin;
    }

    public void setGolpeMin(int GolpeMin) {
        this.GolpeMin = GolpeMin;
    }

    public int getGolpeMax() {
        return GolpeMax;
    }

    public void setGolpeMax(int GolpeMax) {
        this.GolpeMax = GolpeMax;
    }

    
    public int getVidaMax() {
        return VidaMax;
    }

    public void setVidaMax(int VidaMax) {
        this.VidaMax = VidaMax;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;

    }
    
    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }    
    
     public int getExpMax() {
        return ExpMax;
    }

    public void setExpMax(int ExpMax) {
        this.ExpMax = ExpMax;
    }    

    public int getExpMin() {
        return ExpMin;
    }

    public void setExpMin(int ExpMin) {
        this.ExpMin = ExpMin;
    }
    
    public int getClase() {
        return Clase;
    }

    public void setClase(int Clase) {
        this.Clase = Clase;
    }

    public void ElegirClase(){
        
        int Detective = 1;
        int Explorador= 2;
        int Policia=3;
        
        String claseC;
        int clase;
        
       // claseC= JOptionPane.showInputDialog("Elige tu Clase:\n\nDetective = 1\nExplorador = 2");
        clase= 1;
        
        if (clase == 1) {
            //CREAMOS UN DETECTIVE CON SUS CORRESPONDIENTES STATS
            Personaje.this.setVidaMax(10);
            Personaje.this.setDefensa(10);
            Personaje.this.setExpMax(15);
            Personaje.this.setExpMin(0);
            Personaje.this.setGolpeMax(10);
            Personaje.this.setGolpeMin(5);            
            Personaje.this.setNivel(1);
            
           
           // System.out.println("Felicitaciones Detective "+Personaje.this.getNombre()+" comencemos la historia...");
            
        } else if (clase == 2) {
            //CREAMOS UN EXPLORADOR CON SUS CORRESPONDIENTES STATS
            Personaje.this.setVidaMax(8);
            Personaje.this.setDefensa(12);
            Personaje.this.setExpMax(15);
            Personaje.this.setExpMin(0);
            Personaje.this.setGolpeMax(7);
            Personaje.this.setGolpeMin(6);            
            Personaje.this.setNivel(1);
            
           // System.out.println("Felicitaciones Dr. "+Personaje.this.getNombre()+" comencemos la historia...");
        
        }else if (clase == 3) {
            //CREAMOS UN EXPLORADOR CON SUS CORRESPONDIENTES STATS
            Personaje.this.setVidaMax(12);
            Personaje.this.setDefensa(8);
            Personaje.this.setExpMax(15);
            Personaje.this.setExpMin(0);
            Personaje.this.setGolpeMax(12);
            Personaje.this.setGolpeMin(4);            
            Personaje.this.setNivel(1);
            
            //System.out.println("Felicitaciones Oficial "+ Personaje.this.getNombre()+ " comencemos la historia...");
        }
        

        
    }    
    
    public void PjGetEstado (){
        
        System.out.println("Nombre: "+ Personaje.this.getNombre()+" - Nivel "+ Personaje.this.getNivel());        
        System.out.println("Vida: "+ Personaje.this.getVidaMax());
        System.out.println("Golpe: "+ Personaje.this.getGolpeMin()+"/"+Personaje.this.getGolpeMax());
        System.out.println("Defensa: "+ Personaje.this.getDefensa());
        System.out.println("Experiencia: "+Personaje.this.getExpMin()+"/"+Personaje.this.getExpMax());

        
    }
    
    public void crearPj (){
    
    //PERSONAJE CONSTRUCTOR: Nombre, VidaMax, GolpeMax, GolpeMin, Defensa, Nivel, ExpMin, ExpMax 
    Personaje pj1 = new Personaje();
    
 
    System.out.println("-----------------------");
    pj1.PjGetEstado();
    System.out.println("-----------------------");  
    
    }

    
}