package com.deepexi.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class FileUtilsTest {

	@Test
	public void createTmpFile() {
		InputStream inputStream = FileUtilsTest.class.getClassLoader().getResourceAsStream("com/deepexi/util/FileUtilsTest.class");
		try {
			File tmpFile = FileUtils.createTmpFile(inputStream, "tempfile", "java");
			System.out.println(tmpFile.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
