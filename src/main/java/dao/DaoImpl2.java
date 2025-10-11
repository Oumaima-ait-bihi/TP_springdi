package dao;


import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Profile;

@Component("dao2")  // Déclare cette classe comme un bean Spring avec l'identifiant "dao2"
@Profile("dev")  // Ce bean sera actif uniquement avec le profil "dev"
public class DaoImpl2 implements IDao {

	 @Override
	 public double getValue() {
		 
		 System.out.println("Version de développement");
	        // Cette implémentation alternative retourne 150.0
	        return 150.0;
	    }
}
