public class buscarNumero_copy {
    //como uso los booleanos ?
     public static void main(String[] args) throws Exception {
        int arr[]={3,5,2,4,6};
        int nu=8;
         boolean flag=false;
        for(int i=0; i<arr.length; i++){ 
            if(arr[i]==nu){
               flag=true;
                System.out.println("El numero se encuentra dentro del arreglo");
            }

        }
        
         if(flag==false){// false==false -> true

             System.out.println("No se encuentra dentro del arreglo");

        }
       
    }
}
               


