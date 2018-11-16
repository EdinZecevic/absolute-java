package fgure;
public class Circle extends Figure{
	
	private int diametar;
	private static final double pi=3.14;

	public Circle(){
		super();
		diametar=0;
	}


	public Circle(int _diametar,int _area,int _volume){
		super(_area, _volume);
		diametar=_diametar;
	}

	public Circle(Circle circle){
		super(circle);
		diametar=circle.diametar;
	}

	public void setDiametar(int _diametar){
		diametar=_diametar;
	}
	
	public double getAreaOfCircuit(){
		setArea((4/3)*pi*(diametar*diametar*diametar));
			return area;
	}

	public int getDiametar(){
	return diametar;
	}

	public String toString(){
	return(diametar+""+ super.toString());
	}
	public boolean equals(Circle circle){
	return(diametar==circle.diametar && super.equals(circle));
	}

}
