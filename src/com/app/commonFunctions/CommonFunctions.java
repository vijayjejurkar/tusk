package com.app.commonFunctions;

public class CommonFunctions {
	
	public StringBuilder gszSumbitData = new StringBuilder();
	public StringBuilder gszPostData = new StringBuilder();
	
	public void BuildInputs() {
		
		String pStart = new String();
		String pEnd;
		String szElement;
		pStart = "Response";
		System.out.println("Response Is="+pStart);
		
		
		while(true) {
			
			pStart = pStart.substring(pStart.indexOf("<string>recordId</string><>"));
			
			if(pStart == null) 
				break;
			
			pStart = pStart.substring("<string>recordid</string><int>".length());
			System.out.println("PStart Is = "+pStart);
			pEnd = pStart.substring(pStart.indexOf("<"));
			
			if(pEnd == null)
				break;
			
			pEnd = "\0";
			System.out.println("PStart Is = "+pStart);
			szElement = "<int>"+pStart+"</int>\n";
			System.out.println("Element is"+szElement);
			gszSumbitData = gszSumbitData.append(szElement);
			gszPostData = gszPostData.append(szElement);
			
			//pStart = pEnd+1;
			System.out.println("pend is "+pStart);
		}

		//return 0;
		
		
	}

	public void AMF_Call1() {
		flex_amf_call();
		//return 0;
	}
	
	
	public static void flex_amf_call() {
		
	}
	}

