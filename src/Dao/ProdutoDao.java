package Dao;

import Factory.ConnectionFactory;
import Modelo.Produto;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDao {
    
    ConnectionFactory connection = new ConnectionFactory();
    Connection c = connection.getConnection();
    
    public boolean BuscaProduto (Produto produto) throws SQLException {
        String sql = "SELECT * FROM tbl_produto WHERE ID_PRODUTO =?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, produto.getID_PRODUTO());
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    }
    
    public void AdicionaProduto (Produto produto) throws SQLException {
        String sql = "INSERT INTO tbl_produto("
                    + "ID_PRODUTO,"
                    + "ID_FORNECEDOR,"
                    + "NOME_PRODUTO,"
                    + "VALOR_UNI,"
                    + "FORNECEDOR,"
                    + "FABRICANTE)"
                    + "VALUES (?,?,?,?,?,?)";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, produto.getID_PRODUTO());
        stmt.setString(2, produto.getID_FORNECEDOR());
        stmt.setString(3, produto.getNOME_PRODUTO());
        stmt.setString(4, produto.getVALOR_UNI());
        stmt.setString(5, produto.getFORNECEDOR());
        stmt.setString(6, produto.getFABRICANTE());
        
        stmt.execute();
        stmt.close();
        c.close();
    }
    
    public void DeletaProduto (Produto produto) throws SQLException {
        String sql = "DELETE FROM tbl_produto WHERE ID_PRODUTO = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, produto.getID_PRODUTO());
        
        stmt.execute();
        stmt.close();;
        c.close();
    }
    
    public void AtualizaProduto (Produto produto) throws SQLException {
        String sql = "UPDATE tbl_produto SET ID_FORNECEDOR,"
                                        + "NOME_PRODUTO,"
                                        + "VALOR_UNI,"
                                        + "FORNECEDOR,"
                                        + "FABRICANTE,"
                                        + "WHERE ID_PRODUTO=?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, produto.getID_PRODUTO());
        stmt.setString(2, produto.getID_FORNECEDOR());
        stmt.setString(3, produto.getNOME_PRODUTO());
        stmt.setString(4, produto.getVALOR_UNI());
        stmt.setString(5, produto.getFABRICANTE());
        
        stmt.executeUpdate();
        stmt.close();
        c.close();
    }
    
    public List<Produto> listar() throws SQLException {
        String sql = "SELECT * FROM tbl_produto";
        List<Produto> produtos = new ArrayList<>();
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
        Produto produto = new Produto();
        
            produto.setID_PRODUTO(rs.getString("ID_PRODUTO"));
            produto.setID_FORNECEDOR(rs.getString("ID_FORNECEDOR"));
            produto.setNOME_PRODUTO(rs.getString("NOME_PRODUTO"));
            produto.setVALOR_UNI(rs.getNString("VALOR_UNI"));
            produto.setFORNECEDOR(rs.getNString("FORNECEDOR"));
            produto.setFABRICANTE(rs.getNString("FABRICANTE"));
            
            produtos.add(produto);
        }
            stmt.close();
            rs.close();
            c.close();
        return produtos;
    }
}
