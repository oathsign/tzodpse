package com.oathsign.chp1;

public class UserBiz implements IUserBiz {
    @Override
    public boolean changePassword(String oldPassword) {
        return false;
    }

    @Override
    public boolean deleteUser() {
        return false;
    }

    @Override
    public void mapUser() {

    }

    @Override
    public boolean addOrg(int orgID) {
        return false;
    }

    @Override
    public boolean addRole(int roleID) {
        return false;
    }
}
