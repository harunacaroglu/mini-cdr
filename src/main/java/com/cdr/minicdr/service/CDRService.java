package com.cdr.minicdr.service;

import com.cdr.minicdr.dto.CdrRequestDto;
import com.cdr.minicdr.dto.CdrResponseDto;

import java.util.List;

public interface CDRService {
    CdrResponseDto saveCDR(CdrRequestDto cdrRequestDto);
    List<CdrResponseDto> saveAllCDRs(List<CdrRequestDto> cdrList);
    List<CdrResponseDto> getAllCDRs();
    List<CdrResponseDto> getCDRsByANumber(String aNumber);
    List<CdrResponseDto> getCDRsByBNumber(String bNumber);
}

