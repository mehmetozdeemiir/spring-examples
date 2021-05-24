package com.kodlayalim.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;
@Document(indexName = "kisiler") //Elasticsearch’te, ilişkisel veri tabanlarındaki Rows (satırlar), Documents  olarak temsil edilirler. Her type, birden fazla document’a sahiptir.
@Getter //Lombok sayesinde daha kısa şekilde islemler
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class kisi {
    @Id
    private String id;
    @Field(name="ad",type = FieldType.Text)//Klasik veritabanlarındaki Column’lar, Elasticsearch’te Field olarak nitelendirilir. Her document bir den fazla field’a sahiptir.
    private String ad;
    @Field(name="soyad",type = FieldType.Text)
    private String soyad;
    @Field(name="adres",type = FieldType.Text)
    private String adres;
    @Field(name="dogum_tarihi",type = FieldType.Date)
    private Date dogumTarihi;

    /*
    İlişkisel veritabanları (RDBMS), indexlenmiş veriler dışındaki aramalarda oldukça yavaş bir arama performansı sağlar.
    E-ticaret ya da büyük ölçekli bir proje için istenmeyen bir durum oluşturmaktadır. Elasticsearch, büyük veriler arasında
    hız kaybı yaşanmadan arama yapılmasını sağlayan döküman tabanlı, NoSQL bir veritabanıdır. Elasticsearch’ın yapılma
    amacı aramalardaki bu kritik sorunun çözümünü sağlamaktır.
     */
}
