package com.example.cubochallenge.dto;

import java.math.BigDecimal;

public record ClientDTO (
    String firstName,
    String lastName,
    BigDecimal participation
) {}
