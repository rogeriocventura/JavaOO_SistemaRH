/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh.models;

import java.util.ArrayList;

/**
 *
 * @author Lívia Zeferino
 */
public class Gestor extends Funcionario{
    private boolean permissaoRH;
    private ArrayList<Funcionario> subordinados;

    /**
     * @return the permissaoRH
     */
    public boolean isPermissaoRH() {
        return permissaoRH;
    }

    /**
     * @param permissaoRH the permissaoRH to set
     */
    public void setPermissaoRH(boolean permissaoRH) {
        this.permissaoRH = permissaoRH;
    }

    /**
     * @return the subordinados
     */
    public ArrayList<Funcionario> getSubordinados() {
        return subordinados;
    }

    /**
     * @param subordinados the subordinados to set
     */
    public void setSubordinados(ArrayList<Funcionario> subordinados) {
        this.subordinados = subordinados;
    }
}
