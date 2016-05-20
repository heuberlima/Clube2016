/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import entidade.EAssociado;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.PAssociado;

/**
 *
 * @author HeuberLima
 */
public class testaAssociado {

    public static void main(String[] args) throws Exception {

        //Cria as instâncias da entidade e da persistência
        EAssociado tipoAssociado = new EAssociado();
        PAssociado pTipo = new PAssociado();

        //Cria a instância para a leitura do teclado
        Scanner teclado = new Scanner(System.in);

        try {
            EAssociado local = new EAssociado();
            //local.setCodigo(2);
            local.setEndereco("teste");
            //local.setTelefone("6");
            
            List<EAssociado> resultado = pTipo.listarPorFiltros(local);
            if (resultado != null) {
                for (EAssociado objeto : resultado) {
                    System.out.println("Codigo..............: "
                            + objeto.getCodigo());
                    System.out.println("Nome...........: "
                            + objeto.getNome());
                    System.out.println("");
                }
                System.out.println("Listagem efetuada com sucesso!");
            } else {
                System.out.println("Não existem informações na base de dados!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(testaAssociado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
