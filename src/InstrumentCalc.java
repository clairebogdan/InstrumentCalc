import java.util.Scanner;
public class InstrumentCalc {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	double rflute = 0.1;
	double roboe = 0.03;
	double rbassoon = 0.03;
	double rclarinet = 0.24;
	double rbassclar = 0.03;
	double ralto = 0.06;
	double rtenor = 0.02;
	double rbari = 0.01;
	double rtrumpet = 0.16;
	double rhorn = 0.06;
	double rtrombone = 0.09;
	double reuph = 0.04;
	double rtuba = 0.04;
	double rperc = 0.09;
				
		System.out.println("Welcome to the Beginning Band Instrument Calculator! Enter your # of beginners");
		double beginners = scan.nextDouble();
		System.out.println("You have 2 options. Please enter 1 or 2");
		System.out.println("1 See recommendations");
		System.out.println("2 Use own percentages");
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println((beginners * rflute) + " Flutes"); 
			System.out.println((beginners * roboe) + " Oboes");
			System.out.println((beginners * rbassoon) + " Bassoons"); 
			System.out.println((beginners * rclarinet) + " Clarinets"); 
			System.out.println((beginners * rbassclar) + " Bass Clarinets"); 
			System.out.println((beginners * ralto) + " Alto Saxes"); 
			System.out.println((beginners * rtenor) + " Tenor Saxes"); 
			System.out.println((beginners * rbari) + " Bari Saxes"); 
			System.out.println((beginners * rtrumpet) + " Trumpets"); 
			System.out.println((beginners * rhorn) + " French Horns");
			System.out.println((beginners * rtrombone) + " Trombones"); 
			System.out.println((beginners * reuph) + " Euphoniums"); 
			System.out.println((beginners * rtuba) + " Tubas"); 
			System.out.println((beginners * rperc) + " Percussion"); break;
			
		case 2:
			System.out.println("Please enter your percentage of Flute players. Use 0.number");
			double flute = scan.nextDouble();
			System.out.println("You have " + (1 - flute) + " left.");
			System.out.println("Please enter your percentage of Oboe players. Use 0.number");
			double oboe = scan.nextDouble();
			System.out.println("You have " + (1 - (oboe + flute)) + " left.");
			System.out.println("Please enter your percentage of Bassoon players. Use 0.number");
			double bassoon = scan.nextDouble();
			System.out.println("You have " + (1 - (bassoon + oboe + flute)) + " left.");
			System.out.println("Please enter your percentage of Clarinet players. Use 0.number");
			double clarinet = scan.nextDouble();
			System.out.println("You have " + (1 - (clarinet + bassoon + oboe + flute)) + " left.");
			System.out.println("Please enter your percentage of Bass Clarinet players. Use 0.number");
			double bassclar = scan.nextDouble();
			System.out.println("You have " + (1 - (bassclar + clarinet + bassoon + oboe + flute)) + " left.");
			System.out.println("Please enter your percentage of Alto Sax players. Use 0.number");
			double alto = scan.nextDouble();
			System.out.println("You have " + (1 - (alto + bassclar + clarinet + bassoon + oboe + flute)) + " left.");
			System.out.println("Please enter your percentage of Tenor Sax players. Use 0.number");
			double tenor = scan.nextDouble();
			System.out.println("You have " + (1 - (tenor + alto + bassclar + clarinet + bassoon + oboe + flute)) + " left.");
			System.out.println("Please enter your percentage of Bari Sax players. Use 0.number");
			double bari = scan.nextDouble();
			System.out.println("You have " + (1 - (bari + tenor + alto + bassclar + clarinet + bassoon + oboe + flute)) + " left.");
			System.out.println("Please enter your percentage of Trumpet players. Use 0.number");
			double trumpet = scan.nextDouble();
			System.out.println("You have " + (1 - (trumpet + bari + tenor + alto + bassclar + clarinet + bassoon + oboe + flute)) + " left.");
			System.out.println("Please enter your percentage of French Horn players. Use 0.number");
			double horn = scan.nextDouble();
			System.out.println("You have " + (1 - (horn + trumpet + bari + tenor + alto + bassclar + clarinet + bassoon + oboe + flute)) + " left.");
			System.out.println("Please enter your percentage of Trombone players. Use 0.number");
			double trombone = scan.nextDouble();
			System.out.println("You have " + (1 - (trombone + horn + trumpet + bari + tenor + alto + bassclar + clarinet + bassoon + oboe + flute)) + " left.");
			System.out.println("Please enter your percentage of Euphonium players. Use 0.number");
			double euph = scan.nextDouble();
			System.out.println("You have " + (1 - (euph + trombone + horn + trumpet + bari + tenor + alto + bassclar + clarinet + bassoon + oboe + flute)) + " left.");
			System.out.println("Please enter your percentage of Tuba players. Use 0.number");
			double tuba = scan.nextDouble();
			System.out.println("You have " + (1 - (tuba + euph + trombone + horn + trumpet + bari + tenor + alto + bassclar + clarinet + bassoon + oboe + flute)) + " left.");
			System.out.println("Please enter your percentage of Percussion players. Use 0.number");
			double perc = scan.nextDouble();
			
		if((flute + oboe + bassoon + clarinet + bassclar + alto + tenor + bari + trumpet + horn + trombone + euph + tuba + perc) == 1) {
				System.out.println((beginners * flute) + " Flute");
				System.out.println((beginners * oboe) + " Oboe");
				System.out.println((beginners * bassoon) + " Bassoon");
				System.out.println((beginners * clarinet) + " Clarinet");
				System.out.println((beginners * bassclar) + " Bass Clarinet");
				System.out.println((beginners * alto) + " Alto Sax");
				System.out.println((beginners * tenor) + " Tenor Sax");
				System.out.println((beginners * bari) + " Bari Sax");
				System.out.println((beginners * trumpet) + " Trumpet");
				System.out.println((beginners * horn) + " French Horn");
				System.out.println((beginners * trombone) + " Trombone");
				System.out.println((beginners * euph) + " Euphonium");
				System.out.println((beginners * tuba) + " Tuba");
				System.out.println((beginners * perc) + " Percussion");
			}
		else {
			System.out.println("Something went wrong, please check your percentages again");
		}
		}
		
		}
	
}