package entities;

public class Rectangle {
	
	public double width; //largura
	public double height; //altura
	
	public double area( ) {
		return width*height; //calcular area
	}
	
	public double perimeter() {
		return 2*(width+height); //calcular o perimetro
	}
	
	public double diagonal() {
		return Math.sqrt(width*width+height*height); //calcular a diagonal
	}

}