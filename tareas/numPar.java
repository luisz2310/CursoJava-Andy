public class numPar {
	public static void main(String[] args) throws Exception {
		int arr[] = { 3, 5, 7, 6, 3, 2 };
		int div = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			div = arr[i] % 2;
			if (div == 0) {
				flag = true;
			}

		}
		if (flag == true) {// false==false -> true
			System.out.println("SI hay numeros pares dentro del arreglo");
		} else {
			System.out.println("No hay numeros pares dentro del arreglo");
		}
	}
}
