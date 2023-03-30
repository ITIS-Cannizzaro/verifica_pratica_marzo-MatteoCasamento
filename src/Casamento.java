import java.util.Scanner;
public class Casamento
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				
				case 1:
					MinimoDiArray();
				break;
				case 2:
					ParoleMisteriose();
				break;
				case 3:
					StampaPari();
				break;
				default:
					System.out.println("Scelta errata, riprova!");
			}
		}
	}
	static void MinimoDiArray() 
	{
		int [] array = new int [10];
		for(int i = 0; i < array.length; i++)
		{
			array [i] = (int) ((Math.random()*11)-6);
		}
		int min = array[0];
		for(int i = 0; i<array.length; i++)
		{
			
		}

	}
	static void stampaMenu()
	{
		System.out.println("1 - Minimo di Array");
		System.out.println("2 - Parole Misteriose");
		System.out.println("3 - Stampa Pari");
		
	}
	

}
