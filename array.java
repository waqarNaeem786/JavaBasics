class array{
	public static void main(String[] args) {

		int a[] = {1,2,3,4};

		for (int i =0; i<a.length; i++) {
			System.out.print(a[i]);
		}

// dynamic memory allocation
		int b[]= new int[5];
		for (int i = 0; i<5; i++) {
			b[i]=i;
		}

		for (int i =0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	}
}