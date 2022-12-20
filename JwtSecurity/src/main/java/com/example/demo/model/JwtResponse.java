package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {

    public JwtResponse(String token) {
		// TODO Auto-generated constructor stub
	}

	private String jwtToken;
}
