package com.eazybytes.accounts.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Setter @Getter @ToString
public class BaseEntity {

    @Column(updatable = false)
    private LocalDateTime createdAt;
    @Column(insertable = false)
    private String createdBy;
    @Column(updatable = false)
    private LocalDateTime updatedAt;
    @Column(insertable = false)
    private String updatedBy;
}
