
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /**/
         String fileName = FileChooser.pickAFile();
         Picture pictObj = new Picture(fileName);
         pictObj.explore();
         
         //relative path
         Picture apic = new Picture("images\\beach.jpg");
         //change with selfie picture
         Picture me = new Picture("images/jenny-red.jpg");
         Picture me1 = new Picture("images/beach.jpg");
         Picture me2 = new Picture("images/beach.jpg");
        
         /**
          * method 1 change
          * 
          */
        Pixel[] Mpixels;
        Mpixels = me.getPixels();
        Color offwhite = new Color(240,240,225);
        Color boldred = new Color(243,60,60);
        Color boldblue = new Color(50,177,235);
        Color lightblue = new Color(60,205,211);
            for (Pixel spot1 : Mpixels){
            int red=spot1.getRed();
            int blue=spot1.getBlue();
            int green=spot1.getGreen();
            int avg=(red+blue+green)/3;
            if (avg >= 160){
                spot1.setColor(offwhite);
            }
            if (avg < 160 && avg >=125){
                spot1.setColor(lightblue);
            }
            if (avg <125 && avg >=75){
                spot1.setColor(boldblue);
            }
            if (avg <75){
                spot1.setColor(boldred);
            }
        }
        me.explore();

         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
