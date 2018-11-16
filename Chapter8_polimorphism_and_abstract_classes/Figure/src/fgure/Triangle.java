package fgure;

public class Triangle extends Figure{
	

private int side;
private int side2;
private int side3;


public Triangle(){
	super();
	side=0;
	side2=0;
	side3=0;
}


public Triangle(int _side,int _side2,int _side3,int _area,int _volume){
	super(_area,_volume);
	side=_side;
	side2=_side2;
	side3=_side3;
}

public Triangle(Triangle triangle){
	super(triangle);
	side=triangle.side;
}

public double getArea(){ 
  setArea(side*side2*side3);
 return area;
}

public void setSide(int _side){
	side=_side;
	
}

public int getSide(){
return side;
}

public String toString(){
return(side+""+super.toString());
}
public boolean equals(Triangle triangle){
return(side==triangle.side && super.equals(triangle));
}

}