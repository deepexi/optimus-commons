package com.deepexi.util;

import org.junit.Test;

public class MD5UtilTest {

	@Test
	public void md5usage() {
        String plaintext = "123"; // 72204153686e229036d08f4207c05f507a49b4244e133a38
        // root 295850b9fa4034b94061e38da8d760a1b743120268f1c14b

        System.out.println("原始：" + plaintext);
        System.out.println(MD5Util.getMd5ByString("123"));
        System.out.println("普通MD5后：" + MD5Util.MD5(plaintext));

        String ciphertext = MD5Util.generate(plaintext);
        System.out.println("加盐后MD5：" + ciphertext);
        System.out.println("是否是同一字符串:" + MD5Util.verify(plaintext, ciphertext));

        System.out.println("MD5Util.verify(\""+plaintext+ "\", \""+ ciphertext+"\")  = "+MD5Util.verify(plaintext, ciphertext));
    }
}
