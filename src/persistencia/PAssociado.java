/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.EAssociado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heuber
 */
public class PAssociado {

    public PAssociado() {
    }

    public void incluir(EAssociado parametro) throws Exception {
        try {

            //Cria a string com o sql para ser executado
            String sql = "INSERT INTO associado ( nome,"
                    + "endereco, telefone, "
                    + "codigo_tipo_associado) VALUES (?, ?, ?, ?)";

            //Cria o objeto de conexão com o banco
            Connection cnn = util.Conexao.getConexao();

            //Cria o objeto para executar os comandos "contra" o banco
            PreparedStatement prd = cnn.prepareStatement(sql);

            //Seta os valores recebidos como parametro para a string SQL
            prd.setString(1, parametro.getNome());
            prd.setString(2, parametro.getEndereco());
            prd.setString(3, parametro.getTelefone());
            prd.setInt(4, parametro.getTipoAssociado().getCodigo());

            //Executa o SQL no banco de dados
            prd.execute();

            cnn.close();

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void alterar(EAssociado parametro) throws Exception {
        try {

            //Cria o objeto para a conexao
            Connection cnn = util.Conexao.getConexao();

            String sql = "UPDATE associado "
                    + "SET nome = ?, "
                    + "endereco = ?, "
                    + "telefone = ?, "
                    + "codigo_tipo_associado = ?  "
                    + " WHERE codigo = ?";

            PreparedStatement prd = cnn.prepareStatement(sql);
            prd.setString(1, parametro.getNome());
            prd.setString(2, parametro.getEndereco());
            prd.setString(3, parametro.getTelefone());
            prd.setInt(4, parametro.getTipoAssociado().getCodigo());
            prd.setInt(5, parametro.getCodigo());

            prd.execute();
            cnn.close();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void excluir(int parametro) throws Exception {
        try {

            //Cria o objeto para a conexao
            Connection cnn = util.Conexao.getConexao();

            String sql = "DELETE FROM associado WHERE codigo = ?";

            PreparedStatement prd = cnn.prepareStatement(sql);
            prd.setInt(1, parametro);

            prd.execute();
            cnn.close();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public EAssociado consultar(int parametro) throws SQLException {
        Connection cnn = util.Conexao.getConexao();
        String sql = "SELECT codigo, nome, endereco, "
                + "telefone, codigo_tipo_associado "
                + "FROM associado WHERE codigo = ?";
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, parametro);

        ResultSet rs = prd.executeQuery();
        EAssociado retorno = new EAssociado();

        if (rs.next()) {
            retorno.setCodigo(rs.getInt("codigo"));
            retorno.setNome(rs.getString("nome"));
            retorno.setEndereco(rs.getString("endereco"));
            retorno.setTelefone(rs.getString("telefone"));
            retorno.setTipoAssociado(
                    new PTipoAssociado().consultar(rs.getInt("codigo_tipo_associado"))
            );
        }
        rs.close();
        cnn.close();

        return retorno;
    }

    public List<EAssociado> listar() throws Exception {
        List<EAssociado> lista = new ArrayList<>(); //<<<<<<<<<<<<<<<<<<<<<<

        try {

            Connection conexao = util.Conexao.getConexao();

            String sql = "SELECT codigo, nome, endereco, "
                    + "telefone, codigo_tipo_associado "
                    + "FROM associado ";

            PreparedStatement prd = conexao.prepareStatement(sql);

            ResultSet rs = prd.executeQuery();

            while (rs.next()) {
                EAssociado associado = new EAssociado(); //<<<<<<<<<<<<<<<<<<<<<<
                associado.setCodigo(rs.getInt("codigo"));
                associado.setNome(rs.getString("nome"));
                associado.setEndereco(rs.getString("endereco"));
                associado.setTelefone(rs.getString("telefone"));
                associado.setTipoAssociado(new PTipoAssociado().consultar(rs.getInt("codigo_tipo_associado")));
                lista.add(associado);//<<<<<<<<<<<<<<<<<<<<<<
            }
            rs.close();
            conexao.close();

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

        return lista;
    }

    public List<EAssociado> listarPorNome(String nome) throws Exception {
        List<EAssociado> lista = new ArrayList<>(); //<<<<<<<<<<<<<<<<<<<<<<

        try {

            Connection cnn = util.Conexao.getConexao();

            String sql = "SELECT * "
                    + "FROM associado "
                    + "WHERE nome like ? "
                    + "ORDER BY nome";

            PreparedStatement prd = cnn.prepareStatement(sql);
            
            prd.setString(1, "%" + nome + "%");

            ResultSet rs = prd.executeQuery();

            while (rs.next()) {
                EAssociado associado = new EAssociado(); //<<<<<<<<<<<<<<<<<<<<<<
                associado.setCodigo(rs.getInt("codigo"));
                associado.setNome(rs.getString("nome"));
                associado.setEndereco(rs.getString("endereco"));
                associado.setTelefone(rs.getString("telefone"));
                lista.add(associado);//<<<<<<<<<<<<<<<<<<<<<<
            }
            rs.close();
            cnn.close();

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

        return lista;
    }
    
    public List<EAssociado> listarPorFiltros(EAssociado parametro) throws Exception {
        List<EAssociado> lista = new ArrayList<>(); //<<<<<<<<<<<<<<<<<<<<<<

        try {

            Connection cnn = util.Conexao.getConexao();

            String sql = "SELECT * "
                    + "FROM associado "
                    + "WHERE 1=1 ";
                
                if (parametro.getCodigo() != 0)
                    sql += " AND codigo = ? ";

                if (!parametro.getEndereco().isEmpty())                            
                    sql += " AND endereco like ? ";
 
                if (!parametro.getTelefone().isEmpty())
                    sql += " AND telefone like ? ";
              
                sql += "ORDER BY nome";
            
            PreparedStatement prd = cnn.prepareStatement(sql);
            
            int cont = 1;
            
            if (parametro.getCodigo() != 0){
                prd.setInt(cont, parametro.getCodigo());
                cont++;
            }
            
            if (!parametro.getEndereco().isEmpty()){
                prd.setString(cont, "%" + parametro.getEndereco() + "%");
                cont++;
            }
            if (!parametro.getTelefone().isEmpty()){
                prd.setString(cont, "%" + parametro.getTelefone() + "%");
            }
            
            
            ResultSet rs = prd.executeQuery();

            while (rs.next()) {
                EAssociado associado = new EAssociado(); //<<<<<<<<<<<<<<<<<<<<<<
                associado.setCodigo(rs.getInt("codigo"));
                associado.setNome(rs.getString("nome"));
                associado.setEndereco(rs.getString("endereco"));
                associado.setTelefone(rs.getString("telefone"));
                lista.add(associado);//<<<<<<<<<<<<<<<<<<<<<<
            }
            rs.close();
            cnn.close();

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

        return lista;
    }
}
