package example.com.sample;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Uranai {

    private String[] luckArray = {

        "超スッキリ", "スッキリ", "最悪"

    };

    private int index;

    public Uranai() {

        index = (int) (Math.random() * 3);

    }

    public String getDate() {

        LocalDate date = LocalDate.now();

        DateTimeFormatter formatter =

                DateTimeFormatter.ofPattern("MM月dd日");

        return date.format(formatter);

    }

    public String getLuck() {

        return luckArray[index];

    }

}
 