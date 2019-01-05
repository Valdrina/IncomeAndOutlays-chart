/**This class is used to generate a pie chart out of 6 slices in a graphics window and consists of 10 methods totally*/
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class IncomeAndOutlays extends JPanel{
   
   private String Label1="",Label2="",Label3="",Label4="",Label5="",LABEL = "",Label6="";  // these are the variables we will use in 
   private int Amount1,Amount2,Amount3,Amount4,Amount5,left,up,lm,um,x=50,y = 90,pos = 150; //this class
   private int pos2 = 60, offset = 20, Amount6,width=400;   
   private Color color1,color2,color3,color4,color5,color6;     
    JFrame objectFrame;
   public IncomeAndOutlays(){
      objectFrame = new JFrame();             
      objectFrame.getContentPane().add(this);
      objectFrame.setTitle(LABEL);
      objectFrame.setVisible(true);
      objectFrame.setSize(width,width);
      objectFrame.setLocation(left,up);}
   public void paintComponent(Graphics g){   
      g.setColor(Color.white);
      g.fillRect(0,0,width,width);
      g.setColor(Color.black);
      g.drawOval(x,x,y,y);
      g.setColor(color1);
      g.fillArc(x,x,y,y,0, Amount1*360/100);
      g.drawString(Label1,pos,pos2);
      g.setColor(color2);
      g.fillArc(x,x,y,y,Amount1*360/100,Amount2*360/100);
      g.drawString(Label2,pos,pos2+offset);
      g.setColor(color3);
      g.fillArc(x,x,y,y,Amount1*360/100+Amount2*360/100,Amount3*360/100);
      g.drawString(Label3,pos,pos2+offset*2);
      g.setColor(color4);
      g.fillArc(x,x,y,y,Amount1*360/100+Amount2*360/100+Amount3*360/100,Amount4*360/100);
      g.drawString(Label4,pos,pos2+offset*3);
      g.setColor(color5);
      g.fillArc(x,x,y,y,Amount1*360/100+Amount2*360/100+Amount3*360/100+Amount4*360/100,Amount5*360/100);
      g.drawString(Label5,pos,pos2+offset*4);
      g.setColor(color6);
      g.fillArc(x,x,y,y,Amount1*360/100+Amount2*360/100+Amount3*360/100+Amount4*360/100+Amount5*360/100,Amount6*360/100);
      g.drawString(Label6,pos,pos2+offset*5);
   }
   public void setSlice1(String label, int amount,Color color)  //This method draws the first slice of the chart
   {
      Label1 = label; 
      Amount1 = amount;
      color1 = color;  repaint();   } 
   public void setSlice2(String label, int amount,Color color){
   
      Label2 = label; 
      Amount2 = amount; 
      color2 = color; repaint();   
   } 
   public void setSlice3(String label, int amount,Color color){
   
      Label3 = label; 
      Amount3 = amount; 
      color3 = color; repaint(); 
   }
   public void setSlice4(String label, int amount,Color color){
   
      Label4 = label; 
      Amount4 = amount; 
      color4 = color; repaint(); 
   }
   public void setSlice5(String label, int amount,Color color){
   
      Label5 = label; 
      Amount5 = amount; 
      color5 = color; repaint(); 
   }
   public void setSlice6(String label, int amount,Color color){
   
      Label6 = label; 
      Amount6 = amount; 
      color6 = color; repaint(); 
   }


   public void setTitle(String label){    //This methods is optional so you can use it it you want to name the frame on the 
      LABEL = label;                      //tester class 
      objectFrame.setTitle(label);}
   public void setLocation(int lm, int um){//by using this method you can choose the positions on which you want your graphic  
      left = lm;                          //window to appear
      up = up;
      objectFrame.setLocation(lm,um);}
}