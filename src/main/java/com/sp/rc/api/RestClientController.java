package com.sp.rc.api;

import com.sp.rc.api.model.KisiDTO;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.List;

@Controller
@RequestMapping("/test")
public class RestClientController {
    private static final String webUri="http://localhost:8081/kisi";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<List> getKisiList(){

        ResponseEntity<List> result = restTemplate.getForEntity(webUri,List.class);
        return ResponseEntity.ok(result.getBody());
    }

    @PostMapping
    public ResponseEntity<KisiDTO> kaydet(@RequestBody KisiDTO kisiDTO){

        restTemplate.postForEntity(webUri,kisiDTO,KisiDTO.class);

        return ResponseEntity.ok(kisiDTO);
    }
}