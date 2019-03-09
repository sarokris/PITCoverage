package com.ilearn.pit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.verification.VerificationModeFactory;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ SystemHelper.class })
public class PITCoverageTest {

	PITConverage pitCoverageTest;

	@Before
	public void setUp() {
		PowerMockito.mockStatic(System.class);

		pitCoverageTest = new PITConverage();
	}

	@Test
	public void forLoopMutationTestReturnFalse() {
//		PowerMockito.mockStatic(Utils.class);

		char ch[] = { 'a' };
		char[] newCharArray = new char[ch.length];
		assertFalse(pitCoverageTest.forLoopMutation(ch));
		
//		PowerMockito.verifyStatic(VerificationModeFactory.times(1));
//		System.getProperty("TEST");
		
		
		PowerMockito.verifyStatic(VerificationModeFactory.times(1));
		System.arraycopy(ch, 0, newCharArray, 0, ch.length);
		
		PowerMockito.verifyStatic(VerificationModeFactory.times(1));
		System.getProperty("TEST");
		
		PowerMockito.verifyNoMoreInteractions(System.class);

//		System mock = Mockito.mock(System);

	}

	@Test
	public void forLoopMutationTestReturnTrue() {

		char ch[] = { ' ' };
		assertTrue(pitCoverageTest.forLoopMutation(ch));

	}

	@Test(expected = NullPointerException.class)
	public void forLoopMutationTestWithNullCharArray() {

		char ch[] = null;
		pitCoverageTest.forLoopMutation(ch);

	}

	@Test
	public void forLoopMutationTestWithEmptyCharArray() {

		char ch[] = {};
		System.out.println(ch.length);
		assertFalse(pitCoverageTest.forLoopMutation(ch));

	}

	@Test
	public void forLoopMutationTestWithMultipleCharArray() {

		char ch[] = { 'a', 'b', 'c' };
		System.out.println(ch.length);
		assertFalse(pitCoverageTest.forLoopMutation(ch));

	}

	@Test
	public void hasValueTestReturnFalse() {

		String input = "";
		assertFalse(pitCoverageTest.hasValue(input));

	}

	@Test
	public void hasValueTestReturnTrue() {

		String input = "test";
		assertTrue(pitCoverageTest.hasValue(input));

	}

	@Test(expected = NullPointerException.class)
	public void hasValueTestExpectException() {

		String input = null;
		pitCoverageTest.hasValue(input);

	}

}
