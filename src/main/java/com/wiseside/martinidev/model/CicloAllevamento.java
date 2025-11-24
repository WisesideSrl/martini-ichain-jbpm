package com.wiseside.martinidev.model;

import java.io.Serializable;
import java.time.LocalDate;

public class CicloAllevamento implements Serializable{
    private static final long serialVersionUID=-1;

    public String codiceCiclo;

    public LocalDate dataInizioPianificata;

    public Integer numeroMaschi;

    public Integer numeroFemmine;

}
