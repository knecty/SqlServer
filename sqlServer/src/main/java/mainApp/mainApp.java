package mainApp;

import controller.SqlController;

public class mainApp {
    public static void main(String[] args) {
        SqlController controller = new SqlController();
        String payStatus = "PAID";
        controller.update(payStatus);
    }
}
