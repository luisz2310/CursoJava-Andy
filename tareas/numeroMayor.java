public class numeroMayor {
	public static void main(String[] args) throws Exception {

		int arr[] = { 3, 6, 25, 8 };
		int x = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > x) {
				x = arr[i];
			}
		}
		System.out.println("El numero mayor es:" + x);

	}

}
