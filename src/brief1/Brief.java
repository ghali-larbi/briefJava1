package brief1;
import java.util.Scanner;
public class Brief {

	public static void main(String[] args) {
		System.out.println("bienvenu ");
		Scanner scanner=new Scanner(System.in);
		System.out.println("entrer votre nom ");
		String nom=scanner.next();
		System.out.println("entrer votre prenom ");
		String prenom=scanner.next();
		System.out.println("bienvenue "+nom+" "+prenom);
		System.out.println("entrer le nombre d’heures travaillées");
		int heure=scanner.nextInt();
		if(heure<=60) {
			System.out.println("entrer le tarif");
			double tarif=scanner.nextInt();
			if(heure>=40) {
				double tarifExtra=tarif+tarif*0.5;
				System.out.println(" votre indemnisation est : "+tarifExtra+"MAD");
			}
		}
		else if(heure>70){
			System.out.println(" informations erronés!!");
		}
		

				

	}

}
