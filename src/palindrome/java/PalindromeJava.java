/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome.java;

import javax.swing.JOptionPane;

/**
 *
 * @author anarc6700
 */
public class PalindromeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String palindrome = JOptionPane.showInputDialog("Words that are "
               + "the same when spelled the same when written back words and "
               + "forwards are called palindromes." + "\n\nplease enter a word");
      
        String maby; 
    maby = palindrome.toUpperCase();
    
       StringBuilder power = new StringBuilder(maby).reverse();
       String win = power.toString();
       if(win.equalsIgnoreCase(palindrome)){
       JOptionPane.showMessageDialog(null, palindrome + " backwards is "
               + power + " therefore " + palindrome + " is an palindrome. ");
       }else{
           JOptionPane.showMessageDialog(null, palindrome + " backwards is "
               + power + " therefore " + palindrome + " is not palindrome. ");
    }
    
}
}