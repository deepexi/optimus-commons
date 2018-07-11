package com.deepexi.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

public class FtpClient {

	private FTPClient client;
	private boolean isconnected = false;

	public boolean connect(String host, int port, String username, String pwd) {
		if (StringUtils.isNotBlank(host) && port > 0) {
			client = new FTPClient();
			try {
				client.connect(host, port);
				int reply = client.getReplyCode();
				if (!FTPReply.isPositiveCompletion(reply)) {
					isconnected = false;
				} else {
					if (client.login(username, pwd)) {
						client.setFileType(FTP.BINARY_FILE_TYPE);
						client.changeWorkingDirectory("/");
						isconnected = true;
					}
				}
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return isconnected;
	}

	public void changeWorkingDirectory(String path) throws IOException {
		if (isconnected) {
			client.changeWorkingDirectory(path);
		}
	}

	public void sendSiteCommand(String cmd) throws IOException {
		if (isconnected) {
			client.sendSiteCommand(cmd);
		}
	}
	
	public void makeDirs(String path,String fixedPath) throws IOException{
		String[] paths = path.split("/");
		if(isconnected){
			client.changeWorkingDirectory("/"+fixedPath);
			String pdir = "/";
			for(String p:paths){
				if(client.makeDirectory(p)){
					pdir+=p+"/";
					client.changeWorkingDirectory(pdir);
				}else{
					break;
				}
			}
		}
	}

	public void putFile(String path,String fixedPath,String ftpFileName, InputStream in) throws IOException {
		try {
			if(isconnected){
				client.enterLocalPassiveMode();
				makeDirs(path,fixedPath);
				client.changeWorkingDirectory("/"+fixedPath+path);
				if (!client.storeFile(ftpFileName, in)) {
					throw new IOException("Can't upload file '" + ftpFileName
							+ "' to FTP server. Check FTP permissions and path.");
				}
			}
		} finally {
			try {
				in.close();
			} catch (IOException ex) {
			}
		}
	}
	
	public boolean delete(String path,String fileName) throws IOException{
		boolean result = false;
		if(isconnected){
			client.changeWorkingDirectory("/"+path);
			result = client.deleteFile(fileName);
		}
		return result;
	}
	
	/**
	 * 复制单个文件
	 * @param fullFileName 源文件,全路径
	 * @param targetFileName 目标文件，全路径
	 */
	public void copySingleFile(String fullFileName,String targetFileName)throws IOException{
		ByteArrayOutputStream fos = null;
		ByteArrayInputStream in = null;
		try {
			if(isconnected){
				client.enterLocalPassiveMode();
				client.changeWorkingDirectory("/");
				fos = new ByteArrayOutputStream();
				client.retrieveFile(fullFileName, fos);
				in = new ByteArrayInputStream(fos.toByteArray());
				client.storeFile(targetFileName, in);
			}
		}finally {
			try {
				if(fos!=null){
					fos.close();
				}
				if(in!=null){
					in.close();
				}
			} catch (IOException ex) {
			}
		}
	}

	public void disconnect() throws IOException {
		if (client != null && client.isConnected()) {
			client.logout();
			client.disconnect();
			isconnected = false;
		}
	}
	
	/**
	 * 下载文件
	 * @param path
	 * 下载文件所在文件夹路径
	 * @param fileName
	 * 下载文件名（这里是已经加密的名字）
	 * @param trueName
	 * 真实文件名
	 * @return
	 */
	public boolean downLoadFiles(String path,String fileName,String trueName,OutputStream os){
		boolean result = false;
		try {
			if(isconnected){
				client.changeWorkingDirectory("/"+path);
				FTPFile[] fs = client.listFiles();
				for(FTPFile ff:fs){
					if(ff.getName().equals(fileName)){ 
						
	                    client.retrieveFile(ff.getName(), os);   
	                      
					}
				}
				client.logout(); 
				result = true; 
			}
			
			
		}catch (IOException e) { 
	        e.printStackTrace(); 
	    } finally { 
	        if (isconnected) { 
	            try { 
	            	client.disconnect(); 
	            } catch (IOException ioe) { 
	           
	            } 
	        } 
	    } 
		return result;
	}
}
