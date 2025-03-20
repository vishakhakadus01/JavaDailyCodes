import java.util.Scanner;
class ArryaDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Num of rows in array : ");
		int row = sc.nextInt();

		System.out.println("Enter Num of Col in arrya : ");
		int col =  sc.nextInt();

		int arr[][]=new int[row][col];
		System.out.println("Enter Elements of array : ");

		for(int i=0; i<row ;i++) {
			
			for(int j=0; j<col ; j++) {
				System.out.println("Enter element at index " + i + " " +j );
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("Array : ");
		for(int i=0; i<row ; i++) {
			for(int j=0; j<col ;j++ ){
				System.out.print(arr[i][j] + " " );
			}
			System.out.println();
		}
		System.out.println("Addition of Left Diagonal Elements is : ");
		int sum=0;
		for(int i=0; i<row ; i++) {
		
                        for(int j=0; j<col ;j++ ){
                                if(i==j){
					sum=sum+arr[i][j];
				}
                        }
                        
                }
		System.out.println(sum);
		System.out.println("Addition of right Diagonal Elements is : ");
                int sum1=0;
                for(int i=0; i<row ; i++) {

                        for(int j=0; j<row ;j++ ){
                                if(i+j==2 && i!=j){
                                        sum1=sum1+arr[i][j];
                                }
                        }

                }
                System.out.println(sum1);
		int result=sum+sum1;
		System.out.println("Sum of Left + Right Diagonal is : "+ result);


	}
}
