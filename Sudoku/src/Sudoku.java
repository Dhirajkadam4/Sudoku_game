public class Sudoku{
    
     //
     //will return the number entered is valid or not in given row and column position in 3x3 sudoku
     //
     public static boolean checkValidity(int sudoku[][], int row, int column, int digit){
         
         //return false if element is already present in that position
         if(sudoku[row-1][column-1] > 0 && sudoku[row-1][column-1] <10) return false;
         
         //check if the number exists in the specified row
         for(int i=0;i<9;i++){
             if(sudoku[row-1][i] == digit)
                return false;
         }
         
         //check if the number exists in the specified column
         for(int i=0;i<9;i++){
             if(sudoku[i][column-1] == digit)
                return false; 
         }
         
         //check if the number exists in the box
         int row_quadrant = 0;                              //stores which Row_quadrant the row belongs to
         int column_quadrant = 0;                           //stores which Column_quadrant the column belongs to 
         if(row > 3 && row < 7) row_quadrant = 1;
         if(row >= 7) row_quadrant = 2;
         if(column > 3 && column < 7) column_quadrant = 1;
         if(column >= 7) column_quadrant = 2;
         
         for(int i=row_quadrant*3;i<(row_quadrant+3);i++)//loop through all the quadrant elements 
         {  
        	  for(int j=column_quadrant*3;j<(column_quadrant+3);j++)
        	  {
                    if(sudoku[i][j] == digit)
                        return false;
             }
         } 
         
         return true;
     }
    

     public static void main(String []args){
        int sample[][] = new int[9][9];
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                sample[i][j] = -1;
            }
        }
        sample[0][0] = 5;
        sample[0][1] = 3;
        sample[0][4] = 7;
        sample[1][0] = 6;
        sample[1][3] = 1;
        sample[1][4] = 9;
        sample[1][5] = 5;
        sample[2][1] = 9;
        sample[2][2] = 8;
        sample[2][2] = 6;
        sample[3][0] = 8;
        sample[3][4] = 6;
        sample[3][8] = 3;
        sample[4][0] = 4;
        sample[4][3] = 8;
        sample[4][5] = 3;
        sample[4][8] = 1;
        sample[5][0] = 7;
        sample[5][4] = 2;
        sample[5][8] = 6;
        sample[6][1] = 6;
        sample[6][6] = 2;
        sample[6][7] = 8;
        sample[7][3] = 4;
        sample[7][4] = 1;
        sample[7][5] = 9;
        sample[7][8] = 5;
        sample[8][5] = 8;
        sample[8][7] = 7;
        sample[8][8] = 9;
        
        if(checkValidity(sample,2,2,4))
            System.out.println("can be inserted.....");
        else
            System.out.println("cannot be inserted.....");
     }
     
     }
     
