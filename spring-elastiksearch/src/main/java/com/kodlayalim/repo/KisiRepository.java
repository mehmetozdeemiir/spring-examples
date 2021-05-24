package com.kodlayalim.repo;

import com.kodlayalim.entity.kisi;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KisiRepository extends ElasticsearchRepository<kisi,String> {

    @Query("{\"bool\":{\"must\":[\"match\":{\"ad\":\"?0\"}}]}}")
    List<kisi> getByCustomQuery(String search);
}
