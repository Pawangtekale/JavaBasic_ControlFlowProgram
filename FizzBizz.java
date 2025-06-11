import java.util.Scanner;
class FizzBizz 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		for (int i=1;i<=num;i++)
		{
			// two way 
			// 1. using if-else lader
			/*if (i%3==0 && i%5==0)
			{
				System.out.println("FizzBizz");
			}
			else if (i%3==0)
			{
				System.out.println("Fizz");
			}
		    else if (i%5==0)
		    {
				System.out.println("Bizz");
		    }
		    else {
				System.out.println(i);
		    }*/
			// using terunary Operator
			System.out.println(i%3==0&&i%5==0?"FizzBizz":(i%3==0?"Fizz":(i%5==0?"Bizz":i)));
		}
	}
}
