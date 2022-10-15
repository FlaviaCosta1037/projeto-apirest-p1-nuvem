package com.springapi.provan1.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conect {
    
    public static Connection getConexao()
        throws ClassNotFoundException, SQLException{
            Connection conexao = null;
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("us-cdbr-east-06.cleardb.net/heroku_5344e9f41e8d916","b42e311f924484","f1534093");
            return conexao;
        }
        
}
