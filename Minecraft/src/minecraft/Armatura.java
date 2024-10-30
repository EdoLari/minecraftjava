/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minecraft;

/**
 *
 * @author edoar
 */
public class Armatura {
    private String nome;
    private String materiale;
    private int difesa;
    private int durabilita;
    
    
    
    public Armatura (String materiale){
        this.materiale=materiale;
        if(null != materiale)
            switch (materiale) {
            case "diamante":
                this.difesa=20;
                break;
            case "oro":
                this.difesa=15;
                break;
            case "ferro":
                this.difesa=10;
                break;
            case "pelle":
                this.difesa=5;
                break;
            default:
                break;
        }
              this.nome="armatura di "+materiale;      
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setMateriale(String materiale){
        this.materiale=materiale;
    }
    public void setDifesa(int difesa){
        if(difesa<20&&difesa>0)
            this.difesa=difesa;
        else
            System.out.println("La difesa non e' valida ");
    }
    public void setDurabilita(int durabilita){
        if(durabilita<100&&durabilita>0)
            this.durabilita=durabilita;
        else
            System.out.println("La durabilita non e' valida ");
    }
    public String getNome(){
        return nome;
    }
    public String getMateriale(){
        return materiale;
    }
    public int getDifesa(){
        return difesa;
    }
    public int getDurabilita(){
        return durabilita;
    }
}
