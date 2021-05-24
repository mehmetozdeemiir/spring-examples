package com.kodlayalim.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

//Redis e bağlanmamızı sağlayan class

@Configuration
@EnableCaching //cachelemek istersek bunu yazıyoruz fakat servicedeki methodun cachelenmesi içinde ayrı bir özellik eklenmeli
public class AppConfiguration {
    @Bean
    public JedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration("localhost", 1453);
        return new JedisConnectionFactory(redisStandaloneConfiguration);
    } //İhtiyac duyduğumuzda connection yaratıp verecek

    @Bean
    public RedisTemplate redisTemplate() {
        RedisTemplate template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory());
        return template;
        //redis üzerinde işlemler yapabilmek
    }

}
