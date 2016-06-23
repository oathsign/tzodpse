package com.oathsign.chp1;

public class UserInfoTest {

    public void test() {
        IUserInfo userInfo = new UserInfo();
        IUserBO userBO = (IUserBO) userInfo;
        userBO.setPassword("abc");
        IUserBiz userBiz = (IUserBiz) userInfo;
        userBiz.deleteUser();
    }
}