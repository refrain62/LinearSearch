package search.linear;

/*
平均計算量： O(n)

リストの先頭から要素を取り出す
取り出した要素の値と探したい要素の値を比較する
・一致すれば探索完了
・一致しなければ次の要素を取り出す
*/

public class LinearSearch
{
	// Singleton用
	private static LinearSearch linearSearch = new LinearSearch(); 
	
	// 見つからなかった場合の戻り値
	public static int C_NOT_FOUND = -1;
	
	// 外部からインスタンス化できないようにコンストラクタをprivate化
	private LinearSearch()
	{	
	}
	
	// インスタンスを返す
	public static LinearSearch getInstance()
	{
		return linearSearch;
	}
	
	// 探索実行
	public int execute(
						int[] argData,
						int argVal
						)
	{
		if(		argData != null
			)
		{
			// ループで探索し、一致したらインデックスを返す
			for( int i = 0; i < argData.length; i++ )
			{
				// 情報をログに出力
				System.out.println( "index : " + i + " val: " + argData[ i ] );
				
				if(		argData[ i ] == argVal
					)
				{
					return i;
				}
			}
		}
		
		return C_NOT_FOUND;
	}
}
