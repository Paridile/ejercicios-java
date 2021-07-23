package com.paridile.assignments;

class Dims {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, }, { 3, 4 } };
        int[] b = (int[]) a[1];
        Object o1 = a;
        int[][] a2 = (int[][]) o1;
        // Se estaba intentando castear con int[] a un objeto de tipo int[][]        
        //int[] b2 = (int[]) o1;
        System.out.println(b[1]);
    }
}
