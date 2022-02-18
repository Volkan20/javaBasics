package com.syntax.class08;

public class ClockTask {

	public static void main(String[] args) {

		String time;
		for(int i=0; i<=12; i++) {
			
			for(int j=0; j<=59; j++) {
				
				if(i<10 && j<10) {
				time="0"+i+":"+"0"+j;
				System.out.println(time);
				
				}else if(i<10 && j>=10){
					time="0"+i+":"+j;
					System.out.println(time);
				
				}else if (i>=10 && j<10) {
					time=i+":"+"0"+j;
					System.out.println(time);
				
				}else {
					time=i+" "+j;
					System.out.println(time);
				}
			}
		}
			
 }
}
