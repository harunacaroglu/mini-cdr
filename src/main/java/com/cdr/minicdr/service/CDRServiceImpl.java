package com.cdr.minicdr.service;

import com.cdr.minicdr.model.CDR;
import com.cdr.minicdr.repository.CDRRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CDRServiceImpl implements CDRService {

    private final CDRRepository cdrRepository;

    public CDRServiceImpl(CDRRepository cdrRepository) {
        this.cdrRepository = cdrRepository;
    }

    @Override
    public CDR saveCDR(CDR cdr) {
        return cdrRepository.save(cdr);
    }

    @Override
    public List<CDR> saveAllCDRs(List<CDR> cdrList) {
        return cdrRepository.saveAll(cdrList);
    }

    @Override
    public List<CDR> getAllCDRs() {
        return cdrRepository.findAll();
    }

    @Override
    public List<CDR> getCDRsByANumber(String aNumber) {
        return cdrRepository.findByaNumber(aNumber);
    }

    @Override
    public List<CDR> getCDRsByBNumber(String bNumber) {
        return cdrRepository.findBybNumber(bNumber);
    }
}
