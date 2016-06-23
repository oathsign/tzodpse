package com.oathsign.chp1;

public interface IUserBiz extends IUserInfo {
    boolean changePassword(String oldPassword);

    boolean deleteUser();

    void mapUser();

    boolean addOrg(int orgID);

    boolean addRole(int roleID);
}
