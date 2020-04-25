
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
 
public class Distance {
    @SuppressWarnings("resource")
	public static void main(String args[] ) throws Exception {
    	
       
    	  Scanner sc=new Scanner(System.in);
	        int point1=sc.nextInt();
	        int point2=sc.nextInt();
	        int point3=sc.nextInt();
	        int point4=sc.nextInt();
	        
	        Point pointx = new Point();
	        pointx.point1 = point1;  //x1
	        pointx.point2 = point3;  //x2
	        Point pointy = new Point();
	        pointy.point1 = point2;  //y1
	        pointy.point2 = point4;  //y2
	        NumberFormat formatter = new DecimalFormat("#0.000");
	        System.out.println("The Distance  is:"+formatter.format(findDistance(pointx, pointy)));
         
}
 
 
  public static  int findDistance(Point p1, Point p2)
         {
	       
	     
	          int dis;
	         
	          dis=(int) Math.sqrt((p1.point2-p1.point1)*(p1.point2-p1.point1) + (p2.point2-p2.point1)*(p2.point2-p2.point1));	 	    
             
	      
	      return dis;
     
         } 
   
 
class Point 
{
	public int  point2;
	public int point1;
 
}
}
