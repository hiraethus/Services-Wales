package com.clackjones.cymraeg;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GwasanaethEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String enw;
    private String rhifFfon;

    public Long getId() {
        return id;
    }

    public String getEnw() {
        return enw;
    }

    public void setEnw(String enw) {
        this.enw = enw;
    }

    public String getRhifFfon() {
        return rhifFfon;
    }

    public void setRhifFfon(String rhifFfon) {
        this.rhifFfon = rhifFfon;
    }
}
