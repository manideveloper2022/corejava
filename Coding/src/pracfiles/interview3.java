package pracfiles;

public class interview3 {
		 public static void main(String[] args) {

			 int arr[] = {2,3,4,6,3,7,6,7,8,9};
			//print the elements which are duplicate, by using stream api
			 
			 for(int i=0;i<arr.length/2;i++) {
				 
				 int temp = arr[i];
				 arr[i] = arr[arr.length-i-1];
				 arr[arr.length-i-1] = temp;
				 
			 }
			 
			 
			 for(int n: arr) {
				 System.out.println(n);
			 }
			
		 }
}
