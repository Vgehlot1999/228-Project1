package edu.iastate.cs228.proj1.tests;

import static org.junit.Assert.*;

import org.junit.Rule;

import org.junit.Test;

import org.junit.rules.ExpectedException;

import edu.iastate.cs228.proj1.GenomicDNASequence;
import edu.iastate.cs228.proj1.Sequence;

/**
 * 
 * @author vismay
 *
 */

public class GenomicDNASequenceTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void Constructor()
	{
		GenomicDNASequence test = new GenomicDNASequence("AATGAGCCATCGA".toCharArray());
		assertArrayEquals("AATGAGCCATCGA".toCharArray(), test.getSeq());
	}
	
	@Test
	public void MarkCodingTester()
	{
		thrown.expect(IllegalArgumentException.class);
		GenomicDNASequence test = new GenomicDNASequence("AATGAGCCATCGA".toCharArray());
		test.markCoding(-1, 0);
		test.markCoding(6, 4);
		test.markCoding(0, 13);
	}
	
	@Test
	public void extractExonTest()
	{
		thrown.expect(IllegalArgumentException.class);
		GenomicDNASequence test = new GenomicDNASequence("AATGAGCCATCGA".toCharArray());
		
		int[] i = new int[5];
		test.extractExons(i);
		
		int[] j = new int[0];
		test.extractExons(j);
		
		int[] k = new int[13];
		test.extractExons(k);
		
		thrown.expect(IllegalArgumentException.class);
		test.extractExons(i);
		
		
		assertArrayEquals("AATGA".toCharArray(), test.extractExons(i));
		
	}

}
