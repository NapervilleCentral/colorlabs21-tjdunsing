
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
         Picture hi = new Picture("images/IMG_1168.jpeg");
         Picture hi2 = new Picture("images/IMG_1168.jpeg");
         Picture hi3 = new Picture("images/IMG_1168.jpeg");
         /**
          * method 1 change
          * 
          */
        Pixel[] Mpixels;
        Mpixels = me.getPixels();
        Pixel[] Mpixels11;
        Mpixels11 = me1.getPixels();
        Pixel[] Mpixels2;
        Mpixels2 = hi.getPixels();
        Pixel[] Mpixels3;
        Mpixels3 = hi2.getPixels();
        Pixel[] Mpixels4;
        Mpixels4 = hi3.getPixels();
        Color offwhite = new Color(240,240,225);
        Color boldred = new Color(243,60,60);
        Color boldblue = new Color(50,177,235);
        Color lightblue = new Color(60,205,211);
            for (Pixel spot1 : Mpixels){
            int red=spot1.getRed();
            int blue=spot1.getBlue();
            int green=spot1.getGreen();
            int avg=(red+blue+green)/3;
            if (avg <64 ){
                spot1.setColor(boldred);
            }
            else if (avg < 128){
                spot1.setColor(boldblue);
            }
            else if (avg <192){
                spot1.setColor(lightblue);
            }
            else if (avg <=255){
                spot1.setColor(offwhite);
            }
        }
        me.explore();

         /**
          * method 2 change
          * 
          */
         int min = 255;
         int max = 0;
             for (Pixel spot1 : Mpixels11){
            int red=spot1.getRed();
            int blue=spot1.getBlue();
            int green=spot1.getGreen();
            int avg=(red+blue+green)/3;
            if (avg<min){
                min=avg;
            }
            if (avg>max){
                max=avg;
            }
            if (min<avg&&avg<=max/4 ){
                spot1.setColor(boldred);
            }
            else if (max/4<avg&&avg<=max/2){
                spot1.setColor(boldblue);
            }
            else if (max/2<avg&&avg<=max*.75){
                spot1.setColor(lightblue);
            }
            else if (max*.75<avg&&avg<=max){
                spot1.setColor(offwhite);
            }
        }
        me1.explore();
         /**
          * custom color palette
          */
        Color boldpurple = new Color(81,45,168);
        Color lightorange = new Color(255,140,0);
        Color yellow = new Color(255,214,0);
        Color darkpurple = new Color(54,23,94);
        Color purple = new Color(156,39,176);
            for (Pixel spot1 : Mpixels2){
                int red=spot1.getRed();
                int blue=spot1.getBlue();
                int green=spot1.getGreen();
                int avg=(red+blue+green)/3;
                if (avg <64 ){
                    spot1.setColor(darkpurple);
                }
                else if (avg < 128){
                    spot1.setColor(boldpurple);
                }
                else if (avg <164){
                    spot1.setColor(purple);
                }
                else if (avg <192){
                    spot1.setColor(lightorange);
                }
                else if (avg <=255){
                    spot1.setColor(yellow);
                }
         
            }//main
            hi.explore();
            //hi.write("images/sf1.jpeg");
            Color rose = new Color(252,145,135);
            Color darkrose = new Color(244,105,98);
            Color red = new Color(255,29,35);
            Color crimson = new Color(217,0,0);
            Color darkred = new Color(92,0,2);
            for (Pixel spot1 : Mpixels3){
                int red1=spot1.getRed();
                int blue1=spot1.getBlue();
                int green1=spot1.getGreen();
                int avg1=(red1+blue1+green1)/3;
                if (avg1 <64 ){
                    spot1.setColor(darkred);
                }
                else if (avg1 < 128){
                    spot1.setColor(crimson);
                }
                else if (avg1 <164){
                    spot1.setColor(red);
                }
                else if (avg1 <192){
                    spot1.setColor(darkrose);
                }
                else if (avg1 <=255){
                    spot1.setColor(rose);
                }
         
            }//main
            hi2.explore();
            //hi2.write("images/sf2.jpeg");
            //Color pastelblue = new Color(192,244,245);
            //Color lightpink = new Color(255,184,174);
           // Color redpink = new Color(255,147,136);
            //Color lightrose = new Color(255,127,117);
            Color black = new Color(30,30,32);
            Color darkgrey = new Color(49,53,61);
            Color darkerred = new Color(144,11,10);
            Color bloodred = new Color(217,0,0);
            Color trueyellow = new Color(255,214,0);
            for (Pixel spot1 : Mpixels4){
                int red1=spot1.getRed();
                int blue1=spot1.getBlue();
                int green1=spot1.getGreen();
                int avg1=(red1+blue1+green1)/3;
                if (avg1 <64 ){
                    spot1.setColor(black);
                }
                else if (avg1 < 128){
                    spot1.setColor(darkgrey);
                }
                else if (avg1 <164){
                    spot1.setColor(darkerred);
                }
                else if (avg1 <192){
                    spot1.setColor(bloodred);
                }
                else if (avg1 <=255){
                    spot1.setColor(trueyellow);
                }
         
            }//main
            hi3.explore();
            //hi3.write("images/sf3.jpeg");
}//class
}