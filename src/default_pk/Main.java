package default_pk;

public class Main {
	public static void main(String[] args)
	{
		float[] a = {1, 4, 3, 5, 6, 4};
		
		float b[];
		b = new float[3];
		b[0] = 1;
		b[1] = 5;
		b[2] = 8;
		float sA = BtMang.Tong(a);
		float sB =BtMang.Tong(b);
		System.out.printf("\nSA = %f", sA);
		System.out.printf("\nSB = %f", sB);
		float[] ks = BtMang.MinMaxAve(a);
		System.out.printf("\nMin = %f, Max = %f, Avg = %f", ks[0], ks[1], ks[2]);
		
		float s = BtMang.TongPrime(a);
		System.out.printf("\nTong cac so nguyen to trong mang: %f", s);
	}
}
