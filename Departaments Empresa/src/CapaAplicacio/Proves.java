package CapaAplicacio;

import CapaDomini.*;

public class Proves {
	static Empresa e;
    public static void main(String[] args) {
        // definim l'organigrama de l'empresa
    	setEmpresa();
    	
    	// mostrem tota l'empresa
        System.out.println(e.toString());
        // Implementar: incloure una linea amb el cost total de l'empresa
        
        // mostrem un determinat departament
        IEstructuraEmpresa dep1 = e.cercarInfo("Comptabilitat");
        if (dep1 != null) {
            System.out.println(dep1.toString());
            // Implementar: incloure una linea amb el cost total del departament
        }
    }
    private static void setEmpresa(){
    	e = new Empresa("Empresa XX");
    	
        IEstructuraEmpresa dep1 = e.cercarInfo(e.getNomEmpresa());
        IEstructuraEmpresa emp = new Empleat("Vall.llobera", 100.0, dep1);
        e.setEstructuraEmpresa(dep1, emp);
        
        IEstructuraEmpresa dep2 = new Departament("Direcció General");
        e.setEstructuraEmpresa(dep1, dep2);
        
        emp = new Empleat("Rollo", 80.0, dep2);
        e.setEstructuraEmpresa(dep2, emp);
        
        dep2 = new Departament("Comptabilitat");
        e.setEstructuraEmpresa(dep1, dep2);
        e.setEstructuraEmpresa(dep2, emp);
        
        emp = new Empleat("Saura", 70.0, dep2);
        e.setEstructuraEmpresa(dep2, emp);
        
        dep1 = new Departament("RRHH");
        e.setEstructuraEmpresa(dep2, dep1);
        
        emp = new Empleat("Fernandes", 30.0, dep1);
        e.setEstructuraEmpresa(dep1, emp);
        
        dep1 = new Departament("Vendes");
        e.setEstructuraEmpresa(dep2, dep1);
        
        Empleat emp1 = new Empleat("Mallol", 70.0, dep1);
        e.setEstructuraEmpresa(emp1, emp);
    }
}
