public static int[] unosNiza()
	{
		int niz []= new int[5];
		for (int i=0; i<5; i++)
		{
			System.out.println("Unesite " + (i+1) +  ". član niza: ");
			niz[i] = TextIO.getInt();
		}
		return niz;
		
	}
	
	public static void main(String[] args) 
	{
		int[] array = new int[5];
		array = unosNiza();
		for (int i=0; i<5; i++)
		{
			System.out.println((i+1) + ". član niza: " + array[i]);
		}
	}
