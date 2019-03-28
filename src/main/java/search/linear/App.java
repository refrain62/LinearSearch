package search.linear;

import java.util.Scanner;

public class App
{
	public static void main( String[] args )
	{
		LinearSearch linearSearch = LinearSearch.getInstance();
		int result = LinearSearch.C_NOT_FOUND;
		
		// 探索データの定義
		int[] searchData = { 1, 2, 3, 4, 5 };

		int searchVal = -999;
		
		System.out.println("Linear Search App Start!");
		
		// 検索データの出力
		outputSearchData(
						searchData
						);
		
		// キー入力（数値として）
		searchVal = inputKeyValue();
		
		// 探索
		result = linearSearch.execute(
										searchData,
										searchVal
										);
		
		// 結果の出力
		outputResult(
							result,
							LinearSearch.C_NOT_FOUND
							);
	}

	/**
	 * 検索データの出力
	 * @param argSearchData
	 * @return
	 */
	private static void outputSearchData(
										int[] argSearchData
										)
	{
		String strDelimiter = "";
		
		System.out.print("Array Data is [");

		strDelimiter = "";
		
		for( int val : argSearchData )
		{
			System.out.print( strDelimiter + val );
			
			strDelimiter = ", ";
		}
		
		System.out.println("]");
	}
	
	/**
	 *  キー入力（数値として）
	 * @return
	 */
	private static int inputKeyValue()
	{
		int searchVal = -999;
		
		// 標準入力を使う準備
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is the search value of array data？");
		
		searchVal = scanner.nextInt();
		
		return searchVal;
	}
	
	/**
	 *  結果の出力
	 * @param argResult
	 * @param argNotFoundValue
	 */
	private static void outputResult(
								int argResult,
								int argNotFoundValue
							)
	{
		// 探索結果NG
		if(		argNotFoundValue == argResult
			)
		{
			System.out.println("Data Not Found.");
		}
		// 探索OK
		else
		{
			System.out.println("Data Found. Array index is " + (argResult + 1) );	
		}
	}
}
