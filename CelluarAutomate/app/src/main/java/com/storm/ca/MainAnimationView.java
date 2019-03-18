package com.storm.ca;
import com.storm.ca.StormGraph.*;
import android.content.*;
import java.util.Random;

public class MainAnimationView extends DrawSurface
{
	Cell[][] c;
	int[][] Enviroment;
	int[][] go;
	int W, H;
	MainAnimationView(Context co)
	{
		super(co);
	}

	@Override
	public void uInit()
	{
		// TODO: Implement this method
		W = Gconst.meterInWeight;
		H = Gconst.meterInHeight;
		Enviroment = new int[W][H];
		c = new Cell[W][H];
		for(int i = 0; i < H; i++)
		{
			for(int j = 0; j < W; j++)
			{
				c[j][i] = new Cell(j, i);
				c[j][i].setIsAlive((int)(Math.random() * 1.9));
				Enviroment[j][i] = 0;
			}
		}
		
		go = new int[][]{{-1, 0, 1, 1, 1, 0, -1, -1}, {-1, -1, -1, 0, 1, 1, 1, 0}};
	}


	@Override
	public void onRun()
	{
		// TODO: Implement this method
		for(int i = 0; i < H; i++)
		{
			for(int j = 0; j < W; j++)
			{
				int s = 0;
				for(int count = 0; count < 8; count++)
				{
					if(c[(j + go[0][count] + W) % W][(i + go[1][count] + H) % H].getIsAlive() == 1)
					{
						s++;
					}
				}
				if(c[j][i].getIsAlive() == 1)
				{
					/*if(s >= 2 && s <= 3)
					{
						Enviroment[j][i] = 1;
					} else Enviroment[j][i] = 0;*/
					Enviroment[j][i] = Math.min((int)(Math.random() * Math.exp(-0.1 * s * s + 0.5 * s - 0.3)), 1);
				} else {
					/*if(s == 3)
					{
						Enviroment[j][i] = 1;
					}*/
					Enviroment[j][i] = Math.min((int)(Math.random() * Math.exp(-0.09 * s * s + 0.6 * s - 0.4)), 1);
					
				}
				
			}
		}
		for(int i = 0; i < H; i++)
		{
			for(int j = 0; j < W; j++)
			{
				c[j][i].setIsAlive(Enviroment[j][i]);
			}
			
		}
		
	}
	

}  
