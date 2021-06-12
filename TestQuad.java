/*  Calculate Quadrilateral*/
import java.util.Scanner;

class Quad{

final byte HALF= 2;
 	  float a, b, h, w;
 	  float area, peri;


//   method for calculating area of trapezium
 protected float areaTrapezium(float  H, float  A, float  B){
	  h = H;
	  a = A;
	  b = B;
	  area =  ((a + b)/HALF) * h;

     return area;
}
//   method for calculating area of rectangle
protected float areaRectangle(float W, float H){
	w = W;
	h = H;
	area = w * h;
	return area;
}

//   method for calculating perimater of rectangle
protected float periRectangle(float W, float H){
	w = W;
	h = H;
	peri = HALF * (w + h);
	return peri;
}
//   method for calculating area of Square
 protected float areaSquare(float A){
		a = A;
	    area = a * a;
	    return area;
}
}


public class TestQuad{

public static void main(String args []){

   	Scanner input = new Scanner(System.in);

	// create objects of quadrilateral class
	 Quad  trapezium = new Quad();
	 Quad  rectangle = new Quad();
	 Quad  square =    new Quad();



 while(true){

 System.out.println("Which Quadrilateral problem do you want solve? \n \n "
 + "\t Enter R for area of Rectangle\n"
 + "\t Enter PR for perimeter of a rectangle\n "
 + "\t Enter T for area of Trapezium\n"
 + "\t Enter S for area of a Square");

 String resp= input.next();
// Area of trapezium
	if (resp.equals("T") || resp.equals("t") ){


	System.out.print("Enter value of h > 0: ");
       float  h = input.nextFloat();
	System.out.print("Enter value of a > 0: ");
       float  a = input.nextFloat();
    System.out.print("Enter value of b > 0: ");
       float   b = input.nextFloat();

  if (h > 0 && a > 0 && b > 0){
	 System.out.println("Area of the trapezium is = " + trapezium.areaTrapezium(h, a, b) + "cm\n" );
	}

	}


// Area of Rectangle
	else if (resp.equals("R") || resp.equals("r"))
{
	System.out.println("Enter value of w > 0:");
	       float  w = input.nextFloat();
	System.out.println("Enter value of h > 0:");
          float  h = input.nextFloat();

     if (w > 0 && h > 0){

	 System.out.println("Area of the rectangle is = " + rectangle.areaRectangle(w, h) + "cm" );
}
}
// Perimeter of Rectangle
else if (resp.equals("PR") || resp.equals("pr")){

	System.out.println("Enter value of w > 0:");
	       float  w = input.nextFloat();
	System.out.println("Enter value of h > 0:");
          float  h = input.nextFloat();

     if (w > 0 && h > 0){
	 System.out.println("Perimeter of the rectangle is = " + rectangle.periRectangle(w, h) + "cm" );
	}
}


// Area of Square
else if (resp.equals("S") || resp.equals("s") ){
	   System.out.println("Enter value of one side > 0:");
	       float  a = input.nextFloat();

     if (a > 0){
	 System.out.println("Perimeter of the rectangle is = " + square.areaSquare(a) + "cm" );
}
}

	  System.out.println("Do You Want to Stop Press N or Y to Continue:" );
      String response = input.next();

	 if( response.equals("N") || response.equals("n")){
	  System.exit(0);
      }
	 else if (response.equals("Y") || response.equals("y") ){

	        // continue
	 }

}
}
}