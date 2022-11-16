package com.stone.recursion;

public class Labyrinth {
    public static void main(String[] args) {
        //创建一个二维数组，模仿迷宫
        int[][] map = new int[8][7];
        //use 1 as wall
        for(int i=0; i<7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        for(int j=0; j<8; j++) {
            map[j][0] = 1;
            map[j][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;

        for(int[] row: map) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        boolean result = setWay(map, 1, 1);
        System.out.println(result);
    }

    //使用递归回溯来给小球找路
    /*
        如果小球走到一个规定点，则说明能走到
        约定map[i][j]为0表示该点没有走过，为1表示墙，为2表示通路可以走，3表示已经走过但是走不通
        选择策略为：下->右->上->左，如果该点走不通。再回溯
     */
    /**
     *
     * @param map current map
     * @param i init row
     * @param j init column
     * @return isFound true or false
     */
    public static boolean setWay(int[][] map, int i, int j) {
        if(map[6][5] == 2) {
            return true;
        } else {
            //如果该点还没走过
            if(map[i][j] == 0) {
                map[i][j] = 2;
                if(setWay(map, i+1,j)) {
                    return true;
                } else if(setWay(map,i,j+1)) {
                    return true;
                } else if(setWay(map,i-1,j)) {
                    return true;
                } else if (setWay(map,i,j-1)){
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
              return false;
            }
        }
    }
}
