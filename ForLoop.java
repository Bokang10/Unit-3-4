/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloop;

/**
 * Bokang Seonya
 * st 10446180
 * @author MY PC
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = " John Wick ";
        String reverse = "";
        
        
         for ( int i = str.length()-1; i>=0; i--)
 
           reverse+=str.charAt(i);
         
          System.out.println(reverse);
    }
}
