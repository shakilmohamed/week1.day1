package week1.day1;

public class Prime {

	public static void main(String[] args) {
		int n= 13;
		int counter = 0;
		for (int i=2 ; i<n-1;i++)
		{
			if(n%i == 0)
			{
				counter = 1;
			}
		}
		if(counter == 1)
		{
			System.out.println(n+"is not a prime no");
		}
		else 
		{
			System.out.println(n+"is no prime");
		}
	}

}
