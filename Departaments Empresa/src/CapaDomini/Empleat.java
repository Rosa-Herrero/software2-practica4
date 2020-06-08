package CapaDomini;

public class Empleat implements IEstructuraEmpresa {

    private double salari;
    private Departament departament;
    private String filiacio;

    public Empleat(String filiacio, double salari, IEstructuraEmpresa dep) {
        this.filiacio = filiacio;
        this.salari = salari;
        departament = (Departament) dep;
    }

    public String getNom() {
        return filiacio;
    }

    public void add(IEstructuraEmpresa iee) {
    }

    public String toString(int t) {
        return this.toString() + ".\n";
    }

    @Override
    public String toString() {
        return "Empleat: " + filiacio + ", salari " + salari;
    }

    public IEstructuraEmpresa cercarInfo(String descripcio) {
        if (descripcio.equals(filiacio)) {
            return this;
        } else {
            return null;
        }
    }
}
