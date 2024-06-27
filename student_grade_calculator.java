 import java.util.Scanner;

public class student_grade_calculator
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter no of Subjects");
        int nS = sc.nextInt();
        int total=0;
        for(int i=0; i<nS; i++){
            System.out.println("Enter marks obtined in" + i+1 + ":");
            int marks=sc.nextInt();
            total+=marks;
        }
        double averp=(double)total/nS;
        char Grade;
        if(averp>=90)
        {
            Grade='0';
    }    else if(averp>=80)
    {
        Grade='A';
    }
         else if(averp>=70)
      {
         Grade='B';
      }
        else if(averp>=60)
     {
        Grade='C';
     }
       else if (averp>=50)
     {
        Grade='D';
     }
        else if (averp>=40)
    {
            Grade='E';
     }
        else if (averp>=30)
    {
        Grade='F';
    }
    System.out.println("Total marks scored is" + total);
    System.out.println("Average percentage Gained is "+ averp + "%");
    System.out.println("Grade :");
}
}