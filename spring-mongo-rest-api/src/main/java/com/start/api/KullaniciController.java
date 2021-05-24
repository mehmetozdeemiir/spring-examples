package com.start.api;

import com.start.entity.Kullanici;
import com.start.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciController {

    @Autowired
    private KullaniciRepository kullaniciRepository;

    @PostMapping
    public ResponseEntity<Kullanici> ekle(@RequestBody Kullanici kullanici)
{
    return  ResponseEntity.ok(kullaniciRepository.save(kullanici));
}
    @GetMapping
    public ResponseEntity <List<Kullanici>> tumunuListele()
    {
        return  ResponseEntity.ok(kullaniciRepository.findAll());
    }

}
