package pl.niepracuj.logsservice.service.log;

import pl.niepracuj.logsservice.model.LogDto;

public interface LogService {

    LogDto saveLog(LogDto logDto);
}
