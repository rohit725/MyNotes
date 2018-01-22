package com.digipodium.mynotes;

import android.arch.persistence.room.TypeConverter;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Converters {
    DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    @TypeConverter
    public static Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long dateToTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }

    @TypeConverter
    public OffsetDateTime toOffsetDateTime(String value){
        return value == null ? null : OffsetDateTime.from(formatter.parse(value));
    }

    @TypeConverter
    public String fromOffsetDateTime(OffsetDateTime date){
        return date == null ? null : date.format(formatter);
    }

}
