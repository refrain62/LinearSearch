package search.linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
  public static void main( String[] args )
  {
    LinearSearch linearSearch = LinearSearch.getInstance();
    
    int result = LinearSearch.C_NOT_FOUND;
    int searchVal = -999;
    
    // �T���f�[�^�̒�`
    int[] searchData = { 1, 2, 3, 4, 5 };

    System.out.println("Linear Search App Start!");
    
    // �����f�[�^�̏o��
    outputSearchData(
            searchData
            );
    
    // �L�[���́i���l�Ƃ��āj
    searchVal = inputKeyValue();
    
    // �T��
    result = linearSearch.execute(
                    searchData,
                    searchVal
                    );
    
    // ���ʂ̏o��
    outputResult(
              result,
              LinearSearch.C_NOT_FOUND
              );
  }

  /**
   * �����f�[�^�̏o��
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
   *  �L�[���́i���l�Ƃ��āj
   * @return
   */
  private static int inputKeyValue()
  {
      String input = null;
      int number = 0;

    System.out.println("What is the search value of array data�H");
    
      try
      {
          BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
          
          input = bufferedReader.readLine();
          
          number = Integer.parseInt(input);
      }
      catch( NumberFormatException ex )
      {
         System.out.println("Not a number !");
      }
      catch( IOException e )
      {
          e.printStackTrace();
      }
      
      return number;
  }
  
  /**
   *  ���ʂ̏o��
   * @param argResult
   * @param argNotFoundValue
   */
  private static void outputResult(
                int argResult,
                int argNotFoundValue
              )
  {
    // �T������NG
    if(   argNotFoundValue == argResult
      )
    {
      System.out.println("Data Not Found.");
    }
    // �T��OK
    else
    {
      System.out.println("Data Found. Array index is " + (argResult + 1) ); 
    }
  }
}
