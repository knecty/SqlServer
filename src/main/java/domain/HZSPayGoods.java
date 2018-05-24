package domain;

public class HZSPayGoods {
    private int goodsId;
    private String startDate;
    private String endDate;

    public HZSPayGoods() {
    }

    public HZSPayGoods(int goodsId, String startDate, String endDate) {
        this.goodsId = goodsId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "HZSPayGoods{" +
                "goodsId=" + goodsId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
