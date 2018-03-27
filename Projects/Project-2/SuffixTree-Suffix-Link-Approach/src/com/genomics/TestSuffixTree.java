/**
 * 
 */
package com.genomics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sanghvi Bhavesh
 *
 */

public class TestSuffixTree {
	public static void main(String[] args) {
		
		//To Read file locations from command line arguments 
		String fastaFileName = args[0];
		String alphabetFileName = args[1];
		
		// To read fasta file
		ReadFastaFile readFastaFile = new ReadFastaFile();
		List<Input> inputStrings =  readFastaFile.getInput(fastaFileName);
		String s = null;
	
		for (Input x: inputStrings) {
			s = x.getContent();
		}
		
		// To read alphabet
		ReadAlphabet readAlphabet = new ReadAlphabet();
		List<Character> alphabets = readAlphabet.readAlphabet(alphabetFileName);
		

		// Pass alphabet and fasta file to suffix tree
		SuffixTree tree = new SuffixTree();
		tree.generateSuffixTree(s,alphabets);
		
		// perform depth first search which will print the bwt index
		//tree.depthFirstSearch(tree.root);
		//System.out.println(tree.number_of_nodes);
		
	}
}
