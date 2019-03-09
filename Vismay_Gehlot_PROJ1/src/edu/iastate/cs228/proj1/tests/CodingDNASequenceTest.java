package edu.iastate.cs228.proj1.tests;

import static org.junit.Assert.*;

import org.junit.Rule;

import org.junit.Test;

import org.junit.rules.ExpectedException;

import edu.iastate.cs228.proj1.CodingDNASequence;
/**
 * 
 * @author vismay
 *
 */

public class CodingDNASequenceTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void Constructor()
	{
		CodingDNASequence test = new CodingDNASequence("AATGAGCCATCGA".toCharArray());
		assertArrayEquals("AATGAGCCATCGA".toCharArray(), test.getSeq());
	}

	@Test
	public void StartCodonTester()
	{
		CodingDNASequence test1 = new CodingDNASequence("AATGAGCCATCGA".toCharArray());
		CodingDNASequence test2 = new CodingDNASequence("ATGAGCCATCGA".toCharArray());
		CodingDNASequence test3 = new CodingDNASequence("AT".toCharArray());
		assertTrue(test2.checkStartCodon());
		assertFalse(test1.checkStartCodon());
		assertFalse(test3.checkStartCodon());
	}
	
	@Test
	public void TranslateTester()
	{
		thrown.expect(RuntimeException.class);
		CodingDNASequence test1 = new CodingDNASequence("AATGAGCCATCGA".toCharArray());
		test1.translate();
		
		CodingDNASequence test2 = new CodingDNASequence("ATGAGCCATCGA".toCharArray());
		assertArrayEquals("MSHR".toCharArray(), test2.translate());
	}
	
}
