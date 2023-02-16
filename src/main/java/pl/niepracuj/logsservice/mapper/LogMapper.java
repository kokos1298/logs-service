package pl.niepracuj.logsservice.mapper;

import org.mapstruct.Mapper;
import pl.niepracuj.logsservice.model.Log;
import pl.niepracuj.logsservice.model.LogDto;

@Mapper(componentModel = "spring")
public interface LogMapper {


        LogDto logToLogDto(Log log);

        Log logDtoToLog(LogDto logDto);

}