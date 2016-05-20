/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import entidade.ETipoAssociado;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.parser.Lexer;
import persistencia.PTipoAssociado;

/**
 *
 * @author HeuberLima
 */
public class testaTipoAssociado {

    public static void main(String[] args) {

        //Cria as instâncias da entidade e da persistência
        ETipoAssociado tipoAssociado = new ETipoAssociado();
        PTipoAssociado pTipo = new PTipoAssociado();

        //Cria a instância para a leitura do teclado
        Scanner teclado = new Scanner(System.in);

//        //Lê a descricao a ser informada pelo usuário
//        System.out.print("Digite a descricao: ");
//        tipoAssociado.setDescricao(teclado.nextLine());
//        
//        //Lê o valor da mensalidade a ser digitada pelo usuário
//        System.out.print("Digite o valor: ");
//        tipoAssociado.setValorMensalidade(teclado.nextDouble());
//        
//
//        try {
//            pTipo.incluir(tipoAssociado);
//        } catch (SQLException ex) {
//            Logger.getLogger(testaTipoAssociado.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        
//        System.out.println("Inclusão efetuada com sucesso!");
//        
//          //Lê a descricao a ser informada pelo usuário
//        System.out.print("Digite o código do tipo a ser alterado: ");
//        tipoAssociado.setCodigo(teclado.nextInt());
//        
//         //Lê a descricao a ser informada pelo usuário
//        System.out.print("Digite a descricao: ");
//        tipoAssociado.setDescricao(teclado.next());
//        
//        //Lê o valor da mensalidade a ser digitada pelo usuário
//        System.out.print("Digite o valor: ");
//        tipoAssociado.setValorMensalidade(teclado.nextDouble());
//        
//
//        try {
//            pTipo.alterar(tipoAssociado);
//        } catch (SQLException ex) {
//            Logger.getLogger(testaTipoAssociado.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//         System.out.println("Alteração efetuada com sucesso!");
//         
//         
//        //Lê a descricao a ser informada pelo usuário
//        System.out.print("Digite o código do tipo a ser excluído: ");
//        int codigo = teclado.nextInt();
//       
//
//        try {
//            pTipo.excluir(codigo);
//        } catch (SQLException ex) {
//            Logger.getLogger(testaTipoAssociado.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//         System.out.println("Exclusão efetuada com sucesso!"); 
//         
//         
//         
//        //Lê o codigo para a consulta
//        System.out.print("Digite o código do tipo a ser consultado: ");
//        int codigo = teclado.nextInt();
//        try {
//            ETipoAssociado resultado = pTipo.consultar(codigo);
//            if (resultado != null) {
//                System.out.println("Codigo..............: " 
//                        + resultado.getCodigo());
//                System.out.println("Descricao...........: " 
//                        + resultado.getDescricao());
//                System.out.println("Valor Mensalidade...: " 
//                        + resultado.getValorMensalidade());
//                System.out.println("Consulta efetuada com sucesso!");
//            } else {
//                System.out.println("Não existem informações "
//                        + "para o código informado!");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(testaTipoAssociado.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            List<ETipoAssociado> resultado = pTipo.listar();
            if (resultado != null) {
                for (ETipoAssociado objeto : resultado) {
                    System.out.println("Codigo..............: "
                            + objeto.getCodigo());
                    System.out.println("Descricao...........: "
                            + objeto.getDescricao());
                    System.out.println("Valor Mensalidade...: "
                            + objeto.getValorMensalidade());
                    System.out.println("");
                }
                System.out.println("Listagem efetuada com sucesso!");
            } else {
                System.out.println("Não existem informações na base de dados!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(testaTipoAssociado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
