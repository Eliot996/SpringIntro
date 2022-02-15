package com.example.springintro.services;

import java.time.LocalDate;

public class IsItFriday {

    public String getDayOfTheWeek() {
        LocalDate localDate = LocalDate.now();

        int q = localDate.getDayOfMonth();

        int m = localDate.getMonthValue();
        if (m <= 3) m += 12; // adjust to make work,

        int j = localDate.getYear() / 100;

        int k = localDate.getYear() % 100;


        // first calculation
        int h =  (q + ((13 * (m + 1)) / 5) + k + (k/4) + (j/4) - (2*j)) % 7;

        // second part of the calculation
        int d = ((h + 5) % 7) + 1;

        String day = "";
        switch (d) {
            case 0:  day = "saturday";
                break;
            case 1:  day = "sunday";
                break;
            case 2:  day = "monday";
                break;
            case 3:  day = "tuesday";
                break;
            case 4:  day = "wednesday";
                break;
            case 5:  day = "thursday";
                break;
            case 6:  day = "friday";
                break;

        }

        return day;
    }

}
