package com.okhttplibrary.okhttp.cookie.store;

import java.net.HttpCookie;
import java.util.List;

import okhttp3.Cookie;
import okhttp3.HttpUrl;

public interface CookieStore extends java.net.CookieStore {

    public  void add(HttpUrl uri, List<Cookie> cookie);

    public  List<Cookie> get(HttpUrl uri);

    public List<HttpCookie> getCookies();

    public  boolean remove(HttpUrl uri, Cookie cookie);

    public boolean removeAll();


}
