public class promedio {
	public static void main(String[] args) throws Exception {
		int n = 3;// no se necesita
		int arr[] = { 5, 5, 5, 5, 5 };
		int sum = 0;
		int pr = 0;
		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
			pr = sum / n;
		}
		pr = sum / arr.length;
		System.out.println("El promedio del arreglo es:" + pr);
	}
}
