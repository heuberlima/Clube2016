/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidade.ETipoAssociado;
import java.sql.SQLException;
import java.util.List;
import persistencia.PTipoAssociado;

/**
 *
 * @author HeuberLima
 */
public class NTipoAssociado {

    PTipoAssociado ptipoassociado;

    public NTipoAssociado() {
        ptipoassociado = new PTipoAssociado();
    }

    public void salvar(ETipoAssociado tipoasssociado) throws SQLException {

        if (tipoasssociado.getCodigo() == 0) {
            ptipoassociado.incluir(tipoasssociado);
        } else {
            ptipoassociado.alterar(tipoasssociado);
        }
    }

    public void excluir(int codigo) throws SQLException {
        ptipoassociado.excluir(codigo);
    }

    public ETipoAssociado consultar(int codigo) throws SQLException{
        return ptipoassociado.consultar(codigo);
    }
    
    public List<ETipoAssociado> listar() throws SQLException{
        return ptipoassociado.listar();
    }
}
