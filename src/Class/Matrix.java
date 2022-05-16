package Class;

import java.util.Scanner;

final public class Matrix {
    private int M;
    private int N;
    private int[][] data;

    public Matrix(int M, int N, int type_m) {
        Scanner scan = new Scanner(System.in);
        this.M = M;
        this.N = N;
        data = new int[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                if (type_m==0) this.data[i][j]=0;
                else this.data[i][j] = scan.nextInt();
    }


    //C = A + B
    public Matrix plus(Matrix B) {
        Matrix A = this;
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Сложение не возможно");
        Matrix C = new Matrix(M, N,0);
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                C.data[i][j] = A.data[i][j] + B.data[i][j];
        return C;
    }

    // C = A * B
    public Matrix times(Matrix B) {
        Matrix A = this;
        if (A.N != B.M) throw new RuntimeException("Умножение не возможно");
        Matrix C = new Matrix(A.M, B.N,0);
        for (int i = 0; i < C.M; i++)
            for (int j = 0; j < C.N; j++)
                for (int k = 0; k < A.N; k++)
                    C.data[i][j] += (A.data[i][k] * B.data[k][j]);
        return C;
    }

    public String toString()
    {
        String S = "";
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
                S += "\t" + data[i][j];
            S += "\n";
        }
        return S;
    }

}
