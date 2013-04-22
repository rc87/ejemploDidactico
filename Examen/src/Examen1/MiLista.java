package Examen1;

import java.util.ArrayList;

public class MiLista extends ArrayList<String> 
{
	private ArrayList<Integer> posicion =   new ArrayList<Integer>();
	public MiLista()
	{
		super();
	}
	public MiLista(int[] datos)
	{
		super();
		for (int i = 0; i < datos.length; i++)
		{
			super.add(datos[i] + "");
			posicion.add(size()-1);			
		}
	}
	public MiLista(String[] datos)
	{
		super();
		for (int i = 0; i < datos.length; i++)
		{
			super.add(datos[i]);
			posicion.add(size() - 1);	
		}
	}
	public boolean add(String s)
	{
		super.add(s);
		posicion.add(size() - 1);
		return true;
	}
	public void add(int pos, String s)
	{
		super.add(pos, s);
		posicion.add(pos, size() - 1);
	}
	public String eliminarAlPrimero()
	{
		int pos = 0;
		if (size() > 0)
		{
			boolean encontrado = false;	
			while ((!encontrado) && (pos < size()))
			{
				if ((posicion.get(pos)) == 0)
					encontrado = true;
				else
					pos++;
			}
		}
		else
			throw new RuntimeException("Lista vacía");
		if (pos == size())
			throw new RuntimeException("Primer elemento no encontrado");
		posicion.remove(pos);
		return remove(pos);
	}
	public String toString()
	{
		String resul = "";
		for (int i = 0; i < size(); i++)
			resul += (get(i) + ", ");
		resul += "\n";
		for (int i = 0; i < size(); i++)
			resul += (posicion.get(i) + ", ");
		return resul;
	}
}
