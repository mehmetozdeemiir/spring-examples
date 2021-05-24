package com.kodlayalim.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    @Cacheable(cacheNames = "mySpecialCache") //methodu cache ledik bu sayede 5 saniyede gelen veri artık 5 milisaniyede geliyor
    public String longRunningMethod() throws InterruptedException
    {
        Thread.sleep(5000L);
        return "method çalıştı";
    }
    @CacheEvict(cacheNames = "mySpecialCache")
    public void clearCache(){
        System.out.println("cache temizlendi"); //bu method cache deki verileri temizliyo her zaman hızlı olsun diye
    }
}
/*
Redis i neden kullanılırım?
    -10 saniye süren bir calculation var ve aynı parametreler verilince hep aynı sonucu veriyor bunu tekrar tekrar hesaplatmak yerine cache e koyabilirsin amaç sık kullanılan maliyetli şeylerde süreci hızlandırmak
    -Önemli nokta cache in temizlenmesi data değiştiği zaman cacheler sıfırlanmalı yoksa eski datayı okursun bundaki amac data birikmesini önlemek değil tam olarak eski datayı tekrardan vermemek yeni gelen datayı göndermek
    -Redis in amacı db ye gitmemek redis ile halletmek
    -Mesela banka parayı cache den verse ve temizlenmese cache i para yatırdığın zaman ne olur 100 tl var hesabında 50 tl daha yatırdın cache temizlenmezse bankada hala 100 tl görürsün ama db de 150 tl vardır
 */
