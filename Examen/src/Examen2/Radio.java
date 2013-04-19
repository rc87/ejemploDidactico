package Examen2;

public class Radio 
{
	public static void transmitir (String s) throws RuntimeException 
	{
		int aleatorio = (int)(Math.random() * 2);
		if (aleatorio == 0)
			throw new RuntimeException("Error de transmisión");
	}
	public static boolean reintentarTransmsion(String x)
	{
		boolean resultado = false;
		int i = 0;
		try
		{
			transmitir(x);
			resultado = true;
		}
		catch (RuntimeException e)
		{
			while ((!resultado) && (i < 2))
			{
				try
				{
					transmitir(x);
					resultado = true;
				}
				catch (RuntimeException e2) { }
				i++;
			}
		}
		return resultado;
	}
}
