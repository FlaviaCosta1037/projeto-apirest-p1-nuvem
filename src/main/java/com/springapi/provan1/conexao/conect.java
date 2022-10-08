package com.springapi.provan1.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conect {
    
    public static Connection getConexao()
        throws ClassNotFoundException, SQLException{
            Connection conexao = null;
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("us-cdbr-east-06.cleardb.net/heroku_b352466dfb92954","b5364f73e03359","7df6cfa2");
            return conexao;
        }
        
}
