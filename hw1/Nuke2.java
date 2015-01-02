/* Nuke2.java */

import java.io.*;

class Nuke2 {

    public static void main(String[] args) throws Exception {

	String inputLine;
	BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

	System.out.flush();

	inputLine = keyboard.readLine();
	char[] test = inputLine.toCharArray();
	//	System.out.println(test.length);
	for(int i=0;i<test.length;i++){
	    if (i != 1){
		System.out.print(test[i]);
	    }
	}
	System.out.println("");
    }


}
