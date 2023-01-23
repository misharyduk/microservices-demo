package com.mikrud.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
