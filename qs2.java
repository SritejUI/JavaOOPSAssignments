// Quicksort = nlogn
import java.util.Scanner;
public class qs2 {
    static void swap(int arr[],int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void merge(int arr[],int brr[],int crr[]) {
        int i=0,j=0,k=0;
        while(i<arr.length && j<brr.length) {
            if(arr[i]<brr[j]) {
                crr[k] = arr[i];
                i++;
            }
            else {
                crr[k] = brr[j];
                j++;
            }
            k++;
        }
        while(i<arr.length) {
            crr[k++] = arr[i++];
        }
        while(j<brr.length) {
            crr[k++] = brr[j++];
        }
    }
    static void display(int arr[]) {
        for(int i:arr) {
            System.out.print(i);
        }
    }

    static int partition(int arr[],int low,int high) {
        int temp = arr[low];
        int i = high+1;
        for(int j = high;j>low;j--){
            if(arr[j]>temp) {
                i--;
                swap(arr,i,j);
            }
        }
        swap(arr,i-1,low);
        return i-1;
    }
    static void quickSort(int arr[],int low,int high) {
        if( low < high ){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,i;
        System.out.println("Enter the size of first array: ");
        n1 = sc.nextInt();
        int arr[] = new int[n1];
        for(i=0;i<n1;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of second array: ");
        n2 = sc.nextInt();
        int brr[] = new int[n2];
        for(i=0;i<n2;i++) {
            brr[i] = sc.nextInt();
        }
        quickSort(arr,0,n1-1);
        quickSort(brr,0,n2-1);

        int crr[] = new int[n1+n2];
        merge(arr,brr,crr);

        display(crr);
    }
}

