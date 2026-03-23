package dev.ia.domain;

import dev.ia.domain.enums.BookingStatus;
import dev.ia.domain.enums.Category;

import java.time.LocalDate;

public record Booking(
        Long id,
        String customerName,
        String destination,
        LocalDate startDate,
        LocalDate endDate,
        BookingStatus status,
        Category category
) {}
