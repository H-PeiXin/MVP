package com.example.p7_1_10.utils.net;

public interface INetWorkInterface {
//TODO 不考虑回调的情况下，这么写
    public <T> void get(String url,INetCallBack<T> callBack);

//    public <T> void post(String url,INetCallBack<T> callBack);
//
//    public <T> void post(String url, HashMap<String,String> map,INetCallBack<T> callBack);
}
