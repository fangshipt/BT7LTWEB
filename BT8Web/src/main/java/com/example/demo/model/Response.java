package com.example.demo.model;

import java.util.List;

import com.example.demo.entity.Category;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
	
	private Boolean status;
	private String message;
	private Object body;

}
