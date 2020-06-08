package CapaDomini;

import java.util.List;
import java.util.ArrayList;

public class Departament implements IEstructuraEmpresa {

    private List<IEstructuraEmpresa> jerarquiaDepartamental;
    private String nomDepartament;

    public Departament(String nomDep) {
        jerarquiaDepartamental = new ArrayList<IEstructuraEmpresa>();
        nomDepartament = nomDep;
    }

    public String getNom() {
        return nomDepartament;
    }

    public void add(IEstructuraEmpresa ee) {
        jerarquiaDepartamental.add(ee);
    }

    public String toString(int tabs) {
        String retorn = "Departament: " + nomDepartament + "\n";
        tabs++;
        for (IEstructuraEmpresa iee : jerarquiaDepartamental) {
            for (int i = 0; i < tabs; i++) {
                retorn += "\t";
            }
            retorn += iee.toString(tabs);
        }
        return retorn;
    }

    @Override
    public String toString() {
        return this.toString(0);
    }

    public IEstructuraEmpresa cercarInfo(String descripcio) {
        if (descripcio.equals(nomDepartament)) {
            return this;
        } else {
            for (IEstructuraEmpresa iee : jerarquiaDepartamental) {
                IEstructuraEmpresa resultat = iee.cercarInfo(descripcio);
                if (resultat != null) {
                    return resultat;
                }
            }//final for
            return null;
        }//final else
    }
}
