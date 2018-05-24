package domain;

public class HZSPayOrders {
    private int userId;
    private int goodsId;

    public HZSPayOrders() {
    }

    public HZSPayOrders(int userId, int goodsId) {
        this.userId = userId;
        this.goodsId = goodsId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Override
    public String toString() {
        return "HZSPayOrders{" +
                "userId=" + userId +
                ", goodsId=" + goodsId +
                '}';
    }
}
