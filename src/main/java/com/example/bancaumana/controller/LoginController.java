package com.example.bancaumana.controller;

import org.springframework.hateoas.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
public class LoginController {
	@PostMapping
	public ResponseEntity<UserResource> postLogin(@RequestBody LoginDto loginDto) {
		if (loginDto.getPassword() != null && !loginDto.getPassword().trim().isEmpty()) {
			UserModel model = new UserModel();
			model.setUsername(loginDto.getUsername());
			model.setFullname(loginDto.getPassword());
			return ResponseEntity.ok(new UserResource(model));
		} else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}
	
	public static class UserResource extends Resource<UserModel> {
		public UserResource() {
			super(new UserModel());
		}
		
		UserResource(UserModel model) {
			super(model);
		}
	}

	private static class UserModel {
		private String username;
		private String fullname;

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getFullname() {
			return fullname;
		}

		public void setFullname(String fullname) {
			this.fullname = fullname;
		}

	}

	public static class LoginDto {
		private String username;
		private String password;

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	}
}
