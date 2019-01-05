/** This class calls the main class 2 times in it's constructor so it can generate two objects of the class each displaying one
 pie chart in one graphic window the first one will be titled Income and the other one Outlays by calling the other methods we
 will: be setting the positions where the graphic windows will appear and also giving percentages as the parameters of the setSlices
 methods  */
import javax.swing.*;
import java.awt.*;
public class InAndOutModel{

   public InAndOutModel()
   {IncomeAndOutlays object = new IncomeAndOutlays();
      object.setLocation(10,20);
      object.setTitle("Income taxes"); 
      object.setSlice1("Personal income taxes: 46 %",46,Color.red );
      object.setSlice2("Social Security and Medicare taxes: 34 %",34,Color.orange ); 
      object.setSlice3("Corporate income taxes: 11 %",11,Color.blue );
      object.setSlice4("Excise and customs taxes: 8 %",8,Color.black );
      object.setSlice5("Borrowing to cover deficit: 1%",1,Color.green );
   IncomeAndOutlays object2 = new IncomeAndOutlays();
      object2.setLocation(400,20);
      object2.setTitle("The Outlays");       
      object2.setSlice1("Social security and medicare: 38 %",38,Color.red );
      object2.setSlice2("National defense: 20 %",20,Color.orange ); 
      object2.setSlice3("Social programs: 18 %",18,Color.blue );
      object2.setSlice4("Interest on national debt: 15 %",15,Color.black );
      object2.setSlice5("Human and community development: 7 %", 7,Color.green );
      object2.setSlice6("General government: 2 %", 2,Color.yellow );

   }}