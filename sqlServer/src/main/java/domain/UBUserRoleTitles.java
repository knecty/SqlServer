package domain;

public class UBUserRoleTitles {
    private int userRoleId;
    private int userId;
    private int cultureld;
    private String roleTitles;

    public UBUserRoleTitles() {
    }

    public UBUserRoleTitles(int userRoleId, int userId, int cultureld, String roleTitles) {
        this.userRoleId = userRoleId;
        this.userId = userId;
        this.cultureld = cultureld;
        this.roleTitles = roleTitles;
    }

    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCultureld() {
        return cultureld;
    }

    public void setCultureld(int cultureld) {
        this.cultureld = cultureld;
    }

    public String getRoleTitles() {
        return roleTitles;
    }

    public void setRoleTitles(String roleTitles) {
        this.roleTitles = roleTitles;
    }

    @Override
    public String toString() {
        return "UBUserRoleTitles{" +
                "userRoleId=" + userRoleId +
                ", userId=" + userId +
                ", cultureld=" + cultureld +
                ", roleTitles='" + roleTitles + '\'' +
                '}';
    }
}
