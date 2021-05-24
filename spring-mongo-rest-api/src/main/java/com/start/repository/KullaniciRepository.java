package com.start.repository;

import com.start.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KullaniciRepository extends MongoRepository<Kullanici,String>
{
    //MongoRepository sayesinde interface e method olusturmak zorunda kalmadık içinde gömülü olarak var icidne gömülü istedigimiz methodlar yoksa manuel ekleyebiliriz.
}
