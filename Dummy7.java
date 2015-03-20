import java.util.Scanner;
import java.io.*;

public class Dummy7{
	public static void main(String args[]){


		//ordrestyrt
		Scanner in = new Scanner(System.in);
		String info ="Oblig 7, INF1010\n\t--- Leger og Resepter ---\n\t1: Les in data fra fil\n\t2: Skriv data til fil\n\t3: Print all data til skjerm\n\t4: Opprett et nytt legemiddel\n\t5: Opprett en ny lege\n\t6: Oprett en ny person\n\t7: Opprett en ny resept\n\t8: Hent legemiddelet for en resept\n\t9: Velg en statistik til aa skirve ut\n\t0: Exit\n\tVelg 0-9: ";


		int a = 99;
		Ordre o = new Ordre();
		
		while(a != 0){
			System.out.print(info); 
			a = in.nextInt();
			switch(a){
				case 1: System.out.println("lese alle data"); o.lesFil(); break;
				case 2: System.out.println("Skirve alle data tilbake til filen");o.printData();
				case 3: System.out.println("Skirve ut alle personer, leger(sortert), legemidler og resepter"); break;
				case 4: System.out.println("lage et nyt legemiddel");break;
				case 5: System.out.println("ny lege"); break;
				case 6: System.out.println("ny person"); break;
				case 7: System.out.println("ny resept"); break;
				case 8: System.out.println("hente legemiddelet for en resept"); break;
				case 9: System.out.println("valg av statistiker"); break;
			}
		}
	}
}
class Ordre{
	public void lesFil(){
		try{
			Scanner fileIn = new Scanner(new File("data.txt"));
			
			while(fileIn.hasNext()){
				String s = fileIn.nextLine();
				if(s.startsWith("# Personer")){
					System.out.println("\t---Alle Personer---");
					s = fileIn.nextLine();
					while(!s.startsWith("#")){
						String[] ord = s.split(",");

					/*	int unik = Integer.parseInt(ord[0]);
						String navn = ord[1];
						int fnr = Integer.parseInt(ord[2]);
						String adr = ord[3];
						int post = Integer.parseInt(ord[4]);


						//maa fjerne forste blanke tegn i ordene
						//avhengig av hvordan vi skal lagre personer
						//Person p = new Person(unik,navn,fnr,adr,post);
*/
						for(String d:ord){System.out.println(d);}

					
						System.out.println(s);
						s = fileIn.nextLine();
					}
				}
				if(s.startsWith("# Legemidler")){
					System.out.println("\t---Alle Legemidler---");
					s = fileIn.nextLine();
					while(!s.startsWith("#")){
						System.out.println(s);
						s = fileIn.nextLine();
					}
				}
				if(s.startsWith("# Leger")){
					System.out.println("\t---Alle Leger---");
					s = fileIn.nextLine();
					while(!s.startsWith("#")){
						System.out.println(s);
						s = fileIn.nextLine();
					}
				}
				if(s.startsWith("# Resepter")){
					System.out.println("\t---Alle Resepter---");
					s = fileIn.nextLine();
					while(!s.startsWith("#")){
						System.out.println(s);
						s = fileIn.nextLine();
					}
				}
	
			}

		}catch(IOException e){System.out.println("No File");}
	}

	public void printData(){
		System.out.println("...\nalle data\n...");
	}





	public void printStat(){
		


	}
}
