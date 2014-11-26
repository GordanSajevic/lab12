package lab12;

public class MinClanNiza {

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
	
	public static int MinClan(int[] niz)
	{
		int min = niz[0];
		for (int i=0; i<niz.length; i++)
		{
			if (min>niz[i])
			{
				min = niz[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("Unesite broj članova niza: ");
		int broj = TextIO.getInt();
		int[] array = unosNiza(broj);
		System.out.println("Najmanji član niza je: " + MinClan(array));
	}

}
