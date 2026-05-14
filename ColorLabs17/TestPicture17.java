
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
import java.awt.Color;

public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /**/
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
     Picture reference = new Picture("images/disgust.jpg");
     int W= reference.getWidth();
     int H= reference.getHeight();
     Picture canvas = new Picture(W*3,H*2);
     
     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     //Know it, Love it, Live it!!!
     //relative path                    dir/folder/file
     Picture apic = new Picture("images\\beach.jpg");
     Picture temple = new Picture("images/temple.jpg");
     Picture laser = new Picture("images/laser.jpg");
     Picture disgust = new Picture("images/disgust.jpg");
     Picture disgust1 = new Picture("images/disgust.jpg");
     Picture disgust2 = new Picture("images/disgust.jpg");
     Picture disgust3 = new Picture("images/disgust.jpg");
     Picture disgust4 = new Picture("images/disgust.jpg");
     Picture disgust5 = new Picture("images/disgust.jpg");
     Picture disgust6 = new Picture("images/disgust.jpg");
    // Picture canvas = new Picture("images/640x480.jpg");
     //apic.explore();
     //ferris1.explore();
     //moto.explore();
     //makes an array of pixels
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     //pixels = ferris1.getPixels();
    
     //how many pixels or how large array
    //System.out.println("This is a large array"+pixels.length  );

/*
    /**/
        //access each index

      //  System.out.println(pixels[17]);
    //access each pixel
    //Pixel spot = ferris1.getPixel(100,100);
    //Pixel spot2 = ferris1.getPixel(433,283);
    /*Pixel ferr17 = pixels[17];
    
    
    ferr17.setRed(240);
    ferr17.setGreen(160);
    ferr17.setBlue(200);   
    Color newColor = new Color(255,99,71);
    spot.setColor(newColor);
    
    
    //ferris1.explore();
    
    
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
    for (int i = 0; i<10000; i++){
        Pixel yuck = ferris1.getPixel((int)Math.random()*1000, (int)Math.random()*1000);
        yuck.setColor(Color.green);
    }
    //ferris1.explore();
 */   
    
    
    Pixel[] Mpixels;
    Mpixels = disgust2.getPixels();
    Pixel[] Mpixels2;
   // Mpixels2 = ferris2.getPixels();
    Pixel[] Mpixels3;
   // Mpixels3 = ferris3.getPixels();
    Pixel[] Mpixels4;
    //Mpixels4 = ferris4.getPixels();
    Pixel[] Mpixels5;
    Mpixels5 = disgust5.getPixels();
    Pixel[] Mpixels6;
    Mpixels6 = disgust6.getPixels();
   // pixels[17].setColor(Color.blue);
   // spot.setColor(new Color(252,252,252));
    //pixels[500034].setColor(Color.blue);

    //ferris1.explore();

   // loop to access indexes of array or collection
//red
   //for each loop spot  is a ?
   /**
    for (Pixel spot1 : Mpixels){
    //System.out.println( spot );
    int red=spot1.getRed();
    red=(int)(red*2);
    spot1.setRed(red);
    
}
//ferris1.explore();

//blue 
 
for (Pixel spot1 : Mpixels2){
    //System.out.println( spot );
    int blue=spot1.getBlue();
    blue=(int)(blue*2);
    spot1.setBlue(blue);
    
}
//ferris2.explore();  

//green

for (Pixel spot1 : Mpixels3){
    //System.out.println( spot );
    int green=spot1.getGreen();
    green=(int)(green*2);
    spot1.setGreen(green);
    
}
//ferris3.explore();  



for (Pixel spot1 : Mpixels4){
    int red=spot1.getRed();
    int blue=spot1.getBlue();
    int green=spot1.getGreen();
    int avg=(red+blue+green)/3;
    spot1.setGreen(avg);
    spot1.setBlue(avg);
    spot1.setRed(avg);
}
//ferris4.explore(); 
for (Pixel spot1 : Mpixels5){
    int red=spot1.getRed();
    int blue=spot1.getBlue();
    int green=spot1.getGreen();
    int avg=(red+blue+green)/3;
    spot1.setGreen(255-green);
    spot1.setBlue(255-blue);
    spot1.setRed(255-red);
}
//ferris5.explore(); 


for (Pixel spot1 : Mpixels6){
    int red=spot1.getRed();
    int blue=spot1.getBlue();
    int green=spot1.getGreen();
    spot1.setGreen(green+50);
    spot1.setBlue(blue-50);
    spot1.setRed(green+50);
}
//ferris6.explore(); 
**/ 
/*
  * 
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
    ferris1.explore();
    
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
    //write/save a picture as a file
    //ferris1.write("images/ferris11.jpg");
  //  makeSmall(temple,640x480);
    //temple.explore();
    //copytoCanvas(ferris1,640x480);
    merge(disgust,laser);
    
     Color whiteish = new Color(240,240,240);
     Color midwhite = new Color (180,180,180);
     Color grey = new Color(120,120,120);
     Color black = new Color(0,0,0);
     Color medblack = new Color(30,30,30);
     Color darkgrey = new Color(60,60,60);
     for (Pixel spot1 : Mpixels){
            int red1=spot1.getRed();
            int blue1=spot1.getBlue();
            int green1=spot1.getGreen();
            int avg1=(red1+blue1+green1)/3;
            if (avg1 <32 ){
                spot1.setColor(black);
            }
            else if (avg1 < 64){
                spot1.setColor(medblack);
            }
            else if (avg1 < 128){
                spot1.setColor(darkgrey);
            }
            else if (avg1 <164){
                spot1.setColor(grey);
            }
            else if (avg1 <192){
                spot1.setColor(midwhite);
            }
            else if (avg1 <=255){
                spot1.setColor(whiteish);
            }
         
            }//main
           Color boldpurple = new Color(81,45,168);
        Color lightorange = new Color(255,140,0);
        Color medium = new Color(255,177,0);
        Color yellow = new Color(255,214,0);
        Color darkpurple = new Color(54,23,94);
        Color purple = new Color(156,39,176);
            for (Pixel spot1 : Mpixels5){
                int red=spot1.getRed();
                int blue=spot1.getBlue();
                int green=spot1.getGreen();
                int avg=(red+blue+green)/3;
                if (avg <32 ){
                    spot1.setColor(darkpurple);
                }
                else if (avg < 64){
                    spot1.setColor(boldpurple);
                }
                else if (avg <128){
                    spot1.setColor(purple);
                }
                else if (avg <160){
                    spot1.setColor(lightorange);
                }
                else if (avg <=192){
                    spot1.setColor(medium);
                }
                else if (avg <=256){
                    spot1.setColor(yellow);
                }
         
            }//main
            Color Darkwalnut = new Color(88, 39, 7);
            Color Rustbrown = new Color(151, 45, 7);
            Color Tomato = new Color(255, 78, 62);
            Color Amberflame = new Color(250, 178, 15);
            Color Bananacream = new Color(255, 200, 72);
          /**  
            for (Pixel spot1 : Mpixels6){
                int red=spot1.getRed();
                int blue=spot1.getBlue();
                int green=spot1.getGreen();
                int avg=(red+blue+green)/3;
                if (avg <51 ){
                    spot1.setColor(Darkwalnut);
                }
                else if (avg < 102){
                    spot1.setColor(Rustbrown);
                }
                else if (avg <153){
                    spot1.setColor(Tomato);
                }
                else if (avg <=201){
                    spot1.setColor(Amberflame);
                }
                else if (avg <=256){
                    spot1.setColor(Bananacream);
                }
         
            }//main
            **/
     disgust.explore();
     disgust1.explore();
     disgust2.explore();
     mirrorVertical(disgust3);
     disgust3.explore();
     Recurse(disgust4,10);
     disgust5.explore();
    copyToCanvas(disgust, canvas, 0, 0);           
    copyToCanvas(disgust1, canvas, W, 0);           
    copyToCanvas(disgust2, canvas, W * 2, 0);       
    copyToCanvas(disgust3, canvas, 0, H);           
    copyToCanvas(disgust4, canvas, W, H);           
    copyToCanvas(disgust5, canvas, W * 2, H);
     //disgust6.explore();
    //laser.explore();
    //copytoCanvas(disgust,canvas);
    //copytoCanvas(disgust2,canvas);
    //copytoCanvas(disgust3,canvas);
    
    canvas.explore();
    //canvas.write("images/collage.jpeg");
    /**/
  }//main
  public static void merge(Picture source, Picture merge){
      for(int y=0; y<source.getHeight(); y++){//source.getHeight
          //loop from 0 to the middle (mirror point)
          for(int x = 0; x<source.getWidth(); x++){
              Pixel sourcePix = source.getPixel(x,y);
              Pixel mergePix = merge.getPixel(x,y);
              Color avg = new Color((sourcePix.getRed()+mergePix.getRed())/2,(sourcePix.getBlue()+mergePix.getBlue())/2,(sourcePix.getGreen()+mergePix.getGreen())/2);
              sourcePix.setColor(avg);
          }
      }
  }
  public static void mirrorVertical(Picture source){
      int width = source.getWidth();
      int mirrorPoint = source.getWidth()/2;//source.getWidth/2
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      //loop through all the rows
      for(int y=0; y<156; y++){//source.getHeight
          //loop from 0 to the middle (mirror point)
          for(int x = 0; x<mirrorPoint; x++){
              leftPixel = source.getPixel(x,y);
              rightPixel = source.getPixel(width-1-x,y);
              rightPixel.setColor(leftPixel.getColor());
          }
      }
  }//mirrorVertical
  //add two ints to params to place the picture you want on the target
  //to make it smaller, do sourceX+=2
  //to make it bigger sourceX+=.5  larger, copies every pixel twice but you have to cast as int in the getPix and setColor
  public static void copyToCanvas(Picture source, Picture target, int startX, int startY){
    Pixel sourcePix = null;
    Pixel targetPix = null;
    
    //loop thru jcolumns(targetX is starting point on canvas)
    
    for (int sourceX = 0; sourceX < source.getWidth(); sourceX++) 
    {
        //loops thru rows, also needs to be sourceY+=2 to make it smaller, skips every other pixel
          //sourceY+=0.5 to make it copy every pixel twice, bigger
        for (int sourceY = 0; sourceY < source.getHeight(); sourceY++) {
            sourcePix = source.getPixel(sourceX, sourceY);
            targetPix = target.getPixel(startX + sourceX, startY + sourceY);
            targetPix.setColor(sourcePix.getColor());
        }
    }
  }
    public static void makeSmall(Picture source, Picture target){
      Pixel sourcePix = null;
      Pixel targetPix = null;
      
      //loop thru jcolumns(targetX is starting point on canvas)
      
      for (int sourceX=0,targetX=0; sourceX<source.getWidth();sourceX+=2,targetX++)
      {
          //loops thru rows, also needs to be sourceY+=2 to make it smaller, skips every other pixel
          //sourceY+=0.5 to make it copy every pixel twice, bigger
          for (int sourceY=0,targetY=0; sourceY<source.getHeight();sourceY+=2,targetY++){
              sourcePix = source.getPixel(sourceX,sourceY);
              targetPix = target.getPixel(targetX,targetY);
              targetPix.setColor(sourcePix.getColor());
          }
      }
  }
    public static void makeBig(Picture source, Picture target){
      Pixel sourcePix = null;
      Pixel targetPix = null;
      
      //loop thru jcolumns(targetX is starting point on canvas)
      
      for (int sourceX=0,targetX=0; sourceX<source.getWidth();sourceX+=0.5,targetX++)
      {
          //loops thru rows, also needs to be sourceY+=2 to make it smaller, skips every other pixel
          //sourceY+=0.5 to make it copy every pixel twice, bigger
          for (int sourceY=0,targetY=0; sourceY<source.getHeight();sourceY+=0.5,targetY++){
              sourcePix = source.getPixel(sourceX,sourceY);
              targetPix = target.getPixel(targetX,targetY);
              targetPix.setColor(sourcePix.getColor());
          }
      }
  }
    public static void Recurse(Picture Source, int TimesRecursed){
        if (TimesRecursed <=1){
            Source.explore();
        }
        else{
            makeSmall(Source,Source);
            Recurse(Source,TimesRecursed-1);
        }
    }
    
}//class

