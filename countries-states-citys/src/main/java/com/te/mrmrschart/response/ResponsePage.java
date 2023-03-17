package com.te.mrmrschart.response;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponsePage {

	private Boolean errorMessage;
	private String message;
	private Object data;
}
