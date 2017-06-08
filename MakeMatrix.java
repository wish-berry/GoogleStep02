package matrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class MakeMatrix {
	// 行列のサイズNとその積の実行時間Tの関係を求めたい。
	// まずは行列の積を求める。
	// 行列の大きさNは不定である
	// 入力をNで受け取る
	// N*Nの掛け算の結果を出力するプログラム
	public static void main(String args[]){
		int n;
		System.out.println("Input N:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			String buf = br.readLine();
			n = Integer.parseInt(buf);
		}catch(Exception e){
			n = 0;
		}

		int matrixA[][], matrixB[][], matrixC[][];
		matrixA = new int[n][n];
		matrixB = new int[n][n];
		matrixC = new int[n][n];
		Random rnd = new Random();

		// 配列の初期化
		for( int i = 0 ; i < n ; i++ ){
			for( int j = 0 ; j < n ; j++ ){
				matrixA[i][j] = 1; //rnd.nextInt(10) + 10;
				matrixB[i][j] = 1; //rnd.nextInt(10) + 10;
			}
		}

		long start = System.nanoTime();
		// 行列の積
		for( int i = 0 ; i < n ; i++ ){
			for( int j = 0 ; j < n ; j++ ){
				int product = 0;
				for( int k = 0 ; k < n ; k++ ){
					product += matrixA[i][k] * matrixB[k][j];
				}

				matrixC[i][j] = product;
			}
		}

		long end = System.nanoTime();

		// 行列の積を求められたら実行時間を出力する
		System.out.println((end - start)  + "ns");

		/*
		for( int i = 0 ; i < n ; i++ ){
			System.out.print("[ ");
			for( int j = 0 ; j < n ; j++ ){

				System.out.print(matrixC[i][j] + " ");

			}
			System.out.println("]");
		}*/


	}

}
