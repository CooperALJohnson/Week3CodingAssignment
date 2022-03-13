import java.util.Scanner;

public class Wk3CodingAssignmant {

	public static void main(String[] args) {
		//Question 1
		int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 6};
		
		int sub =  ages[0] - ages[ages.length - 1];
			System.out.println(sub);
		
			int avgLength = avgAgeLength(ages);
			System.out.println("The average age is " + avgLength);
			
			//Question 2a
			int nameTotal = 0;
			String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			
					for(String name: names) {
						nameTotal += name.length();
					}
					System.out.println(nameTotal / names.length);
				
			//Question 2b
			for(String name: names) {
				System.out.print(name + " ");
			}
			System.out.println(" ");
			//Question 5
			int[] nameLengths = new int[names.length];
				for(int i = 0; i < names.length; i++) {
					nameLengths[i] = names[i].length();
					System.out.println("Name length of this name is: " + nameLengths[i]);
				}

			//Question 6
			int sum = 0;
			for(int i = 0; i < names.length; i++) {
				sum += names[i].length();
			}System.out.println("The total sum is: " + sum); 
			
			
			
			//question 8 variables
			String firstName = "Cooper";
			String lastName = "Johnson";
			
			//qustion 10 dec
			double[] Avg = new double[5];
			
			//question 11 dec
			double[] one = new double[5];
			double[] two = new double[6];
			Scanner in = new Scanner(System.in);
			String ans = in.nextLine();
			int n = in.nextInt();
			System.out.println(conc(ans,n));
			
			//question 12 dec
			boolean isHotOutside = true;
			double moneyInPocket = 11.00;
			
			//question 13 dec
			Scanner in1 = new Scanner(System.in);
			int number;
			number = in1.nextInt();
			System.out.println(divisible(number));
		//end of MAIN	
	}		
		//Question 7
		static String ans = "";
		
		static String conc(String word, int n) {
			
			
			for(int i = 0;i < n; i++) {
				ans += word;
			}	
				return ans;
				
		}	
		
		//Question 8
		static String fullName(String firstName, String lastName) {
			String fullName = firstName + " " + lastName;
			return fullName;
		} 
		
		//Question 9
		static boolean greater(int[] nums) {
			int total = 0;
			for(int num: nums) {
				total += num;
			}
			return (total > 100);
		}
	
		//Question 10
			static double avgDub(double[] avg) {
			double qTen= 0;
				for(int i = 0; i < avg.length; i++) {
					qTen += avg.length;
				}
				return qTen / avg.length;
			}
			
			//Question 11
			static boolean qEleven(double[] one, double[] two) {
			double qEleven1 = 0;
			double qEleven2 = 0;
				for(int i = 0; i < one.length; i++) {
					qEleven1 += one.length;
				} 
						for(int i = 0; i < two.length; i++) {
							qEleven2 += two.length;
						} 
				return qEleven1 > qEleven2;
			}
			
		//Question 12
		static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			return isHotOutside = true && moneyInPocket > 10.50;
		}
		
		//Question 13
		 //My code takes an int and tells you if it is divisible by 4 or 5 
		static boolean divisible(int number) {
			boolean divisible;
				if(number % 4 <= 0 && number % 5 <= 0) {
					System.out.println("Divisable by 4 and 5");
					System.exit(number);
					divisible = true;
				} else if(number % 5 <= 0) {
					System.out.println("Divisable by 5");
					divisible = true;
				} else if(number % 4 <= 0) {
					System.out.println("Divisable by 4");
					divisible = true;
				} else if(number % 3 > 0 && number % 5 > 0) {
					System.out.println("Not divisable by  or 5");
					divisible = false;
				} else {
					divisible = false;
				}
				return divisible;
			}
	//Average age finder Q1
		static int avgAgeLength(int[] ages) {
		int total= 0;
				for(int i = 0; i < ages.length; i++) {
					total += ages[i];
				}
				return total / ages.length;
				
		
		}
}