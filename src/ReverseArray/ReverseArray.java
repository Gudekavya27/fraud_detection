package ReverseArray;

public class ReverseArray {

	static void reverseArray(int arr[],int N) {
		int low=0,high=N-1;
		while(low<high) {
		int temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		low++;
		high--;
		}
	
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,20,30,40,50},N=5;

System.out.println("before reverse");
for(int i=0;i<N;i++) {
System.out.println(arr[i]);
}
System.out.println("after reverse");
	reverseArray(arr, N);
	System.out.println();
	for(int i=0;i<N-3;i++) {
		System.out.println(arr[i]);
	}
//for(int i=N-1;i<N-3;i++) {
//	System.out.println(arr[i]);
//}
//


	}}
