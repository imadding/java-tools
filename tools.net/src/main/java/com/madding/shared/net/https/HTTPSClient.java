package com.madding.shared.net.https;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class HTTPSClient {

    public static void main(String[] args) throws Exception {
        
        System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
        URL url = new URL("https://www.alipay.com/");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
