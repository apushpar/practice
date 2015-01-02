/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;
    BufferedReader web;

    keyboard = new BufferedReader(new InputStreamReader(System.in));
    //    web = new BufferedReader(new);

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
    String url = "http://www."+inputLine+".com";
    System.out.println(url);
    URL webSite = new URL(url);
    web = new BufferedReader(new InputStreamReader(webSite.openStream()));

    String webLine;
    String[] webLineArray = new String[5];
    int lineCount = 0;
    
    while((webLine = web.readLine())!= null){
	    webLineArray[lineCount] = webLine;
	    System.out.println(lineCount);

	    lineCount++;

	    if(lineCount == 5){
		break;
	    }
	}

    System.out.println(webLineArray[4]);
    System.out.println(webLineArray[3]);
    System.out.println(webLineArray[2]);
    System.out.println(webLineArray[1]);
    System.out.println(webLineArray[0]);
    
  }
}
