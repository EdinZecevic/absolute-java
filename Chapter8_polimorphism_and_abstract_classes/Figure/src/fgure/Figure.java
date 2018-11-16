package fgure;

public class Figure {
	
	 double area;
	 int volume;

	public Figure(){

	area=0;
	volume=0;
	}


	public Figure(int _area,int _volume){
	area=_area;
	volume=_volume;
	}

	public Figure(Figure figure){
	area=figure.area;
	volume=figure.volume;
	}
	public void setArea(double _area){
		area=_area;
	}
	public void setVolume(int _volume){
		volume=_volume;
	}
	public double getArea(){
	return area;
	}
	public int getVolume(){
	return volume;
	}
	public String toString(){
	return(area+""+volume);
	}
	public boolean equals(Figure figure){
	return(area==figure.area && volume==figure.volume);
	}

}