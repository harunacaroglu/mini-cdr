package com.cdr.minicdr.controller;

import com.cdr.minicdr.dto.CdrRequestDto;
import com.cdr.minicdr.dto.CdrResponseDto;
import com.cdr.minicdr.service.CDRService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cdrs")
public class CDRController {

    private final CDRService cdrService;

    public CDRController(CDRService cdrService) {
        this.cdrService = cdrService;
    }

    @PostMapping
    public ResponseEntity<CdrResponseDto> saveCDR(@RequestBody CdrRequestDto cdr) {
        return ResponseEntity.ok(cdrService.saveCDR(cdr));
    }

    @GetMapping
    public ResponseEntity<List<CdrResponseDto>> getAllCDRs() {
        return ResponseEntity.ok(cdrService.getAllCDRs());
    }

    @PostMapping("/bulk")
    public ResponseEntity<List<CdrResponseDto>> saveAllCDRs(@RequestBody List<CdrRequestDto> cdrList) {
        return ResponseEntity.ok(cdrService.saveAllCDRs(cdrList));
    }

    @GetMapping("/by-caller/{aNumber}")
    public ResponseEntity<List<CdrResponseDto>> getCDRsByANumber(@PathVariable String aNumber) {
        return ResponseEntity.ok(cdrService.getCDRsByANumber(aNumber));
    }

    @GetMapping("/by-receiver/{bNumber}")
    public ResponseEntity<List<CdrResponseDto>> getCDRsByBNumber(@PathVariable String bNumber) {
        return ResponseEntity.ok(cdrService.getCDRsByBNumber(bNumber));
    }

    @PostMapping("/test")
    public String test(@RequestBody CdrRequestDto cdr) {
        return "aNumber: " + cdr.getANumber() + ", bNumber: " + cdr.getBNumber();
    }
}
