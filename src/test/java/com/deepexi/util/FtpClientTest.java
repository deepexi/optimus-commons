package com.deepexi.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;

/**
 * ftp工具测试类
 * @author yunzi7758
 *
 */
public class FtpClientTest {

	@Test
	public void putfile() {
		byte[] buf = {};
		for (int i = 0; i < 5; i++) {
			FtpClient.putFile("127.0.0.1", 21, "deepexi", "123456", "1/18071"+i, "ftp/", "0713.txt", new ByteArrayInputStream(buf));
		}
		for (int i = 0; i < 5; i++) {
			FtpClient.putFile("127.0.0.1", 21, "deepexi", "123456", "1/18071"+i, "ftp/", "0713.txt", new ByteArrayInputStream(buf));
		}
	}
	
	@Test
	public void downLoadFiles() throws FileNotFoundException {
		FtpClient.downLoadFiles("127.0.0.1", 21, "deepexi", "123456", "ftp/1/180711", "0713.txt", new FileOutputStream(new File("c:/ftp/downfile1.txt")));
	}
	
	@Test
	public void delete() {
		FtpClient.delete("127.0.0.1", 21, "deepexi", "123456", "ftp/1/180714", "0713.txt");
	}
}
