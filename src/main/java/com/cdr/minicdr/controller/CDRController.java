package com.cdr.minicdr.controller;

import com.cdr.minicdr.model.CDR;
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
    public ResponseEntity<CDR> saveCDR(@RequestBody CDR cdr) {
        return ResponseEntity.ok(cdrService.saveCDR(cdr));
    }

    @GetMapping
    public ResponseEntity<List<CDR>> getAllCDRs() {
        return ResponseEntity.ok(cdrService.getAllCDRs());
    }

    @PostMapping("/test")
    public String test(@RequestBody CDR cdr) {
        return "aNumber: " + cdr.getANumber() + ", bNumber: " + cdr.getBNumber();
    }

    @PostMapping("/bulk")
    public ResponseEntity<List<CDR>> saveAllCDRs(@RequestBody List<CDR> cdrList) {
        return ResponseEntity.ok(cdrService.saveAllCDRs(cdrList));
    }

    @GetMapping("/by-caller/{aNumber}")
    public ResponseEntity<List<CDR>> getCDRsByANumber(@PathVariable String aNumber) {
        return ResponseEntity.ok(cdrService.getCDRsByANumber(aNumber));
    }

    @GetMapping("/by-receiver/{bNumber}")
    public ResponseEntity<List<CDR>> getCDRsByBNumber(@PathVariable String bNumber) {
        return ResponseEntity.ok(cdrService.getCDRsByBNumber(bNumber));
    }
}
