/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh.controllers;

import sistemarh.models.Funcionario;
import sistemarh.pseudoBanco.pseudoBanco;

/**
 *
 * @author Lívia Zeferino
 */
public class GestorController {
    public static void adicionarFuncionario(int codigoID, String nome, String turno, double salario, String departamento, String usuario, String senha)
    {
        Funcionario f = new Funcionario();
        f.setCodigoID(codigoID);
        f.setDepartamento(departamento);
        f.setNome(nome);
        f.setSalario(salario);
        f.setTurno(turno);
        f.setSenha(senha);
        f.setUsuario(usuario);
        
        pseudoBanco.getTabelaFuncionarios().add(f);
        System.out.println("ADICIONOU "+ f.getCodigoID());
    }
    public static void alterarDados(int codigoID, String nome, String turno, double salario, String departamento, String usuario, String senha)
    {
        
        
        for(Funcionario f1 : pseudoBanco.getTabelaFuncionarios())
        {
            if(f1.getCodigoID() == codigoID)
            {
               f1.setCodigoID(codigoID);
               f1.setDepartamento(departamento);
               f1.setNome(nome);
               f1.setSalario(salario);
               f1.setTurno(turno);
               f1.setUsuario(usuario);
               f1.setSenha(senha);
               System.out.println("ALTEROU " + f1.getCodigoID());
            }
        }
    }
}
