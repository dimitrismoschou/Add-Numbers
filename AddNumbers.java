import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           @SuppressWarnings("unused")
      Scanner input;
           input=new Scanner(System.in);
           
           int number1;
           int number2;
           int sum;
           int sub;
           int mul;
           float div;
           
         System.out.print("����� ��� ����� ������="); 
         number1=input.nextInt();
         System.out.print("����� ��� ������� ������=");
         number2=input.nextInt();
         
          sum=number1+number2;
       	  System.out.print("�� �������� ���� ����=");
          System.out.println(sum);
          sub=number1-number2;
          System.out.print("� ������� ���� ����=");
          System.out.println(sub);
          mul=number1*number2;
          System.out.print("�� �������� ���� ����=");
          System.out.println(mul);
          if (number2!=0) {
        	 div=number1/number2;
         }
         else {
         System.out.println("������������ �������� �� �� 0");
         }
         System.out.print("�� ������ ���� �����=");
         System.out.println(Math.round((1.0 * number1) / number2 * 10.0)/10.0);
         
         
           
	}

	
	

}
