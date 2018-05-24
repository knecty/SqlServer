package dao;

import domain.*;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import tools.JDBCUtils;

import java.sql.SQLException;
import java.util.List;

public class SqlDao {
    private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

    public void update(String payStatus){
        try {
            String sql1 = "SELECT U.UBUserID,U.UserRoleTitles,PG.EndDate,PG.StartDate " +
                        "FROM UBUser U " +
                        "INNER JOIN HZSPayOrders PO ON PO.UserId = U.UBUserID " +
                        "INNER JOIN HZSPayGoods PG ON PO.GoodsId = PG.GoodsId " +
                        "WHERE U.PayStatus = ?";
            String sql2 = "update UBUserRole set StartDate=?,EndDate=? where UserId=?";
            String param = payStatus;
            List<QueryResult> list = qr.query(sql1,new BeanListHandler<>(QueryResult.class),param);

            for (QueryResult qu:list) {
                Object[] params = {qu.getStartDate(),qu.getEndDate(),qu.getUbUserID()};
                qr.update(sql2,params);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
