package polynomials;


public class MianPolynomials {
	
	public static void main(String[] args) {
		Polynomials zero = new Polynomials(0, 0);

        Polynomials p1   = new Polynomials(2, 4);
        Polynomials p2   = new Polynomials(3, 2);
        Polynomials p3   = new Polynomials(10, 1);
        Polynomials p4   = new Polynomials(3, 0);
        Polynomials p    = p1.plus(p2).plus(p3).plus(p4);   // 4x^3 + 3x^2 + 1 //2x^4 + 3x^2 - 10x + 3

        Polynomials q1   = new Polynomials(8, 3);
        Polynomials q2   = new Polynomials(6, 1);
        Polynomials q3   = new Polynomials(10, 0);
        Polynomials q    = q1.plus(q2).plus(q3);                     // 3x^2 + 5 //8x^3 + 6x - 10


        Polynomials r    = p.plus(q);
        Polynomials s    = p.multiply(q);
        Polynomials t    = p.compose(q);

        System.out.println("zero(x) =     " + zero);
        System.out.println("p(x) =        " + p);
        System.out.println("q(x) =        " + q);
        System.out.println("p(x) + q(x) = " + r);
        System.out.println("p(x) * q(x) = " + s);
        System.out.println("p(q(x))     = " + t);
        System.out.println("0 - p(x)    = " + zero.minus(p));
        System.out.println("p(3)        = " + p.evaluate(3));
        System.out.println("p'(x)       = " + p.differentiate());
        System.out.println("p''(x)      = " + p.differentiate().differentiate());
   }

}
