package lab12;

public class SumaElemenataNiza {

	public static int[] unosNiza(int n)
	{
		int niz []= new int[n];
		for (int i=0; i<n; i++)
		{
			System.out.println("Unesite " + (i+1) +  ". član niza: ");
			niz[i] = TextIO.getInt();
		}
		return niz;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Unesite broj članova niza: ");
		int broj = TextIO.getInt();
		int[] array = unosNiza(broj);
		int suma=0;
		for (int i=0; i<broj; i++)
		{
			suma = suma + array[i];
		}
		System.out.println("Suma svih članova niza: " + suma);
	}

}
