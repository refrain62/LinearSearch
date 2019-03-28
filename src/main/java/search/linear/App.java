package search.linear;

import java.util.Scanner;

public class App
{
	public static void main( String[] args )
	{
		// �W�����͂��g������
		Scanner scanner = new Scanner(System.in);
		
		LinearSearch linearSearch = LinearSearch.getInstance();
		
		int result = LinearSearch.C_NOT_FOUND;
		int[] searchData = { 1, 2, 3, 4, 5 };

		int searchVal = -999;
		String strDelimiter = "";
		
		// ���b�Z�[�W�\��
		System.out.println("Linear Search App Start!");
		System.out.print("Array Data is [");

		strDelimiter = "";
		
		for( int val : searchData )
		{
			System.out.print( strDelimiter + val );
			
			strDelimiter = ", ";
		}
		System.out.println("]");
		
		// �L�[���́i���l�Ƃ��āj
		System.out.println("What is the search value of array data�H");
		searchVal = scanner.nextInt();
		
		// �T��
		result = linearSearch.execute(
										searchData,
										searchVal
										);
		
		// �T������NG
		if(		LinearSearch.C_NOT_FOUND == result
			)
		{
			System.out.println("Data Not Found.");
		}
		// �T��OK
		else
		{
			System.out.println("Data Found. Array index is " + (result + 1) );	
		}
	}
}
