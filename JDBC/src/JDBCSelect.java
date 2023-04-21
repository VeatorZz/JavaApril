import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSelect {
    public static void main(String[] args) throws SQLException {
        //1.创建并初始化数据源
        DataSource dataSource =new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/jotaro?characterEncoding+utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("123456");
        //2.建立连接
        Connection connection=dataSource.getConnection();
        //3.构造SQL
        String sql ="select * from student";
        PreparedStatement statement =connection.prepareStatement(sql);
        //4.执行SQL
        ResultSet resultSet =statement.executeQuery();
        //5.释放资源
        while(resultSet.next()){
            //把resultSet想象成一个表格,同时表格这里有个光标,初始情况下光标指向表最上边
        }
    }
}
