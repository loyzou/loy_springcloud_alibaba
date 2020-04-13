package org.loy.controller;

import org.loy.LoyProviderApi;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoyProviderController implements LoyProviderApi {

    @RequestMapping("/doCall")
    public String doCall(@RequestBody Map<String, Object> params) {
        System.out.println(params);
        return "do call success";
    }
}
