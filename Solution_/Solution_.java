
package Solution_;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import Solution_.*;

public class Solution_ {


public static int B;
public static int H;
public static boolean flag = true;

static {
    // whatever code is needed for initialization goes here
    Scanner scan = new Scanner(System.in);
    
    H = scan.nextInt();
    B = scan.nextInt();
    
    if(H<=0 || B <=0 ){
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    };
    
    
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

