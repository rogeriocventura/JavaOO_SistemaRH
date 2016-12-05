/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh.pseudoBanco;

import java.util.ArrayList;
import sistemarh.models.Funcionario;
import sistemarh.models.Gestor;

/**
 *
 * @author Lívia Zeferino
 */
public class pseudoBanco {
    private static ArrayList<Funcionario> funcionarios;
    private static ArrayList<Gestor> gestores;
    
    public static ArrayList<Funcionario> getTabelaFuncionarios()
    {
        return funcionarios;
    }
    public static ArrayList<Gestor> getTabelaGestores()
    {
        return gestores;
    }
    
    public static void inicializaBanco()
    {
        funcionarios = new ArrayList<Funcionario>();
        gestores = new ArrayList<Gestor>();
    }
}
