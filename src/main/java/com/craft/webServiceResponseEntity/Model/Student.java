package com.craft.webServiceResponseEntity.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
	
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String email;

}
