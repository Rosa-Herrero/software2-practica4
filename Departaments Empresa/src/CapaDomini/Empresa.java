package CapaDomini;

public class Empresa {

    private IEstructuraEmpresa estructuraEmpresa;
    private String nomEmpresa;

    public Empresa(String n) {
        nomEmpresa = n;
        estructuraEmpresa = new Departament(nomEmpresa);
    }

    public boolean setEstructuraEmpresa(IEstructuraEmpresa pare, IEstructuraEmpresa fill) {
        boolean retorn = false;
        if (pare == null || fill == null) {
            return false;
        }
        if (retorn = pare != fill) {
            pare.add(fill);
        }
        return retorn;
    }

    public IEstructuraEmpresa cercarInfo(String descripcio) {
        return estructuraEmpresa.cercarInfo(descripcio);
    }

    @Override
    public String toString() {
        return estructuraEmpresa.toString(0);
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }
}
