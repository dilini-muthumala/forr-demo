package com.wso2.android.app;

public class AndroidAppService{

	private static String lastMessage;
	
	public String getLastMessage() {
		return lastMessage;
	}
	
	public void putMessage(String message) {
		//System.out.println("invoked put message");
		AndroidAppService.lastMessage = message;
	}
}