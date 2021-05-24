package com.kodlayalim.api;

import com.kodlayalim.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RedisCacheController {

    private int sayac=0;

   @Autowired
    RedisCacheService redisCacheService;

    @GetMapping
    public String cacheControl() throws InterruptedException
    {
        if(sayac==5){
            redisCacheService.clearCache();
            sayac=0;
            //5tanede bir cache nin içini sil temizle
        }
        sayac++;
        return redisCacheService.longRunningMethod(); //
    }
}
