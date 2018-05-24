package dao;

import domain.QueryResult;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import tools.JDBCUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
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
            FileWriter fw1 = new FileWriter("paid_UBUserRole.txt");
            FileWriter fw2 = new FileWriter("paid_UBUserRoleTitles.txt");
            BufferedWriter bufw1 = new BufferedWriter(fw1);
            BufferedWriter bufw2 = new BufferedWriter(fw2);
            List<QueryResult> list = qr.query(sql1,new BeanListHandler<QueryResult>(QueryResult.class),payStatus);

            String s1 = "ALTER TABLE UBUserRoleTitles ADD (UserType VARCHAR(100));";
            bufw2.write(s1);
            bufw2.newLine();
            for (QueryResult qu:list) {
                String s2 = "update UBUserRole set StartDate="+ qu.getStartDate() + "," + "EndDate=" + qu.getEndDate() + "where UserId=" + qu.getUbUserID() + ";";

                String s3 = "UPDATE UBUserRoleTitles SET UserType='付费用户' WHERE UserId=" + qu.getUbUserID() + ";";
                bufw1.write(s2);
                bufw1.newLine();
                bufw2.write(s3);
                bufw2.newLine();
            }
            bufw1.flush();
            bufw2.flush();
            bufw1.close();
            bufw2.close();
            fw1.close();
            fw2.close();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
