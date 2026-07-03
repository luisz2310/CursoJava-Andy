public class invertirArreglo {
    public static void main(String[] args) throws Exception {
        int[] arr={8,4,9,5,7};
        int cont=0;
        int[] arr2 = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            
            arr2[cont]=arr[i];
            cont=cont+1;

        }
        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }

        System.out.println("*****************************");
        cont=4;
        arr2=new int[arr.length];
        for(int i=0; i<arr2.length; i++ ){
            arr2[i]=arr[cont];
            cont--;
        }
        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
        
}
}
