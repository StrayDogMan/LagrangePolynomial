package lagrangePolynomial;

public class LagrangePolynomial {
	private float points[][];

	public LagrangePolynomial(float Points[][]) {
		points = Points;
	}


	public static void main(String[] args) {

	}

	public float culcY(float X) {
		//return data
		float y = 0.0f;

		//culc y
		int length = points.length;
		for(int i = 0;i < length;i++) {
			//function define
			float a = 1.0f;
			float b = 1.0f;

			//culc define
			for(int j = 0;j < length;j++) {
				if(i != j) {
					a *= X - points[j][0];
					b *= (points[i][0] - points[j][0]);
				}
			}
			y += (a/b) * points[i][1];
		}

		return y;
	}
}
