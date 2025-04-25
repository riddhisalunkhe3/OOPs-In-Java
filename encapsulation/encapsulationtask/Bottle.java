package com.encapsulationtask;

public class Bottle {
	private int height;
	private int width;
	private String shape;
	private String colour;
	public void setHeight(int height)
	{
		this.height = height;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	public void setShape(String shape)
	{
		this.shape = shape;
	}
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	public int getHeight()
	{
		return height;
	}
	public int getWidth()
	{
		return width;
	}
	public String getShape()
	{
		return shape;
	}
	public String getColour()
	{
		return colour;
	}
	public String toString() {
		return "Bottle [height=" + height + ", width=" + width + ", shape=" + shape + ", colour=" + colour + "]";
	}
	public void view()
	{
		System.out.println(height);
		System.out.println(width);
		System.out.println(shape);
		System.out.println(colour);
	}
}
