package week1.day2;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,7,6,8};
		//len==7
		
//arr[0]=1
		//arr[1]=2
	MissingElements.sort(arr);
	
	//array 1234678
	//index 1234567
	for(int i=1;i<arr.length;i++) {
		if(i!=arr[i-1]) {
			System.out.println(i);
			break;
		}
	}
	
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
	}
}
