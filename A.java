/*A = SUPERCLASE*/
class A{
	int i,j;
	void showij() {
		System.out.println("i y j: "+ i + " " + j );
	}
}
class B extends A{
	int k;
	void showk() {
		System.out.println("k: "+ k);
	}
	void suma() {
		System.out.println("i+j+k: "+ (i+j+k));
	}
}
