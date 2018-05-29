package main;
import java.io.FileNotFoundException;

import biAlgorithms.ChungAndChruch;


public class Main {
	
	static final String UNIFORME_DATA = "src/uniforme.txt";
	static final String DATA2 = "src/data2.txt";
	static final String DATASET = "src/data.txt";
	
	
	public static void main(String[] args) throws FileNotFoundException {
	System.out.println("start");
	
	int[][]G=MatrixFactory.createMatrixFromFile(UNIFORME_DATA);
	System.out.println("Matrix created");
	MatrixUtils.printArray(G);
	System.out.println();

	BiCluster Bicluster = new BiCluster(G, new ChungAndChruch());
	Bicluster.compute();
	}

}
