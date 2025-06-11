import java.util.Scanner;
class CurrancyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("  Welcome   ");
		System.out.println();
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.JPYEN");
		System.out.println("4.CAD");
		System.out.println("5.GBP");
		
		System.out.println();
		System.out.println("Enter your Response: ");
		String str=sc.next().toUpperCase();
		System.out.println("Enter the  Amountin INR : ");
		float inr =sc.nextFloat();
		float converted=0;
		
		String curr="VALID";
		switch(str)
		{
			case "USD":{
				converted=inr/85.5165f;
					break;
			}
			case "EUR":{
				converted=inr/97.333f;
				break;
			}
			case "JPYEN":{
				converted=inr/1.65634f;
				break;
			}
			case "CAD":{
				converted=inr/61.9338f;
				break;
			}
			case "GBP":{
				converted=inr/113.938f;
				break;
			}
			
			default :{
				System.out.println("INVALID INPUT...");
				curr="NOTVALID";
				break;
			}
			
		}
		if(curr.equals("VALID")){
			System.out.println("Converte amount is: "+converted+""+str);
		}
		
	}
}
