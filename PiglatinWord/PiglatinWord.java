/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PiglatinWord;
import java.util.*;
public class PiglatinWord
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the word to be converted.");
        String word=ob.next();
        word=word.toUpperCase();
        String piglatin="";
        int flag=0;
        for(int i=0;i<word.length();i++)
        {
            char x=word.charAt(i);
            if(x=='A' || x=='E' || x=='I' || x=='O' ||x=='U')
            {
                piglatin=word.substring(i)+word.substring(0,i)+"AY";
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            piglatin=word+"AY";
        }
        System.out.println(word+" in Piglatin format is "+piglatin);
    }
}
