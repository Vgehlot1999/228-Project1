package edu.iastate.cs228.proj1.tests;

import static org.junit.Assert.*;

import org.junit.Rule;

import org.junit.Test;

import org.junit.rules.ExpectedException;

import edu.iastate.cs228.proj1.Sequence;

/**
 * 
 * @author vismay
 *
 */

public class SequenceTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void Constructor()
	{
		Sequence test = new Sequence("AATGAGCCATCGA".toCharArray());
		assertArrayEquals("AATGAGCCATCGA".toCharArray(), test.getSeq());
	}
	
	@Test
	public void LengthTester()
	{
		Sequence test = new Sequence("AGATAGATAG".toCharArray());
		assertEquals(10, test.seqLength());
	}
	
	@Test
	public void getSeqTester()
	{
		Sequence test = new Sequence("ATGAGCTAGTC".toCharArray());
		assertEquals("ATGAGCTAGTC", test.toString());
	}
	
	@Test
	public void testEquals()
	{
		Sequence test1 = new Sequence("AGTAGCTAGCTAGCT".toCharArray());
		Sequence test2 = new Sequence("AGTAGCTAGCTAGCT".toCharArray());
		Sequence test3 = new Sequence("A".toCharArray());
		
		assertFalse(test1.equals(test3));
		assertTrue(test1.equals(test2));	
	}
	
	@Test
	public void InvalidLetter()
	{
		thrown.expect(IllegalArgumentException.class);
		Sequence test = new Sequence("AGCTACTAGCTAGAGGAATCGT1".toCharArray());
	}
	
	
	
}
