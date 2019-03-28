package search.linear;

/*
���όv�Z�ʁF O(n)

���X�g�̐擪����v�f�����o��
���o�����v�f�̒l�ƒT�������v�f�̒l���r����
�E��v����ΒT������
�E��v���Ȃ���Ύ��̗v�f�����o��
*/

public class LinearSearch
{
	// Singleton�p
	private static LinearSearch linearSearch = new LinearSearch(); 
	
	// ������Ȃ������ꍇ�̖߂�l
	public static int C_NOT_FOUND = -1;
	
	// �O������C���X�^���X���ł��Ȃ��悤�ɃR���X�g���N�^��private��
	private LinearSearch()
	{	
	}
	
	// �C���X�^���X��Ԃ�
	public static LinearSearch getInstance()
	{
		return linearSearch;
	}
	
	// �T�����s
	public int execute(
						int[] argData,
						int argVal
						)
	{
		if(		argData != null
			)
		{
			// ���[�v�ŒT�����A��v������C���f�b�N�X��Ԃ�
			for( int i = 0; i < argData.length; i++ )
			{
				// �������O�ɏo��
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
