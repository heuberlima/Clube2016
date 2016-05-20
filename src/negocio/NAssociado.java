/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.EAssociado;
import java.sql.SQLException;
import java.util.List;
import persistencia.PAssociado;

/**
 *
 * @author HeuberLima
 */
public class NAssociado {

    PAssociado passociado;

    public NAssociado() {
        passociado = new PAssociado();
    }

    public void salvar(EAssociado associado) throws Exception {

        if (associado.getCodigo() == 0) {
            passociado.incluir(associado);
        } else {
            passociado.alterar(associado);
        }
    }

    public void excluir(int codigo) throws SQLException, Exception {
        passociado.excluir(codigo);
    }

    public EAssociado consultar(int codigo) throws SQLException {
        return passociado.consultar(codigo);
    }

    public List<EAssociado> listar() throws SQLException, Exception {
        return passociado.listar();
    }

    public List<EAssociado> listar(String nome) throws SQLException, Exception {
        return passociado.listarPorNome(nome);
    }
    
    public List<EAssociado> listar(EAssociado associado) throws SQLException, Exception {
        return passociado.listarPorFiltros(associado);
    }
}
