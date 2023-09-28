/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest1;

/**
 *
 * @author 62812
 */
import java.util.ArrayList;

public class Posttest1 {
    public static void main(String[] args){
        ArrayList<Realmadrid> realmadrid = new ArrayList<>();
        
        realmadrid.add(new Realmadrid("Cristiano Ronaldo", "LW", "7", "38"));
        realmadrid.add(new Realmadrid("Karim Mostafa Benzema", "CF", "9", "35"));
        realmadrid.add(new Realmadrid("Gareth Bale", "RW", "11", "34"));
        realmadrid.add(new Realmadrid("Zinedine Yazid Zidane", "CAM", "5", "51"));
        realmadrid.add(new Realmadrid("Iker Casillas Fernandez", "GK", "1", "42"));


        System.out.println("==========================================\n");
        System.out.println("Biodata Singkat Mantan Pemain Real Madrid \n");
        System.out.println("==========================================\n");
        
        
        for (Realmadrid pemain : realmadrid){
            System.out.print(pemain);
        }
    }
    
}
