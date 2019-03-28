package search.linear;

import java.util.Scanner;

public class App
{
	public static void main( String[] args )
	{
		// 標準入力を使う準備
		Scanner scanner = new Scanner(System.in);
		
		LinearSearch linearSearch = LinearSearch.getInstance();
		
		int result = LinearSearch.C_NOT_FOUND;
		int[] searchData = { 1, 2, 3, 4, 5 };

		int searchVal = -999;
		String strDelimiter = "";
		
		// メッセージ表示
		System.out.println("Linear Search App Start!");
		System.out.print("Array Data is [");

		strDelimiter = "";
		
		for( int val : searchData )
		{
			System.out.print( strDelimiter + val );
			
			strDelimiter = ", ";
		}
		System.out.println("]");
		
		// キー入力（数値として）
		System.out.println("What is the search value of array data？");
		searchVal = scanner.nextInt();
		
		// 探索
		result = linearSearch.execute(
										searchData,
										searchVal
										);
		
		// 探索結果NG
		if(		LinearSearch.C_NOT_FOUND == result
			)
		{
			System.out.println("Data Not Found.");
		}
		// 探索OK
		else
		{
			System.out.println("Data Found. Array index is " + (result + 1) );	
		}
	}
}
