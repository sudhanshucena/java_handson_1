package hands_on_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Student
{
  float maths;
  float hindi;
  float english;
  float science;
  float socialScience;
  String category;
  
  Student(float math, float hind, float englsh, float scinc, float socScinc)
  {
    if ((math < 0.0F) || (hind < 0.0F) || (englsh < 0.0F) || (scinc < 0.0F) || (socScinc < 0.0F))
    {
      System.out.println("Please enter valid marks which cannot be less than 0");
    }
    else
    {
      this.maths = math;
      this.hindi = hind;
      this.science = scinc;
      this.english = englsh;
      this.socialScience = socScinc;
    }
  }
  
  void displayMarks()
  {
    System.out.print(this.maths);
    System.out.print(this.hindi);
    System.out.print(this.science);
    System.out.print(this.english);
    System.out.print(this.socialScience);
  }
  
  String calculate()
  {
    float average = (this.maths + this.english + this.hindi + this.science + this.socialScience) / 5.0F;
    if (average < 40.0F) {
      this.category = "Poor";
    } else if ((average >= 40.0F) && (average <= 59.0F)) {
      this.category = "Average";
    } else if ((average >= 60.0F) && (average <= 79.0F)) {
      this.category = "Good";
    } else if ((average >= 80.0F) && (average <= 89.0F)) {
      this.category = "very Good";
    } else {
      this.category = "Excellent";
    }
    return this.category;
  }
  
  public static void main(String[] args)
  {
    List<String> marks = new ArrayList();
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of students");
    try
    {
      for (int val = 0; val < 5; val++)
      {
        String mark = reader.readLine();
        marks.add(mark);
      }
      Student student = new Student(Float.parseFloat((String)marks.get(0)), Float.parseFloat((String)marks.get(1)), Float.parseFloat((String)marks.get(2)), Float.parseFloat((String)marks.get(3)), Float.parseFloat((String)marks.get(4)));
      
      String result = student.calculate();
      System.out.println(result);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
