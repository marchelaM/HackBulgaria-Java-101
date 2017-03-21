package polynomials;


public class Polynomials {

	private int[] coef = new int[3];
	int deg; // degree of polynomial

	// a*x^b
	public Polynomials(int a, int b) {
		coef = new int[b + 1];
		coef[b] = a;
		deg = degree();

	}

	// return the degree of this polynomial (0 for the zero polynomial)
	private int degree() {
		int d = 0;
		for (int i = 0; i < coef.length; i++) {
			if (coef[i] != 0) {
				d = i;
			}
		}
		return d;
	}

	// c = a+b
	public Polynomials plus(Polynomials b) {
		Polynomials a = this;
		Polynomials c = new Polynomials(0, Math.max(a.deg, b.deg));
		for (int i = 0; i <= a.deg; i++) {
			c.coef[i] += a.coef[i];
		}
		for (int i = 0; i <= b.deg; i++) {
			c.coef[i] += b.coef[i];
		}
		c.deg = c.degree();
		return c;
	}
	// return (a -b)

	public Polynomials minus(Polynomials b) {
		Polynomials a = this;
		Polynomials c = new Polynomials(0, Math.max(a.deg, b.deg));
		for (int i = 0; i < a.deg; i++) {
			c.coef[i] += a.coef[i];
		}
		for (int i = 0; i < b.deg; i++) {
			c.coef[i] -= b.coef[i];
		}
		c.deg = c.degree();
		return c;
	}

	public Polynomials multiply(Polynomials b) {

		Polynomials a = this;
		Polynomials c = new Polynomials(0, a.deg + b.deg);
		for (int i = 0; i <= a.deg; i++)
			for (int j = 0; j <= b.deg; j++)
				c.coef[i + j] += (a.coef[i] * b.coef[j]);
		c.deg = c.degree();

		return c;
	}

	// return a(b(x)) - compute using Horner's method
	public Polynomials compose(Polynomials b) {
		Polynomials a = this;
		Polynomials c = new Polynomials(0, 0);
		for (int i = a.deg; i >= 0; i--) {
			Polynomials term = new Polynomials(a.coef[i], 0);
			c = term.plus(b.multiply(c));
		}
		return c;
	}

	// do a and b represent the same polynomial?
	public boolean eq(Polynomials b) {
		Polynomials a = this;
		if (a.deg != b.deg)
			return false;
		for (int i = a.deg; i >= 0; i--)
			if (a.coef[i] != b.coef[i])
				return false;
		return true;
	}

	// use Horner's method to compute and return the polynomial evaluated at x
	public int evaluate(int x) {
		int p = 0;
		for (int i = deg; i >= 0; i--)
			p = coef[i] + (x * p);
		return p;
	}

	// differentiate this polynomial and return it
	public Polynomials differentiate() {
		if (deg == 0)
			return new Polynomials(0, 0);
		Polynomials deriv = new Polynomials(0, deg - 1);
		deriv.deg = deg - 1;
		for (int i = 0; i < deg; i++)
			deriv.coef[i] = (i + 1) * coef[i + 1];
		return deriv;
	}

	public String toString() {
		if (deg == 0)
			return "" + coef[0];
		if (deg == 1)
			return coef[1] + "x + " + coef[0];
		String s = coef[deg] + "x^" + deg;
		for (int i = deg - 1; i >= 0; i--) {
			if (coef[i] == 0)
				continue;
			else if (coef[i] > 0)
				s = s + " + " + (coef[i]);
			else if (coef[i] < 0)
				s = s + " - " + (-coef[i]);
			if (i == 1)
				s = s + "x";
			else if (i > 1)
				s = s + "x^" + i;
		}
		return s;
	}

	
}
