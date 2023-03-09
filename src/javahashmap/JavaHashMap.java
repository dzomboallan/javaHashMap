/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javahashmap;

import java.util.HashMap;

/**
 *
 * @author hunnytaggy
 */
public class JavaHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int a = 10;
//        int b = 3;
//        int c = 88;
        
        HashMap <String, String> capitalCities= new HashMap<>();
//        happy.put("bobbyJoe1996", "FluffyP0nies!");
//        happy.put("helloKittyFan21", "AloeVera");
//        happy.put("coolguyswag", "password123");
//        happy.put("a", 10);
//        happy.put("b", 3);
//        happy.put("c", 88);
//        
//        System.out.println(happy);
//        
//        happy.remove("helloKittyFan21", "AloeVera");
//        System.out.println(happy);
//        System.out.println(happy.containsKey("coolguyswag"));
          
          capitalCities.put("England", "London");
          capitalCities.put("Germany", "Berlin");
          capitalCities.put("Norway", "Oslo");
          capitalCities.put("USA", "Washington DC");
          
          System.out.println(capitalCities);
          System.out.println("List size: "+capitalCities.size());
          
          System.out.println("Get London's capital city from the list: "+capitalCities.get("England"));
          System.out.println("");
          System.out.println("Remove: "+capitalCities.remove("England"));
          System.out.println("");
          System.out.println("New list size: "+capitalCities.size());
         
          for (String i : capitalCities.keySet()){
              System.out.println(i);
          }
          
          System.out.println("");
          
          for (String i : capitalCities.values()) {
              System.out.println(i);
          }
          System.out.println("");
          
        

    }
    
}
