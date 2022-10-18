package be.ND.Exo2;
import java.util.Random;
import javax.swing.JOptionPane;
import java.time.OffsetTime;
import java.time.Duration;
public class Exo2 {

	public static void main(String[] args) {
		Random r = new Random();
		
		OffsetTime debut = OffsetTime.now();
		int nbrTry = 0 , nbUser = 0;
		int nbRandom = r.nextInt(1000)+1;
		boolean flag = false;
		System.out.println(nbRandom);//pour tester pas oblige de le mettre mais mieux.
		
		do {
			do {
				String userNb = JOptionPane.showInputDialog(null,"Votre nombre dois etre compris entre 0 et 1000");
				nbUser = Integer.valueOf(userNb);
			}while(nbUser<0 || nbUser>1000);
			if(nbRandom<nbUser) {
				JOptionPane.showMessageDialog(null, "C'est moins !");
				nbrTry++;
			}if(nbRandom>nbUser) {
				JOptionPane.showMessageDialog(null, "C'est plus !!");
				nbrTry++;
			}if(nbRandom==nbUser) {
				JOptionPane.showMessageDialog(null,"c'est gagne");
				nbrTry++;
				flag=true;
				OffsetTime fin = OffsetTime.now();
				Duration duree = Duration.between(debut,fin);
				JOptionPane.showMessageDialog(null, "Nombre d'essaie : "+ nbrTry);
				JOptionPane.showMessageDialog(null, "En "+duree.getSeconds()+ " secondes");
			}
		}while(flag == false);
		
		
	}

}
