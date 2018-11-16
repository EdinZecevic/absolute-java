package sale;

public class Sale {
	

private String name;
private double price;

public Sale(){
name="";
price=0;
}

public Sale(String _name,double _price){
name=_name;
price=_price;
}

public Sale(Sale sale){
name=sale.name;
price=sale.price;
}

public void setName(String _name){
	name=_name;
}
public void setPrice(double _price){
	price=_price;
}
public String getName(){
return name;
}
public double getBill(){
return price;
}

public void announcement (){
	getClass();
}
public String toString(){
return(name+""+price);
}
public boolean equals(Sale sale){
	return(name.equals(sale.name) && price==sale.price);
} 


}