/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minecraft;
import java.util.Scanner;
/**
 *
 * @author edoar
 */
public class Minecraft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        String nome, materiale;
        int scelta=0, cibo, blocchi;
        System.out.println("inserisci il nome del mob ");
        nome=input.nextLine();
        Armatura armatura=null;
        
        Personaggio personaggio1=new Personaggio(nome);
        Personaggio steve=new Personaggio();
        
        do{
            System.out.println("inserire 1. per mangiare");
            System.out.println("inserire 2. per l'armatura");
            System.out.println("inserire 3. per la caduta");
            System.out.println("insrire 0. per uscire");
            scelta=input.nextInt();
            switch (scelta){
                case 1:
                    System.out.println("fame:"+personaggio1.getFame());
                    System.out.println("cosa vuoi mangiare ? ");
                    System.out.println("1.  mela");
                    System.out.println("2.  pollo");
                    System.out.println("3.  carne");
                    System.out.println("4. pesce ");
                    cibo=input.nextInt();
                    personaggio1.mangia(cibo);
                    System.out.println("fame:"+personaggio1.getFame());
                    break;
                case 2:
                    System.out.println("inserisci il materiale dell'armatura");
                    input.nextLine();
                    materiale=input.nextLine();
                    System.out.println("l'armatura e' "+materiale);
                    armatura=new Armatura (materiale);
                    personaggio1.setArmatura(armatura);
                    System.out.println("nome armatura "+personaggio1.getArmatura().getNome());
                    break;
                case 3:
                    System.out.println("salute "+personaggio1.getSalute());
                    System.out.println("inserisci da quanti blocchi caschi ?");
                    blocchi=input.nextInt();
                    personaggio1.caduta(blocchi);
                    System.out.println("salute "+personaggio1.getSalute());
                    break;
                case 0:
                    default:
                    break;
                }
        }while(scelta!=0);
        System.out.println("Arrivederci...");
    }    
}
