package CapaDomini;

public interface IEstructuraEmpresa {

    public void add(IEstructuraEmpresa iee);

    public String toString(int tabuladors);

    public IEstructuraEmpresa cercarInfo(String descripcio);

    public String getNom();
}
