package angryBirds;

/** @author Nugraha1313 May 16, 2022 8:19:56 PM **/

public class GameObject {
	private String name, color;
	private double height, width;
	
	public GameObject(String name, String color, double width, double height) {
		this.name = name;
		this.color = color;
		this.width = width;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
}
