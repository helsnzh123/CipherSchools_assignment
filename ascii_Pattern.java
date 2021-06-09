package assignment_1;

class ASCII{
	public final static int size = 1;
	public void upper_line(){
		System.out.print("+");
		for(int i = 1;i<=size * 2;i++) {
			System.out.print("-");
		}
		System.out.print("+ \n");
	}
	public void top_half() {
		if(size==1) {
			System.out.print("|<>|\n");
			System.out.print("+");
			for(int i = 1;i<=size * 2;i++) {
				System.out.print("-");
			}
			System.out.print("+");
			}
			else {
				int i = 1;
				for(i = 1;i<=size;i++) {
					System.out.println("|");
				}
			}
		}
	}


public class ascii_Pattern {
	public static void main(String[] args) {
		ASCII p1 = new ASCII();
		p1.upper_line();
		p1.top_half();
		

	}

}
