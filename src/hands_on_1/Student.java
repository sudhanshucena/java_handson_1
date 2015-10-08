package hands_on_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//import java.lang.Math;

public class Student {

	float maths,hindi,english,science,socialScience;
	String category;
	
	//Parameterised constructor
	Student(float math,float hind,float englsh,float scinc,float socScinc){
		if(math<0 || hind<0 || englsh <0|| scinc<0 || socScinc < 0){
			System.out.println("Please enter valid marks which cannot be less than 0");
		}
		else{
		maths=math;
		hindi=hind;
		science=scinc;
		english=englsh;
		socialScience=socScinc;}
	}
	
//	display marks
	void displayMarks(){
		System.out.print(maths);
		System.out.print(hindi);
		System.out.print(science);
		System.out.print(english);
		System.out.print(socialScience);
	}
	
	//Calculate function
	 String calculate(){
		float average = (maths+english+hindi+science+socialScience)/5;
		if(average < 40){
			category= "Poor";
		}
		else if(average >= 40 && average <= 59){
			category= "Average";
		}
		else if(average >= 60 && average <= 79  ){
			category= "Good";
		}
		else if(average >=80 && average <= 89){
			category= "very Good";
		}
		else {
			category= "Excellent";
		}
		return category;
	}
	
	public static void main(String args[]){
		List<String> marks = new ArrayList<String>();
		Student student;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the marks of the student");
		String mark,result;
		try {
			for(int val=0;val<5;val++)
			{
				mark = reader.readLine();
				marks.add(mark);
			}
			student = new Student(Float.parseFloat(marks.get(0)),Float.parseFloat(marks.get(1)),Float.parseFloat(marks.get(2)),Float.parseFloat(marks.get(3)),Float.parseFloat(marks.get(4)));
	//			student.displayMarks();
			result=student.calculate();
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
