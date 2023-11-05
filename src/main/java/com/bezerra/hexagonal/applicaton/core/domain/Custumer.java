package com.bezerra.hexagonal.applicaton.core.domain;

public class Custumer {

    public Custumer(){
        this.isValidCpf = false;
    }
    public Custumer(String id, String name, Address address, String cpf, Boolean isValidCpf) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
    }

    private String id;
    private String name;
    private Address address;
    private String cpf;
    private Boolean isValidCpf;
}
