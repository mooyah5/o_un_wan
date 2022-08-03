package com.sos.owo.service;


import com.sos.owo.domain.repository.RecordRepository;
import com.sos.owo.dto.RecordDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RecordService {

    private final RecordRepository recordRepository;

    @Transactional
    public void registRecord(RecordDto recordDto) {
        recordRepository.registRecord(recordDto);
    }
}