package com.oathsign.chp1;

public interface IUserInfo {
    void setUserID(String userID);
    String getUserID();
    void setPassword(String password);
    String getPassword();
    void setUserName(String userName);
    String getUserName();
    boolean changePassword(String oldPassword);
    boolean deleteUser();
    void mapUser();
    boolean addOrg(int orgID);
    boolean addRole(int roleID);
}
