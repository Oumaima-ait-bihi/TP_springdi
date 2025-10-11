package dao;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Profile;

@Component("dao")  // Déclare cette classe comme un bean Spring avec l'identifiant "dao"
@Profile("prod")  // Ce bean sera actif uniquement avec le profil "prod"
public class DaoImpl  implements IDao {

	@Override
    public double getValue() {
		
        System.out.println("Version de production");
        // Cette implémentation retourne une valeur fixe de 100.0
        return 100.0;
    }
}
