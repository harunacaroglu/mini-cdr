package com.cdr.minicdr.service;

import com.cdr.minicdr.model.CDR;

import java.util.List;

public interface CDRService {
    CDR saveCDR(CDR cdr);
    List<CDR> getAllCDRs();
    List<CDR> getCDRsByANumber(String aNumber);
    List<CDR> getCDRsByBNumber(String bNumber);
    List<CDR> saveAllCDRs(List<CDR> cdrList);

}
