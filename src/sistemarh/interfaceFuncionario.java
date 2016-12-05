/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh;

/**
 *
 * @author 1617604
 */
public interface interfaceFuncionario {
    public int getCodigoID();

    /**
     * @param codigoID the codigoID to set
     */
    public void setCodigoID(int codigoID);
    
    public String alteraTurno(int codigoID);
    /**
     * @return the usuario
     */
    public String getUsuario();

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario);

    /**
     * @return the nome
     */
    public String getNome();

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome);

    /**
     * @return the turno
     */
    public String getTurno();

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno);

    /**
     * @return the salario
     */
    public double getSalario();

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario);

    /**
     * @return the departamento
     */
    public String getDepartamento();

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento);

    /**
     * @return the senha
     */
    public String getSenha();

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha);
    
    
}
