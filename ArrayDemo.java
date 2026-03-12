public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        System.out.print("[");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}