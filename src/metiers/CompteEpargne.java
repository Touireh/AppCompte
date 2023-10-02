package metiers;

import java.util.Date;

public class CompteEpargne extends Compte{
    @Override
    public void retirer(double mnt) {
        if(mnt>solde) throw new RuntimeException("Solde insuffisant");
        Retrait r = new Retrait(operations.size()+1,new Date(), mnt);
        operations.add(r);
        solde=solde-mnt;

    }

    @Override
    public void updateSolde() {

    }

}
