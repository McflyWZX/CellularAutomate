package com.storm.ca.StormGraph;
import android.graphics.*;

public class Cell implements Graphic
{
	int isAlive;
	int state[] = new int[]{Color.BLACK, 0xff3399CC};
	float L = Gconst.scaleSceern;
	int x, y;
	public Cell(int x, int y)
	{
		this.x = x;
		this.y = y;
		DrawSurface.addObj(this);
	}

	@Override
	protected void finalize() throws Throwable
	{
		// TODO: Implement this method
		DrawSurface.delObj(this);
		super.finalize();
	}



	public Cell()
	{

	}

	public void position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public void setIsAlive(int isAlive)
	{
		this.isAlive = isAlive;
	}

	public int getIsAlive()
	{
		return isAlive;
	}
	@Override
	public void draw(Canvas ca, Paint pa)
	{
		// TODO: Implement this method
		if (isAlive == 1)
		{
			int startColor = pa.getColor();
			pa.setColor(state[isAlive]);
			ca.drawRect(x * (1 + L) - L, y * (1 + L) - L, 
						x * (1 + L), y * (1 + L), pa);
			pa.setColor(startColor);
		}
	}

}
