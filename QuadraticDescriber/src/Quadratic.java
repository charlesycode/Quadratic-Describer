// 9/20/21
// does calculations
// part 5
	public class Quadratic {
		public static double square(double x) { //squares your input
			double result = 0;
			result = x * x;
			return result;
		}
		public static double discriminant(double num1, double num2, double num3) { //calculates the discriminant of three inputs
			double result = 0;
			result = (num2 * num2) - ((4 * num1) * num3);
			return result;
		}
		public static double round2(double x) { //accepts a double and rounds it to 2 decimal places
			if (x>0) {
				double result1 = (x * 100) + 0.5;
				int result2 = (int)result1;
				double result3 = (double)result2;
				double result4 = result3 / 100;
				return result4;
			}else {
				double result1 = (x * 100) - 0.5;
				int result2 = (int)result1;
				double result3 = (double)result2;
				double result4 = result3 / 100;
				return result4;
			}
		}
		public static double absValue(double x) { // accepts a double and returns the absolute value
			if (x>0) {
				return x;
			}else {
				return (x*-1);
			}
		}
		public static String quadForm(double num1, double num2, double num3) { // accepts 3 intgers in the form of num1(x^2) + num2(x) + num3 and returns the roots in a string
			String result = " ";
			double quad = 1;
			double quadMin = 1;
			double quadMax = 1;
			if (discriminant(num1,num2,num3) < 0 || num1 == 0) {
				result = ("no real roots");
			}
			if (discriminant(num1,num2,num3) == 0 && num1 != 0) {
				quad = round2(-num2 / (2 * num1));
				result = quad + " ";
			}
			if (discriminant(num1,num2,num3) > 0 && num1 != 0) {
				quadMax = round2(-num2 + sqrt(discriminant(num1,num2,num3)) / (2 * num1));
				quadMin = round2(-num2 - sqrt(discriminant(num1,num2,num3)) / (2 * num1));
				if (quadMin > quadMax) {
					result = (quadMin + " and " + quadMax);
				} else
					result = (quadMax + " and " + quadMin);
			}
			return result;
		}
		public static double sqrt(double num1) { // returns an approximation of the square root of the value, rounded to 2 decimal places ( use round 2)
			double a;
			double b = num1 / 2;
			do {
				a = b;
				b = (a + (num1 / a)) / 2;
			}
			while (absValue(a * a - num1) >= 0.005);
			return round2(a);
			}
		public static String open(double num1, double num2) {
			String result = " ";
			if (num1 > 0) {
				result = "Up";
			} else if (num1 < 0) {
				result = "Down";
			} else if (num1 == 0 && num2 > 0) {
				result = "Up";
			} else if (num1 == 0 && num2 < 0) {
				result = "Down";
			} else if (num1 == 0 && num2 == 0) {
				result = "Neither Up or Down";
			}
			return result;
		}
		//code above is from calculate library
		public static double axis(double num1, double num2, double num3) {
			double axis = -num2 / (2 * num1);
			if (axis == -0) {
				axis = 0;
			}
			return axis;
		}
		public static String vertex(double num1, double num2, double num3) {
			String result = " ";
			double yvertex = num1 * square(axis(num1,num2,num3)) + num2 * axis(num1,num2,num3) + num3;
			result = "(" + axis(num1,num2,num3) +", " + yvertex + ")";
			return result;
		}
		public static double yIntercept(double num3) {
			return num3;
		}
		public static void quadrDescriber (double a, double b, double c) {
			System.out.println("Description of the graph of:");
			System.out.println(a + " x^2" + " + " + b + " + " + c);
			System.out.println(" ");
			System.out.println("Open: " + open(a,b));
			System.out.println("Axis of Symmetry: " + axis(a,b,c));
			System.out.println("Vertex:" + vertex(a,b,c));
			System.out.println("x-intercepts(s): " + quadForm(a,b,c));
			System.out.println("y-intercept: " + yIntercept(c));
			System.out.println(" ");
		}
}
