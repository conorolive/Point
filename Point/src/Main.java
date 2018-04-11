public class Main {
	public static void main(String args[])
	{

		Point pArr[] = new Point[1000];
		Point p = new Point();
		
		for (int i = 0; i < 1000; i++)
		{
			pArr[i] = new Point(i, i, i);
		}
		
		p.add(pArr);
		
		System.out.println(p);
	}
}
