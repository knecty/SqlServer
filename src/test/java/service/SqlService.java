package service;

import dao.SqlDao;

public class SqlService {
    private SqlDao dao = new SqlDao();
    public void update(String payStatus){
        dao.update(payStatus);
    }
}
