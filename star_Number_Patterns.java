package assignment_1;

class Star_Patterns{
	public void patterns_Star() {
	int n = 4;
	int i = 1;
	int j = 1;
	System.out.print("First Pattern :");
	System.out.println();
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.print("Second Pattern :");
	System.out.println();
	for(i=1;i<=n;i++) {
		for(j=i;j<=n;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.print("Third Pattern :");
	System.out.println();
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
		for(i=2;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Fourth Pattern :");
		System.out.println();
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print("  ");//I have given two spaces here since there are two characters in the print statement in the next loop this is done to mantain Symmetry
			}
			for (j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		System.out.println();
		System.out.print("Fifth Pattern :");
		System.out.println();
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print(" "); //I have given only one space here so as to make the pyramid pattern
			}
			for (j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}

class Number_Patterns{
	public void patterns_Numbers() {
	int n = 5;	
	int i = 1;
	int j = 1;
	System.out.println();
	System.out.print("Sixth Pattern");
	System.out.println();
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print(" " + j);
		}
		System.out.println();
	}
	System.out.println();
	System.out.print("Seventh Pattern");
	System.out.println();
	int h = 1;
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print(h++ + " ");
		}
		System.out.println();
	}
	}
}

public class star_Number_Patterns {

	public static void main(String[] args) {
Star_Patterns s1 = new Star_Patterns();
s1.patterns_Star();
Number_Patterns s2 = new Number_Patterns();
s2.patterns_Numbers();
	}

}
