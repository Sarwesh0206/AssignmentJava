package BufferClass;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
           int a,b;
           BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter the value:");
           a=Integer.parseInt(br.readLine());
           b=Integer.parseInt(br.readLine());
           
		try {
			
		  int c=a/b;
		  System.out.println("division:"+c);
		  
			}
		catch(ArithmeticException sk)
		{
			System.out.println("Please entry the Positive Numbers");
			System.out.println("Nextline");
		}
		
	}

}
