package com.cj.servlet2_2;

import java.io.IOException;

/**
 * Created by CJ on 2017/7/24.
 */
public class StaticResourceProcessor {
    public void process(Request request,Response response){
        try {
            response.sendStaticResource();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
