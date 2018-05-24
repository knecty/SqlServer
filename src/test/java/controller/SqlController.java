package controller;

import service.SqlService;

public class SqlController {
    private SqlService service = new SqlService();
    public void update(String payStatus){
        service.update(payStatus);
    }
}
