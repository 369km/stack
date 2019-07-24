package com.foo.core.collect;

public class Graph {
    private int[] mapping;
    private int[][] matrix;

    public Graph(int[] vertexes) {
        int length = vertexes.length;
        mapping = new int[length];
        matrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            mapping[i] = vertexes[i];
        }
    }

    public void addEdge(int start,int end){
        int x=-1;
        int y=-1;
        //寻找坐标
        for (int i=0;i<mapping.length;i++){
            if (x!=-1&&y!=-1){
                break;
            }
            if (start==mapping[i]){
                x=i;
            }
            if (end==mapping[i]){
                y=i;
            }
        }
        //判断顶点是否存在
        if (x==-1||y==-1||x>mapping.length-1||y>mapping.length-1){
            throw new IndexOutOfBoundsException("顶点不存在");
        }
        //增加边
        matrix[x][y]=1;
    }

    public void  printMatrix(){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
