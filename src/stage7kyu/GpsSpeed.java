package stage7kyu;

public class GpsSpeed {
	
	public static int gps(int s, double[] x) {
        
		if (x.length < 2)
			return 0;
		
		double longest = x[1] - x[0];
		for (int i = 2; i < x.length; i++) {
			if((x[i] - x[i-1]) > longest)
				longest = x[i] - x[i-1];
		}
		return (int) Math.floor((3600 * longest) / s);
    }

	public static void main(String[] args) {

        double[] x = new double[] {0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61};
        System.out.println(gps(20, x));

	}
	
	
}
