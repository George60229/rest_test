package com.epam.spm;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component("giftCertificate")
public class Gift_certificate {


    private Integer certificate_id;


    private String name;
    private String description;
    private int price;
    private int duration;

    private LocalDateTime create_date;

    private LocalDateTime last_update_date;


    public Integer getId() {
        return certificate_id;
    }

    public void setId(Integer id) {
        this.certificate_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDateTime getCreate_date() {
        return create_date;
    }

    public void setCreate_date(LocalDateTime create_date) {
        this.create_date = create_date;
    }

    public LocalDateTime getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(LocalDateTime last_update_date) {
        this.last_update_date = last_update_date;
    }
}

