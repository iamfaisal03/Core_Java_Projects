package com.main;

import java.util.Scanner;

import com.ODIMatch.ODIMatch;
import com.T20Match.T20Match;
import com.TestMatch.TestMatch;

/**
 * @author faisal
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome To CricketClub");
		Scanner scanner=new Scanner(System.in);
		String temp="y";
		while(temp=="y") {
			System.out.println("Enter the Cricket Format\n1.ODI\n2.T20\n3.Test\n4.Exit");
			int tmp=scanner.nextInt();
			switch(tmp) {
				case 1:
					System.out.println("Enter the Current Score");
					int currentScore=scanner.nextInt();
					System.out.println("Enter the Current Over");
					float currentOver=scanner.nextFloat();
					System.out.println("Enter the Target Score");
					int targetScore=scanner.nextInt();
					ODIMatch odimatch=new ODIMatch(currentScore,currentOver,targetScore);
					int Ballremaining=odimatch.calculateBalls();
					float calculateRunrate=odimatch.calculateRunrate();
					int required=targetScore-currentScore;
					System.out.println("Need "+required+" runs in " +Ballremaining + " Required Runrate : " + String.format("%.2f", calculateRunrate) );
					break;
				case 2:
					System.out.println("Enter the Current Score");
					int currentScoret20=scanner.nextInt();
					System.out.println("Enter the Current Over");
					float currentOvert20=scanner.nextFloat();
					System.out.println("Enter the Target Score");
					int targetScoret20=scanner.nextInt();
					T20Match t20match=new T20Match(currentScoret20,currentOvert20,targetScoret20);
					int Ballremainingt20=t20match.calculateBalls();
					float calculateRunratet20=t20match.calculateRunrate();
					int reqt20=targetScoret20-currentScoret20;
					System.out.println("Need "+reqt20+" runs in " +Ballremainingt20 + " Required Runrate : " + String.format("%.2f", calculateRunratet20) );
					break;
				case 3:
					System.out.println("Enter the Current Score");
					int currentScoretest=scanner.nextInt();
					System.out.println("Enter the Current Over");
					float currentOvertest=scanner.nextFloat();
					System.out.println("Enter the Target Score");
					int targetScoretest=scanner.nextInt();
					TestMatch testmatch=new TestMatch(currentScoretest,currentOvertest,targetScoretest);
					int Ballremainingtest=testmatch.calculateBalls();
					float calculateRunratetest=testmatch.calculateRunrate();
					int reqtest=targetScoretest-currentScoretest;
					System.out.println("Need "+reqtest+" runs in " +Ballremainingtest + " Required Runrate : " + String.format("%.2f", calculateRunratetest) );
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Enter the valid choice");
		
			}	


			
		}
		
	}

}