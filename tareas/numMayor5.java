public class numMayor5 {
	public static void main(String[] args) throws Exception {
		int arr[] = { 2, 9, 10 };
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 5) {
				flag = true;

			}
		}
		if (flag == true) {// false==false -> true
			System.out.println("Existen numeros menores a 5 en el arreglo");

		} else {
			System.out.println("Todos son mayores a 5");
		}

	}
}
