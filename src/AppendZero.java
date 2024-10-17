public class AppendZero {
    static void appendZero(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            // 3, 0, 5, 0, 6, 3
            if(arr[i]!= 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,0,5,0,6,3};
        appendZero(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }


    }
}
