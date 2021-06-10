package assignment_1;



public class ascii_Pattern {
	static void top_Bottom_Line(int size) {
		System.out.print("+");
		for(int i = 0;i<(size)*2;i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	static void top_half(int size) {
		for(int row=0;row<size-1;row++) {
			System.out.print("|");
			for(int i=0;i<size-row-1;i++) {
				System.out.print(" ");
			}
			System.out.print("/");
			for(int i=0;i<(2*row);i++){
				if(row%2!=0)
					System.out.print("-");
					else 
						System.out.print("=");
			}
			System.out.print("\\");
			for(int i=0;i<size-row-1;i++) {
				System.out.print(" ");
			}
			System.out.print("|\n");
		}
		
	}
	static void middle_line(int size) {
		System.out.print("|");
		System.out.print("<");
		if(size%2==0) {
			for(int i = 0;i<(2*size - 2);i++) {
				System.out.print("-");
			}}
			else {
				for(int i = 0;i<(2*size - 2);i++)
				System.out.print("=");
			}
			
		System.out.print(">");
		System.out.println("|");
	}
	static void bottom_half(int size) {
		 for(int row=size-2; row>=0; row--) {
	            System.out.print("|");
	            for(int i=0; i<size-row-1;i++) {
	                System.out.print(" ");
	            }
	            System.out.print("\\");

	            for(int i=0; i<2*row;i++) {
	                if(row%2==0)
	                    System.out.print("=");
	                else
	                    System.out.print("-");
	            }

	            System.out.print("/");

	            for(int i=0; i<size-row-1;i++) {
	                System.out.print(" ");
	            }
	            System.out.println("|");
	            }
	}
	
	static void artistic_pattern(int size) {
		top_Bottom_Line(size);
		top_half(size);
		middle_line(size);
		bottom_half(size);
		top_Bottom_Line(size);
	}
	public static void main(String[] args) {
		
	
		artistic_pattern(7);

	}

}
