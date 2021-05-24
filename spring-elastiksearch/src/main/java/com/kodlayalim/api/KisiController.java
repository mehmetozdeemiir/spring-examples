package com.kodlayalim.api;

import com.kodlayalim.repo.KisiRepository;
import com.kodlayalim.entity.kisi;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor//constructor ekliyor repo icin Lombok özelliği
@RequestMapping("/kisi")
public class KisiController {
    @Autowired
    private KisiRepository kisiRepository;

    @GetMapping("/{search}")
    public ResponseEntity<List<kisi>> getKisi(@PathVariable String search)
    {
       List<kisi> kisiler= kisiRepository.getByCustomQuery(search);
       return ResponseEntity.ok(kisiler);
    }
}
