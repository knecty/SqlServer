package domain;

public class UBUserRole {
    private int userRoalId;
    private int userId;
    private int roalId;
    private boolean isDeleted;
    private String createdOn;
    private int CreatedBy;
    private String modifiedOn;
    private int modifiedBy;
    private String deletedOn;
    private int deletedBy;
    private int roleTypeId;
    private String beginDate;
    private String endDate;

    public UBUserRole() {
    }

    public UBUserRole(int userRoalId, int userId, int roalId, boolean isDeleted, String createdOn,
                      int createdBy, String modifiedOn, int modifiedBy, String deletedOn, int deletedBy,
                      int roleTypeId, String beginDate, String endDate) {
        this.userRoalId = userRoalId;
        this.userId = userId;
        this.roalId = roalId;
        this.isDeleted = isDeleted;
        this.createdOn = createdOn;
        CreatedBy = createdBy;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.deletedOn = deletedOn;
        this.deletedBy = deletedBy;
        this.roleTypeId = roleTypeId;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public int getUserRoalId() {
        return userRoalId;
    }

    public void setUserRoalId(int userRoalId) {
        this.userRoalId = userRoalId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoalId() {
        return roalId;
    }

    public void setRoalId(int roalId) {
        this.roalId = roalId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public int getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(int createdBy) {
        CreatedBy = createdBy;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(String deletedOn) {
        this.deletedOn = deletedOn;
    }

    public int getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(int deletedBy) {
        this.deletedBy = deletedBy;
    }

    public int getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(int roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "UBUserRole{" +
                "userRoalId=" + userRoalId +
                ", userId=" + userId +
                ", roalId=" + roalId +
                ", isDeleted=" + isDeleted +
                ", createdOn='" + createdOn + '\'' +
                ", CreatedBy=" + CreatedBy +
                ", modifiedOn='" + modifiedOn + '\'' +
                ", modifiedBy=" + modifiedBy +
                ", deletedOn='" + deletedOn + '\'' +
                ", deletedBy=" + deletedBy +
                ", roleTypeId=" + roleTypeId +
                ", beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
