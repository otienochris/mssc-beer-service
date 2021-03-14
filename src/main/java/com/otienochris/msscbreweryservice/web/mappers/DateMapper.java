package com.otienochris.msscbreweryservice.web.mappers;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Component
public class DateMapper {
    public OffsetDateTime asOffSetDateTime(Timestamp ts){
        LocalDateTime ldt = ts.toLocalDateTime();
        if(ts == null)
            return null;
        return OffsetDateTime.of(ldt.getYear(), ldt.getMonthValue(), ldt.getDayOfMonth(),
                    ldt.getHour(), ldt.getMinute(), ldt.getSecond(),
                    ldt.getNano(), ZoneOffset.UTC);
    }

    public Timestamp asTimestamp(OffsetDateTime osdt){
        if (osdt == null) return null;
        return Timestamp.valueOf(osdt.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime());
    }
}
