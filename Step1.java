import java.lang.Math;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Step1
{
	public static void main (String [] args)
	{
		System.out.println("How many locations would you like me to create?");
		Scanner kb = new Scanner(System.in);
		int totalNumberOfPoints = kb.nextInt();
		double x [][] = new double [totalNumberOfPoints][2];
		Random rand = new Random(1);
		for(int ith_point = 0; ith_point < totalNumberOfPoints; ith_point++){
			x [ith_point][0] = rand.nextDouble();
			x [ith_point][1] = rand.nextDouble();
			System.out.println(x[ith_point][0]+ " " + x[ith_point][1]);
		}
		double totalDistance = distanceCalculator(x, totalNumberOfPoints);
		System.out.println("The distance between these points, after going home, is " + totalDistance);
	}
	public static double distanceCalculator(double [][] xy, int arraySize) {
		double totalDistance = 0;
		for(int ith_point = 1; ith_point < arraySize; ith_point++){
			double distance = Math.sqrt(Math.pow(xy[ith_point][0] - xy[ith_point - 1][0], 2) + Math.pow(xy[ith_point][1] - xy[ith_point - 1][1], 2));
			totalDistance += distance;
			if(ith_point + 1 == arraySize){
				distance = Math.sqrt(Math.pow(xy[ith_point][0] - xy[0][0], 2) + Math.pow(xy[ith_point][1] - xy[0][1], 2));
				totalDistance += distance;

			}
		}
		return totalDistance;
	}

}