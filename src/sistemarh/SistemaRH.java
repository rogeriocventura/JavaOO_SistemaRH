/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh;

import sistemarh.models.Funcionario;
import sistemarh.models.Gestor;
import sistemarh.pseudoBanco.pseudoBanco;

/**
 *
 * @author Lívia Zeferino
 */
public class SistemaRH {
static MenuPrincipal menu = new MenuPrincipal();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
            Funcionario f = new Funcionario();
            Funcionario f1 = new Funcionario();
            Funcionario f2 = new Funcionario();
            Funcionario f3 = new Funcionario();
            pseudoBanco.inicializaBanco();
            f.setCodigoID(1);
            f.setDepartamento("Vendas");
            f.setNome("Fulano");
            f.setSalario(3000.00);
            f.setTurno("Noturno");
            f.setSenha("senha");
            f.setUsuario("1");
            pseudoBanco.getTabelaFuncionarios().add(f);
            f1.setCodigoID(2);
            f1.setDepartamento("Risco");
            f1.setNome("Beltrano");
            f1.setSalario(2000.00);
            f1.setTurno("Matutino");
            f1.setSenha("senha");
            f1.setUsuario("2");
            pseudoBanco.getTabelaFuncionarios().add(f1);
            f2.setCodigoID(3);
            f2.setDepartamento("Marketing");
            f2.setNome("Siclano");
            f2.setSalario(20000.00);
            f2.setTurno("De vez em quando");
            f2.setSenha("senha");
            f2.setUsuario("3");
            pseudoBanco.getTabelaFuncionarios().add(f2);
            f3.setCodigoID(4);
            f3.setDepartamento("Cobrança");
            f3.setNome("Natano");
            f3.setSalario(90000.00);
            f3.setTurno("Tarde");
            f3.setSenha("senha");
            f3.setUsuario("4");
            pseudoBanco.getTabelaFuncionarios().add(f3);
            Gestor g = new Gestor();
            g.setCodigoID(1);
            g.setDepartamento("RH");
            g.setNome("ROOT RH");
            g.setSalario(10.00);
            g.setTurno("DIURNO");
            g.setSenha("senha");
            g.setUsuario("rootrh");
            g.setPermissaoRH(true);
            pseudoBanco.getTabelaGestores().add(g);
            menu.setVisible(true);
            
    }
    public static void voltarMenuPrincipal()
    {
        menu.setVisible(true);
    }
}
