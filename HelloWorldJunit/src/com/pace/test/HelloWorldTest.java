package com.pace.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import com.pace.code.*;

import org.junit.jupiter.api.Test;


class HelloWorldTest {
	
	@Test
	void test() {
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);
		HelloWorld.main(null);
		assertEquals("Hello World!\n",os.toString());
		PrintStream originalOut = System.out;
		System.setOut(originalOut);
		System.out.println(os);
	}

}


