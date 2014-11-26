package lab12;

public class SumaElemenataNiza2 {

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
	
	public static int SumaNiza(int[] niz)
	{
		int suma = 0;
		for (int i=0; i<niz.length; i++)
		{
			suma = suma + niz[i];
		}
		return suma;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Unesite broj članova niza: ");
		int broj = TextIO.getInt();
		int[] array = unosNiza(broj);
		
		System.out.println("Suma članova niza: " + SumaNiza(array));
	}

}
