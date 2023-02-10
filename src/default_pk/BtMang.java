package default_pk;

public class BtMang {
	public static float Tong(float[] mang)
	{
		int n = mang.length;
		float s = 0;
		for (int i = 0; i < n; i++)
		{
			s = s + mang[i];
		}
		return s;
	}
	/**
	 * Tìm Min Max, Average của mảng
	 * @param mang Mảng đầu vào
	 * @return Mảng lưu 3 giá trị: Min, Max, Average
	 */
	public static float[] MinMaxAve(float[] mang)
	{
		float min_max_avg[];
		min_max_avg = new float[3];
		min_max_avg[0] = MinAgrs(mang);
		min_max_avg[1] = MaxAgrs(mang);
		min_max_avg[2] = Avg(mang);
		return min_max_avg;
	}
	public static float MinAgrs(float[] mang)
	{
		float min = mang[0];
		for (int i = 1; i < mang.length; i++)
		{
			if (mang[i] < min) 
			{	
				min = mang[i];
			}
		}
		return min;
	}
	public static float MaxAgrs(float[] mang)
	{
		float max = mang[0];
		for (int i = 1; i < mang.length; i++)
		{
			if (mang[i] > max)
				max = mang[i];
		}
		return max;
	}
	public static float Avg(float[] mang)
	{
		float avg = 0;
		for (int i = 0; i < mang.length; i++)
		{
			avg += mang[i];
		}
		return avg / mang.length;
	}
	public static boolean isPrimeNumber(float a) {
		int n = (int)a;
		if (n == a)
		{
			if (n < 2)
				return false;
			int d = (int) Math.sqrt(n);
			for (int i = 2; i <= d; i++)
			{
				if (n % i == 0)
					return false;
			}
		}
		return false;
    }
	public static float TongPrime(float[] mang)
	{
		float s = 0;
		for (int i = 0; i < mang.length; i++)
			if (isPrimeNumber(mang[i]))
				s += mang[i];
		
		return s;
	}
	/**
	 * Mang nhieu chieu
	 */
}
