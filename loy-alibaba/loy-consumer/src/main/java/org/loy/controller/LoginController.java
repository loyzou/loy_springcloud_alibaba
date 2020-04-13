package org.loy.controller;

import org.loy.LoyProviderApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController extends BaseController{
    @Autowired
    private LoyProviderApi loyProviderApi;

    @RequestMapping("login")
    public String login(){
        Map<String,Object> params = new HashMap<>();
        String res = loyProviderApi.doCall(params);
        System.out.println(res);
        return "Login Success";
    }
}
