package tools;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

public class JDBCUtils {
    private static BasicDataSource datasource = new BasicDataSource();
    static{
        datasource.setDriverClassName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
        datasource.setUrl("jdbc:microsoft:sqlserver://10.213.0.47:1414/UBJomsomMainSystemDev2");
        datasource.setUsername("sa");
        datasource.setPassword("Welcome123");
        datasource.setMaxActive(10);
        datasource.setMaxIdle(5);
        datasource.setMinIdle(2);
        datasource.setInitialSize(10);
    }
    public static DataSource getDataSource(){
        return datasource;
    }
}
