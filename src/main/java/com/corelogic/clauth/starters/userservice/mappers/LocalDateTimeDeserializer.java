package com.corelogic.clauth.starters.userservice.mappers;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;

public class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {
    public LocalDateTimeDeserializer() {
    }

    public LocalDateTime deserialize(JsonParser parser, DeserializationContext ctx) throws IOException {
        try {
            long longValue = parser.getLongValue();
            return Instant.ofEpochSecond(longValue).atZone(ZoneId.systemDefault()).toLocalDateTime();
        } catch (DateTimeParseException var5) {
            return null;
        } catch (JsonParseException var6) {
            return null;
        }
    }
}