/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.ETipoAssociado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HeuberLima
 */
public class PTipoAssociado {

    public void incluir(ETipoAssociado parametro) throws SQLException {

        String sql = "INSERT INTO tipo_associado (descricao,"
                + "valormensalidade) VALUES (?,?);";

        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setString(1, parametro.getDescricao());
        prd.setDouble(2, parametro.getValorMensalidade());

        prd.execute();

    }

    public void alterar(ETipoAssociado parametro) throws SQLException {

        String sql = "UPDATE tipo_associado SET descricao = ?,"
                + " valormensalidade = ? WHERE codigo = ?;";

        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setString(1, parametro.getDescricao());
        prd.setDouble(2, parametro.getValorMensalidade());
        prd.setInt(3, parametro.getCodigo());

        prd.execute();

    }

    public void excluir(int codigo) throws SQLException {

        String sql = "DELETE FROM tipo_associado WHERE codigo = ?;";

        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, codigo);

        prd.execute();

    }

    public ETipoAssociado consultar(int codigo) throws SQLException {

        String sql = "SELECT codigo, descricao, valormensalidade"
                + " FROM tipo_associado WHERE codigo = ?;";

        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, codigo);

        ResultSet rs = prd.executeQuery();

        ETipoAssociado retorno = new ETipoAssociado();
        if (rs.next()) {
            retorno.setCodigo(rs.getInt("codigo"));
            retorno.setDescricao(rs.getString("descricao"));
            retorno.setValorMensalidade(rs.getDouble("valormensalidade"));
        }
        return retorno;
    }

    public List<ETipoAssociado> listar() throws SQLException {
        String sql = "SELECT codigo, descricao, valormensalidade "
                + " FROM tipo_associado";

        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);

        ResultSet rs = prd.executeQuery();

        List<ETipoAssociado> lst = new ArrayList<ETipoAssociado>();
        while (rs.next()) {
            ETipoAssociado objeto = new ETipoAssociado();
            objeto.setCodigo(rs.getInt("codigo"));
            objeto.setDescricao(rs.getString("descricao"));
            objeto.setValorMensalidade(rs.getDouble("valormensalidade"));
            lst.add(objeto);
        }
        return lst;
    }
}
