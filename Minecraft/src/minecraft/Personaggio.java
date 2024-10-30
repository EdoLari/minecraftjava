/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minecraft;

/**
 *
 * @author edoar
 */
public class Personaggio {
    private String nome;
    private int salute, fame, danni,velocita;
    private Armatura armatura;
    
    public Personaggio(String nome){
        this.nome=nome;
        this.salute=20;
        this.fame=30;
        this.velocita=10;
        this.armatura=null;
        this.danni=0;
    }
    public Personaggio(){
        this.nome="Steve";
        this.salute=20;
        this.fame=10;
        this.velocita=10;
        this.armatura=null;
        this.danni=0;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setSalute(int salute){
        if(salute<20&&salute>0)
            this.salute=salute;
        else
            System.out.println("La salute non e' valida ");
    }
    public void setFame(int fame){
        if(fame<20&&fame>0)
            this.fame=fame;
        else
            System.out.println("La fame non e' valida ");
    }
    public void setDanno(int danni){
        if(danni>0)
            this.danni=danni;
        else
            System.out.println("La danni non e' valida ");
    }    
    public void setVelocita(int velocita){
        if(velocita>0)
            this.velocita=velocita;
        else
            System.out.println("La velocita non e' valida ");
    }    
    public void setArmatura(Armatura armatura){
           this.armatura=armatura;
    }
    public String getNome(){
        return nome;
    }
        public int getSalute(){
        return salute;
    }
    public int getFame(){
        return fame;
    }
    public int getDanni(){
        return danni;
    }
    public int getVelocita(){
        return velocita;
    }
    public Armatura getArmatura(){
        return this.armatura;
    }
    public void caduta(int blocchi){
        int danno;
        if(blocchi>3){
            danno=blocchi-3;
            this.salute=this.salute-danno;
        }
    }
    public void mangia(int cibo){       
        switch (cibo) {
        //mela
            case 1:
                this.fame=this.fame+1;
                break;
        //pollo
            case 2:
                this.fame=this.fame+2;        
                break;
        //carne
            case 3:
                this.fame=this.fame+3;
                break;
        //pesce
            case 4:
                this.fame=this.fame+4;
                break;
            default:
                System.out.println("non posso mangiarlo");
                break;
        }
        if(this.fame>30){
            this.fame=30;
            System.out.println("ho la saturazione piena");
        }
        }
    
}