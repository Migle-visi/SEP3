﻿namespace Domain.DTOs;

public class RegisterDto
{
    public string Name { get; set; }
    public string Email { get; set; }
    public string Password { get; set; }
    public string Phone { get; set; }
    public string? LicenseNumber { get; set; }
}