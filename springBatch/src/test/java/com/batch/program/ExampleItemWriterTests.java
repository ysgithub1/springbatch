package com.batch.program;

import com.batch.program.ExampleItemWriter;

import junit.framework.TestCase;

public class ExampleItemWriterTests extends TestCase {

	private ExampleItemWriter writer = new ExampleItemWriter();
	
	public void testWrite() throws Exception {
		writer.write(null); // nothing bad happens
	}

}
