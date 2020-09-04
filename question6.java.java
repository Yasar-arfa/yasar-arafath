//question-6

import java.util.*;

public class Main {

    public static int findAngle(int hour, int min)

	{

	int h = (hour * 360) / 12 + (min * 360) / (12 * 60);

	int m = (min * 360) / (60);

	int angle = Math.abs(h - m);
	if (angle > 180)
          {

		angle = 360 - angle;

	  }

		return angle;

	}


	public static void main(String[] args)

	{

		Scanner sc=new Scanner(System.in);

		String arr[]=sc.next().split(":");

		int hour=Integer.parseInt(arr[0]);

		int min=Integer.parseInt(arr[1]);

		System.out.print(findAngle(hour, min));

	}

}