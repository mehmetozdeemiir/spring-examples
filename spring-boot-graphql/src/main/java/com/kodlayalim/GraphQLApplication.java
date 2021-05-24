package com.kodlayalim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
QueryResolver= api üzerinde sorgulama get türü istekler yapabilmemizi sağlayan interface ,Kayıtları datayı sorgulamak için

MutationResolver=Sunucumuzdaki birtakım resourcelerimiz yada birtakım kayıtlarımız bi verimiz var bu veriyi değiştirmek üzerine yayınlayabileceğimiz apilarımızın aslında bu classdan türetilmesi gerekiyor ,kayıtları değiştirmek üzere kullanıyoruz
 */


@SpringBootApplication
public class GraphQLApplication {
    public static void main(String[] args) {
            SpringApplication.run(GraphQLApplication.class,args);
        }
    }

