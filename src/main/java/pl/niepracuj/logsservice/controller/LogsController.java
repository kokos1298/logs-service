package pl.niepracuj.logsservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.niepracuj.logsservice.mapper.LogMapper;
import pl.niepracuj.logsservice.model.LogDto;
import pl.niepracuj.logsservice.service.log.LogService;

@RestController
@RequestMapping("/logs")
@RequiredArgsConstructor
public class LogsController {

    private final LogService logService;

    @PostMapping
    public LogDto createLog(@RequestBody LogDto logDto) {

        return logService.saveLog(logDto);
    }
}

