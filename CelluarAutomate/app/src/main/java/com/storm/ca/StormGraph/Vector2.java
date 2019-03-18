package com.storm.ca.StormGraph;

import java.math.*;

public class Vector2
{
	private double vx, vy;
	public Vector2(double x, double y)
	{
		vx = x;
		vy = y;
	}
	
	public Vector2()
	{
		vx = 0;
		vy = 0;
	}

	public void setX(double vx)
	{
		this.vx = vx;
	}

	public double getX()
	{
		return vx;
	}

	public void setY(double vy)
	{
		this.vy = vy;
	}

	public double getY()
	{
		return vy;
	}
	
	public Vector2 getScreenVector()
	{
		return this.scale(Gconst.scaleSceern);
	}
	
	public Vector2 add(Vector2 v1)
	{
		return new Vector2(v1.vx + this.vx, v1.vy + this.vy);
	}
	
	public Vector2 scale(double scaleFactor)
	{
		return new Vector2(this.vx * scaleFactor, this.vy * scaleFactor);
	}
	
	public static double distance(Vector2 v1, Vector2 v2)
	{
		return Math.sqrt(Math.pow(v1.vx - v2.vx, 2) + Math.pow(v1.vy - v2.vy, 2));
	}
	
	public static double distance2(Vector2 v1, Vector2 v2)
	{
		return Math.pow(v1.vx - v2.vx, 2) + Math.pow(v1.vy - v2.vy, 2);
	}
	
	public static double dx(Vector2 v1, Vector2 v2)
	{
		return v1.vx - v2.vx;
	}
	
	public static double dy(Vector2 v1, Vector2 v2)
	{
		return v1.vy - v2.vy;
	}
}
