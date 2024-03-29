package review_sessions.week9;

public class Rainfall {
	
	public double getSum(double[] rain) {
		
		double sum = 0;
		for(double temp : rain) {
			sum+=temp;
		}
		return sum;
	}
	
	
	public double getAverage(double[] rain) {
		
		return getSum(rain)/rain.length;
		
	}
	
	public double getMaxValue(double[] rain) {
		double max=0;
		for(double i : rain) {
			if(i>max) {
				max = i;
			}
		}
		return max;
		
	}
	
	public double getMinValue(double[] rain) {
		
		double min = Double.MAX_VALUE;
		for(double i : rain) {
			if(i<min) {
				min=i;
			}
		}
		return min;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
