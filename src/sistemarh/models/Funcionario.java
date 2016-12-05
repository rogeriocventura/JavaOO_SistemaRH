/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh.models;

import javax.swing.JOptionPane;
import sistemarh.interfaceFuncionario;
import sistemarh.pseudoBanco.pseudoBanco;

/**
 *
 * @author Lívia Zeferino
 */
public class Funcionario implements interfaceFuncionario{
    private int codigoID;
    private String usuario;
    private String nome;
    private String turno;
    private double salario;
    private String departamento;
    private String senha;

    /**
     * @return the codigoID
     */
    public int getCodigoID() {
        return codigoID;
    }

    /**
     * @param codigoID the codigoID to set
     */
    public void setCodigoID(int codigoID) {
        this.codigoID = codigoID;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String alteraTurno(int codigoID)
    {
        String novoTurno = "";
        for(Funcionario f : pseudoBanco.getTabelaFuncionarios())
        {
            if(f.getCodigoID() == codigoID)
            {
                novoTurno = JOptionPane.showInputDialog(f.getTurno()+"\n Favor digitar novo turno:");
                if(novoTurno.isEmpty())
                {
                    alteraTurno(codigoID);
                }
            }
            
        }
        System.out.println(novoTurno);
        return novoTurno;
    }
    public String alteraSenha(int codigoID)
    {
        String novoSenha = "";
        for(Funcionario f : pseudoBanco.getTabelaFuncionarios())
        {
            if(f.getCodigoID() == codigoID)
            {
                novoSenha = JOptionPane.showInputDialog("\n Favor digitar nova senha:");
                if(novoSenha.isEmpty())
                {
                    alteraSenha(codigoID);
                }
            }
            
        }
        System.out.println(novoSenha);
        return novoSenha;
    }
}
