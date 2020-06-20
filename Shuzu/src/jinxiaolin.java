
public class jinxiaolin {
	public static void main(String[]args) {
		int []arr = {12,45,98,73,60};
		int min = arr[0];
		for(int x =1;x<arr.length;x++) {
			if(arr [x]<min) {
				min = arr[x];
			}
			
		}
		System.out.print("min:" + min);
		
	}

}
