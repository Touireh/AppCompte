package metiers;

import java.util.Date;

public class CompteCourant extends  Compte{
    private double decouvert;

    @Override
    public void retirer(double mnt) {
        if(mnt<solde+decouvert) throw new RuntimeException("Solde insuffisant");
        Retrait r = new Retrait(operations.size()+1 , new Date(),mnt);
        operations.add(r);
        solde=solde-mnt;
    }
    @Override
    public void updateSolde() {

    }
    public CompteCourant()
    {

    }
    public CompteCourant(int code , double solde, double decouvert){
        super(code, solde);
        this.decouvert=decouvert;
    }
}
