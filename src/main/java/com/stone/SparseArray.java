package com.stone;

public class SparseArray {
    public static void main(String[] args) {
/*
        创建原始的二维数组
        0表示无子,1表示黑，2表示白
*/
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[4][5] = 2;

        //非0个数
        int sum = 0;
        int originArrRows = chessArr1.length;
        int originArrCols = chessArr1[0].length;
        //遍历原始数组
        for(int i=0; i<originArrRows; i++) {
            for(int j=0; j<originArrCols; j++) {
                if(chessArr1[i][j] != 0) {
                    sum++;
                }
            }
        }

        System.out.println("sum:"+ sum);
        System.out.println("row:"+ originArrRows);
        System.out.println("column:"+ originArrCols);
        System.out.println(sum+1);

        //创建稀疏数组
        int sparseArray[][] = new int[sum+1][3];
        sparseArray[0][0] = originArrRows;
        sparseArray[0][1] = originArrCols;
        sparseArray[0][2] = sum;

        int sparseRow = 1;
        int sparseColumn = 0;
        //遍历原始数组
        for(int k=0; k<originArrRows; k++) {
            for(int l=0; l<originArrCols; l++) {
                if(chessArr1[k][l] != 0) {
                    sparseArray[sparseRow][sparseColumn++] = k;
                    sparseArray[sparseRow][sparseColumn++] = l;
                    sparseArray[sparseRow][sparseColumn++] = chessArr1[k][l];
                    sparseRow++;
                    sparseColumn = 0;
                }
            }
        }


        //输出稀疏数组
        for(int[] row :sparseArray){
            for(int item: row){
                System.out.printf("%d\t",item);
            }
            System.out.println();
        }

        //新二维数组的行数和列数
        int newRows = sparseArray[0][0];
        int newCols = sparseArray[0][1];
        int columnCount = 0;
        int chessArr2[][] = new int[newRows][newCols];

        for(int m=1;m<sparseArray.length;m++) {
                chessArr2[sparseArray[m][columnCount]][sparseArray[m][columnCount+1]] = sparseArray[m][columnCount+2];
                columnCount = 0;
        }

        for(int[] row:chessArr2) {
            for(int item :row) {
                System.out.printf("%d\t",item);
            }
            System.out.println();
        }

    }

}
