package edu.iastate.cs228.proj1.tests;

import static org.junit.Assert.*;

import org.junit.Rule;

import org.junit.Test;

import org.junit.rules.ExpectedException;

import edu.iastate.cs228.proj1.DNASequence;

/**
 * 
 * @author vismay
 *
 */
public class DNASequenceTest {
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void Constructor()
	{
		DNASequence test = new DNASequence("AGCTAGCTAGCTAGGT".toCharArray());
		assertArrayEquals("AGCTAGCTAGCTAGGT".toCharArray(), test.getSeq());
	}
	
	@Test
	public void testInvalidLetter()
	{
		thrown.expect(IllegalArgumentException.class);
		DNASequence test = new DNASequence("AGCTACTAGCTAGAGGAATCGT1".toCharArray());
	}
}
