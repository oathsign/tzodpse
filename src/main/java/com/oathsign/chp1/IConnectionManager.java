package com.oathsign.chp1;

public interface IConnectionManager {
    //拨通电话
    void dial(String phoneNumber);
    //通话完毕,挂电话
    void hangup();
}
