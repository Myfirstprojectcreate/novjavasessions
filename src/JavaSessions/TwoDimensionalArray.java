package JavaSessions;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int studentData[][]= new int[100][50] ;
		
		for (int row=0;row<100;row++){
			for(int col=0;col<50;col++){
				studentData[row][col] = row+col;
				 System.out.print(studentData[row][col]  + " ");
				}
			System.out.println();
			
		}

	}

}
