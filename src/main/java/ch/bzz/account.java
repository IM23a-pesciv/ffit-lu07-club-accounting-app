package ch.bzz;

import lombok.Data;

@Data
public class account {
    private String id;
    private String accountNumber;
    private String name;
    private project project;
}