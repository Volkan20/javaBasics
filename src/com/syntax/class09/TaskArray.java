package com.syntax.class09;

public class TaskArray {

	public static void main(String[] args) {

System.out.println("TASK1 ALF");
	char[] alf = new char[6];
		
		alf[0]='A';
		alf[1]='B';
		alf[2]='C';
		alf[3]='D';
		alf[4]='E';
		alf[5]='F';
		
		System.out.println(alf[1]);
		
	System.out.println("OTHER WAY");
		
	char[] alfs= {'A','B','C','D','E','F'};
	
		System.out.println(alfs[1]);
		
System.out.println("TASK2 NAMES");	
		
	String[] names=new String[5];
	
		names[0]="Volkan";
		names[1]="Medine";
		names[2]="Hakan";
		names[3]="Tuba";
		names[4]="Ozkan";
		
		System.out.println(names[0]);
		
	System.out.println("OTHER WAY");
		
	String[] name= {"Volkan", "Medine", "Hakan", "Tuba", "Ozkan"};
		
		System.out.println(name[0]);
		
System.out.println("TASK3 SENTENCE");

	String[] word=new String[5];
	
		word[0]="Java ";
		word[1]="Day ";
		word[2]="Saturday ";
		word[3]="is ";
		word[4]="coding ";
		
		System.out.println(word[2]+word[3]+word[0]+word[4]+word[1]);
		
	System.out.println("OTHER WAY");	
		
		String[] words= {"Java ", "Day ", "Saturday ", "is ", "coding "};
		
		System.out.println(words[2]+words[3]+words[0]+words[4]+words[1]);
		
	}

}
