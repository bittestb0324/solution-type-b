package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -2 };
		
		
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) 
	{
		int num1 =0;
		int num2 =0;
		int max = 0;
		int value =0;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					value = arr[i]*arr[j];
					if(value>max) {
						num1=arr[i];
						num2=arr[j];
						max=value;
					}
				}
				
			}
		}
		System.out.println(num1+" "+num2);
		
		
		//
		// 코드를 완성 하십시오.
		//
		
		
	}
}
