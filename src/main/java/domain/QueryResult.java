package domain;

public class QueryResult {
    private int ubUserID;
    private String userRoleTitles;
    private String startDate;
    private  String endDate;

    public QueryResult() {
    }

    public QueryResult(int ubUserID, String userRoleTitles, String startDate, String endDate) {
        this.ubUserID = ubUserID;
        this.userRoleTitles = userRoleTitles;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getUbUserID() {
        return ubUserID;
    }

    public void setUbUserID(int ubUserID) {
        this.ubUserID = ubUserID;
    }

    public String getUserRoleTitles() {
        return userRoleTitles;
    }

    public void setUserRoleTitles(String userRoleTitles) {
        this.userRoleTitles = userRoleTitles;
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
        return "QueryResult{" +
                "ubUserID=" + ubUserID +
                ", userRoleTitles='" + userRoleTitles + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
