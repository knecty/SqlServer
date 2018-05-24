package domain;

public class UBUser {
    private int ubUserID;
    private int organizationID;
    private int tenantID;
    private String userPassword;
    private String secretQuestion;
    private String secretAnswer;
    private String sirstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private String dateOfJoining;
    private String email;
    private String phoneNumber;
    private String cellNumber;
    private String fax;
    private String userAddress;
    private String postalCode;
    private String zipCode;
    private String stateName;
    private String city;
    private int countryID;
    private String profileImagePath;
    private int userThemeId;
    private String dateLastLogOn;
    private String dateLastPasswordChange;
    private boolean isDeleted;
    private String createdOn;
    private boolean createdBy;
    private int userStatus;
    private int activeRoleId;
    private String modifiedOn;
    private int modifiedBy;
    private String deletedOn;
    private int deletedBy;
    private boolean isActiveRoleLogOn;
    private boolean passwordNeverExpire;
    private String jobTitle;
    private String interests;
    private String dateOfBirthDisplay;
    private boolean changePasswordOnLogon;
    private int defaultCultureId;
    private String dateLastRequestNotificationView;
    private String dateLastMessagesNotificationView;
    private String dateLastSocialNotificationView;
    private boolean sendEmailOnConnectionRequest;
    private boolean sendEmailOnConnectionApproval;
    private boolean userTimeZoneId;
    private boolean sendEmailOnGroupRequest;
    private boolean sendEmailOnGroupInvite;
    private String fullName;
    private boolean isSocialUser;
    private String username;
    private int managerID;
    private String managerIdPath;
    private String iCNumber;
    private boolean isSendAccessDetail;
    private int indexFailOver;
    private boolean isSuperAdmin;
    private int disableReason;
    private String tags;
    private String companyName;
    private String companyWebsite;
    private String expertise;
    private String userRoleTitles;
    private String comments;
    private int userNotificationPreference;
    private String skype;
    private String linkedIn;
    private String googlePlus;
    private int sectorId;
    private int skillExpertiseId;
    private int regionalExpertiseId;
    private String qualifications;
    private String professionalMemberships;
    private String personalAssistantName;
    private String personalAssistantOfficePhone;
    private String personalAssistantEmail;
    private boolean isLearner;
    private int industryId;
    private boolean lockContentCreation;
    private boolean showContactInforamtion;
    private int cityId;
    private int schoolId;
    private String encryptPassword;
    private int provinceId;
    private int districtId;
    private String userPayType;
    private String payStatus;

    public UBUser() {
    }

    public UBUser(int ubUserID, int organizationID, int tenantID, String userPassword, String secretQuestion,
                  String secretAnswer, String sirstName, String middleName, String lastName, String gender,
                  String dateOfBirth, String dateOfJoining, String email, String phoneNumber, String cellNumber,
                  String fax, String userAddress, String postalCode, String zipCode, String stateName, String city,
                  int countryID, String profileImagePath, int userThemeId, String dateLastLogOn,
                  String dateLastPasswordChange, boolean isDeleted, String createdOn, boolean createdBy,
                  int userStatus, int activeRoleId, String modifiedOn, int modifiedBy, String deletedOn,
                  int deletedBy, boolean isActiveRoleLogOn, boolean passwordNeverExpire, String jobTitle,
                  String interests, String dateOfBirthDisplay, boolean changePasswordOnLogon,
                  int defaultCultureId, String dateLastRequestNotificationView, String dateLastMessagesNotificationView,
                  String dateLastSocialNotificationView, boolean sendEmailOnConnectionRequest,
                  boolean sendEmailOnConnectionApproval, boolean userTimeZoneId, boolean sendEmailOnGroupRequest,
                  boolean sendEmailOnGroupInvite, String fullName, boolean isSocialUser, String username,
                  int managerID, String managerIdPath, String iCNumber, boolean isSendAccessDetail, int indexFailOver,
                  boolean isSuperAdmin, int disableReason, String tags, String companyName, String companyWebsite,
                  String expertise, String userRoleTitles, String comments, int userNotificationPreference,
                  String skype, String linkedIn, String googlePlus, int sectorId, int skillExpertiseId,
                  int regionalExpertiseId, String qualifications, String professionalMemberships,
                  String personalAssistantName, String personalAssistantOfficePhone, String personalAssistantEmail,
                  boolean isLearner, int industryId, boolean lockContentCreation, boolean showContactInforamtion,
                  int cityId, int schoolId, String encryptPassword, int provinceId, int districtId, String userPayType,
                  String payStatus) {
        this.ubUserID = ubUserID;
        this.organizationID = organizationID;
        this.tenantID = tenantID;
        this.userPassword = userPassword;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
        this.sirstName = sirstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.cellNumber = cellNumber;
        this.fax = fax;
        this.userAddress = userAddress;
        this.postalCode = postalCode;
        this.zipCode = zipCode;
        this.stateName = stateName;
        this.city = city;
        this.countryID = countryID;
        this.profileImagePath = profileImagePath;
        this.userThemeId = userThemeId;
        this.dateLastLogOn = dateLastLogOn;
        this.dateLastPasswordChange = dateLastPasswordChange;
        this.isDeleted = isDeleted;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.userStatus = userStatus;
        this.activeRoleId = activeRoleId;
        this.modifiedOn = modifiedOn;
        this.modifiedBy = modifiedBy;
        this.deletedOn = deletedOn;
        this.deletedBy = deletedBy;
        this.isActiveRoleLogOn = isActiveRoleLogOn;
        this.passwordNeverExpire = passwordNeverExpire;
        this.jobTitle = jobTitle;
        this.interests = interests;
        this.dateOfBirthDisplay = dateOfBirthDisplay;
        this.changePasswordOnLogon = changePasswordOnLogon;
        this.defaultCultureId = defaultCultureId;
        this.dateLastRequestNotificationView = dateLastRequestNotificationView;
        this.dateLastMessagesNotificationView = dateLastMessagesNotificationView;
        this.dateLastSocialNotificationView = dateLastSocialNotificationView;
        this.sendEmailOnConnectionRequest = sendEmailOnConnectionRequest;
        this.sendEmailOnConnectionApproval = sendEmailOnConnectionApproval;
        this.userTimeZoneId = userTimeZoneId;
        this.sendEmailOnGroupRequest = sendEmailOnGroupRequest;
        this.sendEmailOnGroupInvite = sendEmailOnGroupInvite;
        this.fullName = fullName;
        this.isSocialUser = isSocialUser;
        this.username = username;
        this.managerID = managerID;
        this.managerIdPath = managerIdPath;
        this.iCNumber = iCNumber;
        this.isSendAccessDetail = isSendAccessDetail;
        this.indexFailOver = indexFailOver;
        this.isSuperAdmin = isSuperAdmin;
        this.disableReason = disableReason;
        this.tags = tags;
        this.companyName = companyName;
        this.companyWebsite = companyWebsite;
        this.expertise = expertise;
        this.userRoleTitles = userRoleTitles;
        this.comments = comments;
        this.userNotificationPreference = userNotificationPreference;
        this.skype = skype;
        this.linkedIn = linkedIn;
        this.googlePlus = googlePlus;
        this.sectorId = sectorId;
        this.skillExpertiseId = skillExpertiseId;
        this.regionalExpertiseId = regionalExpertiseId;
        this.qualifications = qualifications;
        this.professionalMemberships = professionalMemberships;
        this.personalAssistantName = personalAssistantName;
        this.personalAssistantOfficePhone = personalAssistantOfficePhone;
        this.personalAssistantEmail = personalAssistantEmail;
        this.isLearner = isLearner;
        this.industryId = industryId;
        this.lockContentCreation = lockContentCreation;
        this.showContactInforamtion = showContactInforamtion;
        this.cityId = cityId;
        this.schoolId = schoolId;
        this.encryptPassword = encryptPassword;
        this.provinceId = provinceId;
        this.districtId = districtId;
        this.userPayType = userPayType;
        this.payStatus = payStatus;
    }

    public int getUbUserID() {
        return ubUserID;
    }

    public void setUbUserID(int ubUserID) {
        this.ubUserID = ubUserID;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public int getTenantID() {
        return tenantID;
    }

    public void setTenantID(int tenantID) {
        this.tenantID = tenantID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getSecretQuestion() {
        return secretQuestion;
    }

    public void setSecretQuestion(String secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    public String getSecretAnswer() {
        return secretAnswer;
    }

    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }

    public String getSirstName() {
        return sirstName;
    }

    public void setSirstName(String sirstName) {
        this.sirstName = sirstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getProfileImagePath() {
        return profileImagePath;
    }

    public void setProfileImagePath(String profileImagePath) {
        this.profileImagePath = profileImagePath;
    }

    public int getUserThemeId() {
        return userThemeId;
    }

    public void setUserThemeId(int userThemeId) {
        this.userThemeId = userThemeId;
    }

    public String getDateLastLogOn() {
        return dateLastLogOn;
    }

    public void setDateLastLogOn(String dateLastLogOn) {
        this.dateLastLogOn = dateLastLogOn;
    }

    public String getDateLastPasswordChange() {
        return dateLastPasswordChange;
    }

    public void setDateLastPasswordChange(String dateLastPasswordChange) {
        this.dateLastPasswordChange = dateLastPasswordChange;
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

    public boolean isCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(boolean createdBy) {
        this.createdBy = createdBy;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public int getActiveRoleId() {
        return activeRoleId;
    }

    public void setActiveRoleId(int activeRoleId) {
        this.activeRoleId = activeRoleId;
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

    public boolean isActiveRoleLogOn() {
        return isActiveRoleLogOn;
    }

    public void setActiveRoleLogOn(boolean activeRoleLogOn) {
        isActiveRoleLogOn = activeRoleLogOn;
    }

    public boolean isPasswordNeverExpire() {
        return passwordNeverExpire;
    }

    public void setPasswordNeverExpire(boolean passwordNeverExpire) {
        this.passwordNeverExpire = passwordNeverExpire;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getDateOfBirthDisplay() {
        return dateOfBirthDisplay;
    }

    public void setDateOfBirthDisplay(String dateOfBirthDisplay) {
        this.dateOfBirthDisplay = dateOfBirthDisplay;
    }

    public boolean isChangePasswordOnLogon() {
        return changePasswordOnLogon;
    }

    public void setChangePasswordOnLogon(boolean changePasswordOnLogon) {
        this.changePasswordOnLogon = changePasswordOnLogon;
    }

    public int getDefaultCultureId() {
        return defaultCultureId;
    }

    public void setDefaultCultureId(int defaultCultureId) {
        this.defaultCultureId = defaultCultureId;
    }

    public String getDateLastRequestNotificationView() {
        return dateLastRequestNotificationView;
    }

    public void setDateLastRequestNotificationView(String dateLastRequestNotificationView) {
        this.dateLastRequestNotificationView = dateLastRequestNotificationView;
    }

    public String getDateLastMessagesNotificationView() {
        return dateLastMessagesNotificationView;
    }

    public void setDateLastMessagesNotificationView(String dateLastMessagesNotificationView) {
        this.dateLastMessagesNotificationView = dateLastMessagesNotificationView;
    }

    public String getDateLastSocialNotificationView() {
        return dateLastSocialNotificationView;
    }

    public void setDateLastSocialNotificationView(String dateLastSocialNotificationView) {
        this.dateLastSocialNotificationView = dateLastSocialNotificationView;
    }

    public boolean isSendEmailOnConnectionRequest() {
        return sendEmailOnConnectionRequest;
    }

    public void setSendEmailOnConnectionRequest(boolean sendEmailOnConnectionRequest) {
        this.sendEmailOnConnectionRequest = sendEmailOnConnectionRequest;
    }

    public boolean isSendEmailOnConnectionApproval() {
        return sendEmailOnConnectionApproval;
    }

    public void setSendEmailOnConnectionApproval(boolean sendEmailOnConnectionApproval) {
        this.sendEmailOnConnectionApproval = sendEmailOnConnectionApproval;
    }

    public boolean isUserTimeZoneId() {
        return userTimeZoneId;
    }

    public void setUserTimeZoneId(boolean userTimeZoneId) {
        this.userTimeZoneId = userTimeZoneId;
    }

    public boolean isSendEmailOnGroupRequest() {
        return sendEmailOnGroupRequest;
    }

    public void setSendEmailOnGroupRequest(boolean sendEmailOnGroupRequest) {
        this.sendEmailOnGroupRequest = sendEmailOnGroupRequest;
    }

    public boolean isSendEmailOnGroupInvite() {
        return sendEmailOnGroupInvite;
    }

    public void setSendEmailOnGroupInvite(boolean sendEmailOnGroupInvite) {
        this.sendEmailOnGroupInvite = sendEmailOnGroupInvite;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isSocialUser() {
        return isSocialUser;
    }

    public void setSocialUser(boolean socialUser) {
        isSocialUser = socialUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getManagerIdPath() {
        return managerIdPath;
    }

    public void setManagerIdPath(String managerIdPath) {
        this.managerIdPath = managerIdPath;
    }

    public String getiCNumber() {
        return iCNumber;
    }

    public void setiCNumber(String iCNumber) {
        this.iCNumber = iCNumber;
    }

    public boolean isSendAccessDetail() {
        return isSendAccessDetail;
    }

    public void setSendAccessDetail(boolean sendAccessDetail) {
        isSendAccessDetail = sendAccessDetail;
    }

    public int getIndexFailOver() {
        return indexFailOver;
    }

    public void setIndexFailOver(int indexFailOver) {
        this.indexFailOver = indexFailOver;
    }

    public boolean isSuperAdmin() {
        return isSuperAdmin;
    }

    public void setSuperAdmin(boolean superAdmin) {
        isSuperAdmin = superAdmin;
    }

    public int getDisableReason() {
        return disableReason;
    }

    public void setDisableReason(int disableReason) {
        this.disableReason = disableReason;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getUserRoleTitles() {
        return userRoleTitles;
    }

    public void setUserRoleTitles(String userRoleTitles) {
        this.userRoleTitles = userRoleTitles;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getUserNotificationPreference() {
        return userNotificationPreference;
    }

    public void setUserNotificationPreference(int userNotificationPreference) {
        this.userNotificationPreference = userNotificationPreference;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getGooglePlus() {
        return googlePlus;
    }

    public void setGooglePlus(String googlePlus) {
        this.googlePlus = googlePlus;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public int getSkillExpertiseId() {
        return skillExpertiseId;
    }

    public void setSkillExpertiseId(int skillExpertiseId) {
        this.skillExpertiseId = skillExpertiseId;
    }

    public int getRegionalExpertiseId() {
        return regionalExpertiseId;
    }

    public void setRegionalExpertiseId(int regionalExpertiseId) {
        this.regionalExpertiseId = regionalExpertiseId;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getProfessionalMemberships() {
        return professionalMemberships;
    }

    public void setProfessionalMemberships(String professionalMemberships) {
        this.professionalMemberships = professionalMemberships;
    }

    public String getPersonalAssistantName() {
        return personalAssistantName;
    }

    public void setPersonalAssistantName(String personalAssistantName) {
        this.personalAssistantName = personalAssistantName;
    }

    public String getPersonalAssistantOfficePhone() {
        return personalAssistantOfficePhone;
    }

    public void setPersonalAssistantOfficePhone(String personalAssistantOfficePhone) {
        this.personalAssistantOfficePhone = personalAssistantOfficePhone;
    }

    public String getPersonalAssistantEmail() {
        return personalAssistantEmail;
    }

    public void setPersonalAssistantEmail(String personalAssistantEmail) {
        this.personalAssistantEmail = personalAssistantEmail;
    }

    public boolean isLearner() {
        return isLearner;
    }

    public void setLearner(boolean learner) {
        isLearner = learner;
    }

    public int getIndustryId() {
        return industryId;
    }

    public void setIndustryId(int industryId) {
        this.industryId = industryId;
    }

    public boolean isLockContentCreation() {
        return lockContentCreation;
    }

    public void setLockContentCreation(boolean lockContentCreation) {
        this.lockContentCreation = lockContentCreation;
    }

    public boolean isShowContactInforamtion() {
        return showContactInforamtion;
    }

    public void setShowContactInforamtion(boolean showContactInforamtion) {
        this.showContactInforamtion = showContactInforamtion;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getEncryptPassword() {
        return encryptPassword;
    }

    public void setEncryptPassword(String encryptPassword) {
        this.encryptPassword = encryptPassword;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public String getUserPayType() {
        return userPayType;
    }

    public void setUserPayType(String userPayType) {
        this.userPayType = userPayType;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    @Override
    public String toString() {
        return "UBUser{" +
                "ubUserID=" + ubUserID +
                ", organizationID=" + organizationID +
                ", tenantID=" + tenantID +
                ", userPassword='" + userPassword + '\'' +
                ", secretQuestion='" + secretQuestion + '\'' +
                ", secretAnswer='" + secretAnswer + '\'' +
                ", sirstName='" + sirstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                ", fax='" + fax + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", stateName='" + stateName + '\'' +
                ", city='" + city + '\'' +
                ", countryID=" + countryID +
                ", profileImagePath='" + profileImagePath + '\'' +
                ", userThemeId=" + userThemeId +
                ", dateLastLogOn='" + dateLastLogOn + '\'' +
                ", dateLastPasswordChange='" + dateLastPasswordChange + '\'' +
                ", isDeleted=" + isDeleted +
                ", createdOn='" + createdOn + '\'' +
                ", createdBy=" + createdBy +
                ", userStatus=" + userStatus +
                ", activeRoleId=" + activeRoleId +
                ", modifiedOn='" + modifiedOn + '\'' +
                ", modifiedBy=" + modifiedBy +
                ", deletedOn='" + deletedOn + '\'' +
                ", deletedBy=" + deletedBy +
                ", isActiveRoleLogOn=" + isActiveRoleLogOn +
                ", passwordNeverExpire=" + passwordNeverExpire +
                ", jobTitle='" + jobTitle + '\'' +
                ", interests='" + interests + '\'' +
                ", dateOfBirthDisplay='" + dateOfBirthDisplay + '\'' +
                ", changePasswordOnLogon=" + changePasswordOnLogon +
                ", defaultCultureId=" + defaultCultureId +
                ", dateLastRequestNotificationView='" + dateLastRequestNotificationView + '\'' +
                ", dateLastMessagesNotificationView='" + dateLastMessagesNotificationView + '\'' +
                ", dateLastSocialNotificationView='" + dateLastSocialNotificationView + '\'' +
                ", sendEmailOnConnectionRequest=" + sendEmailOnConnectionRequest +
                ", sendEmailOnConnectionApproval=" + sendEmailOnConnectionApproval +
                ", userTimeZoneId=" + userTimeZoneId +
                ", sendEmailOnGroupRequest=" + sendEmailOnGroupRequest +
                ", sendEmailOnGroupInvite=" + sendEmailOnGroupInvite +
                ", fullName='" + fullName + '\'' +
                ", isSocialUser=" + isSocialUser +
                ", username='" + username + '\'' +
                ", managerID=" + managerID +
                ", managerIdPath='" + managerIdPath + '\'' +
                ", iCNumber='" + iCNumber + '\'' +
                ", isSendAccessDetail=" + isSendAccessDetail +
                ", indexFailOver=" + indexFailOver +
                ", isSuperAdmin=" + isSuperAdmin +
                ", disableReason=" + disableReason +
                ", tags='" + tags + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyWebsite='" + companyWebsite + '\'' +
                ", expertise='" + expertise + '\'' +
                ", userRoleTitles='" + userRoleTitles + '\'' +
                ", comments='" + comments + '\'' +
                ", userNotificationPreference=" + userNotificationPreference +
                ", skype='" + skype + '\'' +
                ", linkedIn='" + linkedIn + '\'' +
                ", googlePlus='" + googlePlus + '\'' +
                ", sectorId=" + sectorId +
                ", skillExpertiseId=" + skillExpertiseId +
                ", regionalExpertiseId=" + regionalExpertiseId +
                ", qualifications='" + qualifications + '\'' +
                ", professionalMemberships='" + professionalMemberships + '\'' +
                ", personalAssistantName='" + personalAssistantName + '\'' +
                ", personalAssistantOfficePhone='" + personalAssistantOfficePhone + '\'' +
                ", personalAssistantEmail='" + personalAssistantEmail + '\'' +
                ", isLearner=" + isLearner +
                ", industryId=" + industryId +
                ", lockContentCreation=" + lockContentCreation +
                ", showContactInforamtion=" + showContactInforamtion +
                ", cityId=" + cityId +
                ", schoolId=" + schoolId +
                ", encryptPassword='" + encryptPassword + '\'' +
                ", provinceId=" + provinceId +
                ", districtId=" + districtId +
                ", userPayType='" + userPayType + '\'' +
                ", payStatus='" + payStatus + '\'' +
                '}';
    }
}
