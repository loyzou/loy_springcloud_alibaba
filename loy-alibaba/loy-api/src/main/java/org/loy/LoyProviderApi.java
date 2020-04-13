package org.loy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient(name = "${provider.loy.name}")
public interface LoyProviderApi {
    @RequestMapping("/doCall")
    String doCall(Map<String,Object> params);
}
