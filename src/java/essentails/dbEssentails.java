/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package essentails;
import java.sql.*;

public class dbEssentails {
    private String query;
    private ResultSet resultset;
    private Statement statement;
    private PreparedStatement pstat;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ResultSet getResultset() {
        return resultset;
    }

    public void setResultset(ResultSet resultset) {
        this.resultset = resultset;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public PreparedStatement getPstat() {
        return pstat;
    }

    public void setPstat(PreparedStatement pstat) {
        this.pstat = pstat;
    }
    
    
}
