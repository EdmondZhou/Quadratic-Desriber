public class Quadratic {
	public static double square(double num) {
		double answer;
		answer = num*num;
		return answer; 
	}
	public static double discriminant(double a, double b, double c) {
		double answer;
		answer = (b*b) - 4 * a * c;
		return answer;
	}
	public static double round2(double a) {
		if (a >= 0) {
			a = a+0.005;
			a = (a * 100);
			int truncate = (int) a;
			double d = (int) truncate;
			d = d * 0.01;
			return d;
		}
		else { 	
			a = a-0.005;
			a = (a * 100);
			int b = (int) a;
			double d = (int) b;
			d = d * 0.01;
			return d;
		}
	}
	public static double max(double a, double b) {
		if (a > b) {
			return a;
		}	
		else {
			return b;
		}
	}

	public static double sqrt(double a) {
		double root = a;
		double estimate;
		if (a == 0) {
			return root = 0;
		}
		if (a < 0) {
			throw new IllegalArgumentException ("The square root of an negative number is imaginary.");
		}
		if (a > 0) {
			root = a / 2;
			do {
				estimate = root;
				root = (estimate + (a/estimate))/2;
			}
			while ((estimate - root) != 0);
		}
		else {
			root = a;
		}
		return round2(root);
	}

	public static String quadForm(double a,double b, double c) {
		String answer = "Check";
		double root1;
		double root2;
		if (discriminant(a, b, c) < 0) {
			answer = "no real roots";
		}
		if (discriminant(a, b, c) > 0) {
			root1 = round2((-b + sqrt(discriminant(a,b,c)))/(2 * a));
			root2 = round2((-b - sqrt(discriminant(a,b,c)))/(2 * a));			
			if (root1 == root2) {
				answer = root1 +"";
			}
			if (max(root1,root2) == root1) {
				answer = root2 + " and " + root1;
			}
			else {
				answer = root1 + " and " + root2;
			}
		}
		if (discriminant(a,b,c) == square(b)) {
			root1 = round2(-b / 2 * a);
			answer = root1 + "";
		}
		return answer;
	}
	public static String quadrDescriber(double a, double b, double c) {
		
	}
}