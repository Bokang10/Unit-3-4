/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integerquestion3;

/**St10446180
 *seonya bokang
 * @author MY PC
 */
public class IntegerQuestion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome :)!To the random month generator!");
        
        int randomMonth = (int)(1 + Math.random()*12);
        
        String monthName = "";
        
      
        
        monthName = "January";
       monthName = "February";
       monthName = "March";
       monthName = "April";
       monthName = " May";
       monthName = "June";
       monthName = "July";
       monthName = "August";
       monthName = "September";
       monthName = "October";
       monthName = "November";
       monthName = "December";
       System.out.println("The program generated:" + randomMonth + "for"+ monthName);
    }
    }
    
