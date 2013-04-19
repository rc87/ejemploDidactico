package Examen3;

public class Imprimir 
{
	private static final int MAX = 7;
	public static void main(String[] args) 
	{
		for (int i = 0; i < MAX; i++)
		{
			for (int j = 0; j < MAX - (i + 1); j++)
			{
				System.out.print("Y");
			}
			for (int j = MAX - (i + 1); j < MAX; j++)
			{
				System.out.print("O");
			}
			System.out.println();
		}
	}
}
