package edu.iastate.cs228.proj1.tests;

import static org.junit.Assert.*;

import org.junit.Rule;

import org.junit.Test;

import org.junit.rules.ExpectedException;

import edu.iastate.cs228.proj1.ProteinSequence;
import edu.iastate.cs228.proj1.Sequence;

/**
 * 
 * @author vismay
 *
 */
public class ProteinSequenceTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void Constructor()
	{
		ProteinSequence test = new ProteinSequence("AATGAGCCATCGA".toCharArray());
		assertArrayEquals("AATGAGCCATCGA".toCharArray(), test.getSeq());
	}
	
	@Test
	public void InvalidLetterTester()
	{
		thrown.expect(IllegalArgumentException.class);
		Sequence test = new Sequence("AGCTACTAGCTAGAGGAATCGT1".toCharArray());
	}

}
