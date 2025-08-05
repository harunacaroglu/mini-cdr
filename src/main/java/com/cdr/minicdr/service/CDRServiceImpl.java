package com.cdr.minicdr.service;

import com.cdr.minicdr.dto.CdrRequestDto;
import com.cdr.minicdr.dto.CdrResponseDto;
import com.cdr.minicdr.model.CDR;
import com.cdr.minicdr.repository.CDRRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CDRServiceImpl implements CDRService {

    private final CDRRepository cdrRepository;

    public CDRServiceImpl(CDRRepository cdrRepository) {
        this.cdrRepository = cdrRepository;
    }

    @Override
    public CdrResponseDto saveCDR(CdrRequestDto dto) {
        CDR entity = mapToEntity(dto);
        CDR saved = cdrRepository.save(entity);
        return mapToDto(saved);
    }

    @Override
    public List<CdrResponseDto> saveAllCDRs(List<CdrRequestDto> dtoList) {
        List<CDR> entities = dtoList.stream()
                .map(this::mapToEntity)
                .collect(Collectors.toList());
        List<CDR> savedList = cdrRepository.saveAll(entities);
        return savedList.stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<CdrResponseDto> getAllCDRs() {
        return cdrRepository.findAll()
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<CdrResponseDto> getCDRsByANumber(String aNumber) {
        return cdrRepository.findByaNumber(aNumber)
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<CdrResponseDto> getCDRsByBNumber(String bNumber) {
        return cdrRepository.findBybNumber(bNumber)
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    private CDR mapToEntity(CdrRequestDto dto) {
        CDR entity = new CDR();
        entity.setANumber(dto.getANumber());
        entity.setBNumber(dto.getBNumber());
        entity.setImsi(dto.getImsi());
        entity.setImei(dto.getImei());
        entity.setDirection(dto.getDirection());
        entity.setResult(dto.getResult());
        entity.setSetupDuration(dto.getSetupDuration());
        entity.setConversationDuration(dto.getConversationDuration());
        entity.setStartTime(dto.getStartTime());
        entity.setEndTime(dto.getEndTime());
        entity.setCellId(dto.getCellId());
        entity.setLacId(dto.getLacId());
        return entity;
    }

    private CdrResponseDto mapToDto(CDR entity) {
        CdrResponseDto dto = new CdrResponseDto();
        dto.setId(entity.getId());
        dto.setANumber(entity.getANumber());
        dto.setBNumber(entity.getBNumber());
        dto.setImsi(entity.getImsi());
        dto.setImei(entity.getImei());
        dto.setDirection(entity.getDirection());
        dto.setResult(entity.getResult());
        dto.setSetupDuration(entity.getSetupDuration());
        dto.setConversationDuration(entity.getConversationDuration());
        dto.setStartTime(entity.getStartTime());
        dto.setEndTime(entity.getEndTime());
        dto.setCellId(entity.getCellId());
        dto.setLacId(entity.getLacId());
        return dto;
    }
}
