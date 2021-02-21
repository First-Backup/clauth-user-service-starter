package com.corelogic.clauth.starters.userservice.mappers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;

public class LocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {
    public LocalDateTimeSerializer() {
    }

    public void serialize(LocalDateTime value, JsonGenerator jsonGenerator, SerializerProvider provider) throws IOException {
        try {
            jsonGenerator.writeNumber(value.atZone(ZoneId.systemDefault()).toEpochSecond());
        } catch (DateTimeParseException var5) {
            jsonGenerator.writeString("");
        }

    }
}