package team;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard= new Scanner(System.in);
		
		String teamName;
		String name1,name2,name3,name4;
		System.out.println("Enter team name: ");
		teamName=keyboard.nextLine();
		System.out.println("Enter name1: ");
		name1=keyboard.nextLine();
		System.out.println("Enter name2: ");
		name2=keyboard.nextLine();
		System.out.println("Enter name3: ");
		name3=keyboard.nextLine();
		System.out.println("Enter name4: ");
		name4=keyboard.nextLine();
		
		Team	input1=new Team(name1,name2,name3,name4,teamName),
				input2=new Team(name2,name3,name4,teamName),
				input3=new Team(name3,name4,teamName),
				input4=new Team(name4,teamName),
				input5=new Team(teamName),
				input6=new Team();
		
		System.out.println(input1.getNames());
		System.out.println(input2.getNames());
		System.out.println(input3.getNames());
		System.out.println(input4.getNames());
		System.out.println(input5.getNames());
		System.out.println(input6.getNames());
		
		String nameOfCompetition,nameOfWiningTeam,nameOfTheRunnerUp;
		int yearOfCompetition;
		System.out.println("Enter name of competition: ");
		nameOfCompetition=keyboard.nextLine();
		System.out.println("Enter name of wining team: ");
		nameOfWiningTeam=keyboard.nextLine();
		System.out.println("Enter name of runner up: ");
		nameOfTheRunnerUp=keyboard.nextLine();
		System.out.println("Enter year of competition: ");
		yearOfCompetition=keyboard.nextInt();
		
		Competition comp1=new Competition(nameOfCompetition,nameOfWiningTeam,nameOfTheRunnerUp,yearOfCompetition),
					comp2=new Competition(nameOfWiningTeam,nameOfTheRunnerUp,yearOfCompetition),
					comp3=new Competition(nameOfTheRunnerUp,yearOfCompetition),
					comp4=new Competition(yearOfCompetition),
					comp5=new Competition();
				
		
		System.out.println(comp1.getNames());
		System.out.println(comp2.getNames());
		System.out.println(comp3.getNames());
		System.out.println(comp4.getNames());
		System.out.println(comp5.getNames());
		
		
		
	}}
