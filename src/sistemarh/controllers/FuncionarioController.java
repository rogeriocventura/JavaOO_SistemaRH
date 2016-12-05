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
public class FuncionarioController {
    public static void alterarSenha(int codigoID, String senha)
    {
        for(Funcionario f : pseudoBanco.getTabelaFuncionarios())
        {
            if(f.getCodigoID() == codigoID)
            {
                f.setSenha(senha);
            }
        }
    }
    public static void alterarTurno(int codigoID, String turno)
    {
        for(Funcionario f : pseudoBanco.getTabelaFuncionarios())
        {
            if(f.getCodigoID() == codigoID)
            {
                f.setTurno(turno);
            }
        }
    }
}
