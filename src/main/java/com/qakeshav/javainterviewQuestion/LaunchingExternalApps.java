package com.qakeshav.javainterviewQuestion;

import java.io.IOException;

public class LaunchingExternalApps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Runtime runtime=Runtime.getRuntime(); //getting runtime object
		Process process;
		try {
			process=runtime.exec("notepad.exe");//opens new notepad instance
			//process=runtime.exec("Notepad++.exe");
			
			//opens specific notepad file from directory
			//process=runtime.exec("notepad D:\\mydoc2.txt");
			Thread.sleep(3000);
			process.destroy();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
