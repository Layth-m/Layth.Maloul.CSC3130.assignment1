

//5. (code) Remove element

public class Main {
    public static void Remove_element (int[] arr, int val){
        int track = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]!=val){
                arr[track] = arr[i];
                track++;
            }
        }
        System.out.println(track+" elements are not equal to the val");
        for(int i =0; i<track;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args) {
int[] arr = {1,2,3,3,5};
int val =3;
Remove_element(arr,val);
    }
}