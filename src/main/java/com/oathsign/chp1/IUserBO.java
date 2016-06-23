package com.oathsign.chp1;

public interface IUserBO extends IUserInfo {
    void setUserID(String userID);

    String getUserID();

    void setPassword(String password);

    String getPassword();

    void setUserName(String userName);

    String getUserName();
}
