package assignment_2;
import java.util.Scanner;
public class assignment_2_questions {
	
	static void armstrong(int no) {
		int temp_1 = no;
		int len = 0;
		if(no==0) {
			System.out.println(no + " is armstrong");
		}
		while(temp_1 != 0) { //This while loop is run to find out the order of the number or the length 
			len=len+1;
			temp_1=temp_1/10;
			
		}
		int temp_2 = no;
		int rem;
		int armstrong = 0;
		
		while(temp_2 != 0) { //This while loop is run to find the armstrong and multiple
			int multiple = 1;
rem=temp_2%10;
for(int i=1;i<=len;i++) {//This loop is used to multiply a particular number with itself the times the order or length is of the number.
	multiple=multiple*rem; 
}
armstrong=armstrong+multiple;//This gives us the total value of the armstrong
temp_2=temp_2/10;
		}
		if(armstrong==no) {//If the armstrong value is equal to the number then the number is an armstrong number
		System.out.println(no + " is armstrong");
		}
		else {
			System.out.println(no + " is not armstrong");
		}
	}
	
	static void star_Pattern(int n) {
	int i,j;
	for(i=0;i<n;i++) {
		for(j=i;j<n;j++) {
		System.out.print("\t ");//Now here we have used tab and also one extra space to make a total of three empty spaces
		//This is done to maintain uniformity
		}
		for(j=0;j<=i;j++) {
			System.out.print("\t*");//Now we have used a tab and a star making a total of three characters. This is done to maintain uniformity
		}
		System.out.println();
	}
	System.out.println();
	}
	
	static void prime_Numbers(int low, int High) {
		int i,f_1,j;
		System.out.println("The Prime Numbers in this range are : ");
		for(i=low;i<=High;i++) {
			if(i==0 || i==1) { // We know that 0 and 1 are neither prime nor composite and hence we will not run the loops below for these
				continue; 
			}
			f_1=1; /*f_1 is any normal variable which will help us find which number is prime.
			       We are setting it as 1 before hand because when we will run the loop below to find
			       wether the number is prime or not, if f_1 = 0 then it is not prime and if f_1=1 then it
			       is prime*/
			for(j=2;j<i;j++) {// We are running the loop from j=2 to j<i because we know a prime number is divisible by 1 and itself
				if(i%j==0) {
					f_1=0;
					break;//This means that the number i is divisible by any number j which is between 2 and i-1
				}
			}
			       if(f_1==1) { // This means that the number is a prime number and it will print it
			    	   System.out.println(i);
			       }
		}
	}
	
	static void toggle_Case(String str) {
		
		char a[]=str.toCharArray();// Now I have used toCharArray function here because I want to convert a string into individual characters
		for(int g=0;g<a.length;g++)//This loop will run for the character array length
			{
				if(a[g]>='A' && a[g]<='Z')
					{
						a[g]=(char)((int)a[g]+32);//We have to do typecasting here other wise the output will come out in int. Plus we have used (int)a[g] so as to get the ASCII value of the character 
						// We have added 32 because there is a gap of 32 in the ASCII Value of a particular character in upper case and lower case
						// For example the ASCII value of 'A' is 65 and the ASCII value of 'a' is 97. Subtracting both we get 32
					}
				else if(a[g]>='a' && a[g]<='z')//This will check wether the character is in lower case
					{
						a[g]=(char)((int)a[g]-32);//This will convert the lower case into upper case
					}
			}
		System.out.println("Output : ");
		for(int g=0;g<a.length;g++)
			System.out.print(a[g]);
		System.out.println();
	}
	
	static void first_Last_Occurence(int A[], int key) {
		int index = first_Occurence(A, key);

		if (index != -1)
		{
		    System.out.println("The first occurrence of element " + key +
		                    " is located at index " + index);
		}
		else {
		    System.out.println("Element not found in the array");
		}


		int index_1 = last_Occurence(A, key);

		if (index_1 != -1)
		{
		    System.out.println("The last occurrence of element " + key +
		            " is located at index " + index_1);
		}
		else {
		    System.out.println("Element not found in the array");
		}

	
	}
	
	static int first_Occurence(int[] A, int x){//This Method will find the first Index of a duplicate element in an array
		int left = 0;
        int right = A.length - 1;
        int result = -1;
        
        while (left <= right)
        {
           
            int mid = (left + right) / 2;
 
            if (x == A[mid])
            {
                result = mid;
                right = mid - 1;
            }
 
            else if (x < A[mid]) {
                right = mid - 1;
            }
 
            else {
                left = mid + 1;
            }
        }
 
        return result;
	}
	
static int last_Occurence(int[] A, int x){//This method will find the last index of a duplicate element in an array
	 int left = 0;
     int right = A.length - 1;
     int result = -1;
     
     while (left <= right)
     {
         int mid = (left + right) / 2;

         if (x == A[mid])
         {
             result = mid;
             left = mid + 1;
         }
         else if (x < A[mid]) {
             right = mid - 1;
         }

         else {
             left = mid + 1;
         }
     }

     return result;
}

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number for which you wanna check wether its armstrong or not : ");
int no=sc.nextInt();
armstrong(no);
System.out.print("Enter the lower range for the prime numbers program : ");
int low=sc.nextInt();
System.out.print("Enter the higher range for the prime numbers program : ");
int High=sc.nextInt();
prime_Numbers(low,High);
System.out.print("Enter the size for the star pattern : "); 
int n=sc.nextInt();
star_Pattern(n);
String str;
System.out.println("Enter the string whose character cases you wanna toggle : ");
str=sc.nextLine();
str=sc.nextLine();
toggle_Case(str);
System.out.println("The Following program will show the first and last index of the element in an array ");
System.out.println("The array size and its elements are the same as given in the question ");
System.out.println("The key is the same as given in the question");
int[] A = {1, 3, 5, 5, 5, 5, 7, 123, 125};
int key = 7;
first_Last_Occurence(A, key);
sc.close();
	}

}
