package lv.kristina.geometricfigures;

public class Circle {
	
	
	public static final double DEFAULT_RADIUS = 8.8;
	public static final String DEFAULT_COLOR = "red";
	
	private double radius;
	private String color;
	private double area;
	
	
	public void setArea(double area) {
		this.area = area;
	}


	public Circle(){
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	
	
	public Circle(double r){
		this.radius = r;
		this.color = DEFAULT_COLOR;
	}
	
	public Circle(double r, String c){
		this.radius = r;
		this.color = c;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea(){
		return Math.PI * radius * radius;
	
		
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color +  "]";
	}
	

}
