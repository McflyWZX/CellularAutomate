package com.storm.ca.StormGraph;
import android.util.*;

public class Gconst
{
	final public static float frameT = 1 / 60f;//绘制帧数 Hz
	//public static float calcTime = 1 / 100f;//计算频率 Hz
	
	public static final int meterInWeight = 120;
	public static int meterInHeight;
	public static float scaleSceern;//以横向显示多少米为准
	
	static void setScaleFactor(int height, int weight)
	{
		scaleSceern = weight / meterInWeight;
		meterInHeight = (int)(height / scaleSceern);
		//Log.i("PSconst", "weight:" + weight);
	}
}
