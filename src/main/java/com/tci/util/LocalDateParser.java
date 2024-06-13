package com.tci.util;

import com.fasterxml.jackson.core.JsonParseException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class LocalDateParser {

    public static LocalDate stringToLocalDate(String date) throws JsonParseException {
//        String inputDate = date;
        String formattedInputDate = capitalizeMonth(date);
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy", Locale.ENGLISH);
        try {
            LocalDate localDate = LocalDate.parse(formattedInputDate, inputFormatter);
            System.out.println("formatting "+ localDate);
            return localDate;

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format: " + e.getMessage());
            throw new JsonParseException("Invalid date format: " + e.getMessage());
        }
    }

    private static String capitalizeMonth(String date) {
        String[] parts = date.split("-");
        parts[0] = parts[0].substring(0, 1).toUpperCase() + parts[0].substring(1);
        return String.join("-", parts);
    }

    public static String localDateToTextFormat(LocalDate date) {
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy", Locale.ENGLISH);
        String formattedDate = date.format(outputFormatter);
        System.out.println("Formatted Date to text: " + formattedDate);
        return formattedDate;
    }

}
