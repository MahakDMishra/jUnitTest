package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class testaddstrings {

	@Test
	public void test() {
		jUnitFunctions junit=new jUnitFunctions();
		String result=junit.AddStrings("Hello", "World");
		assertEquals("Hello World",result);
	}

}
