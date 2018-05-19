package com.example.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class DemoApplication {

	@RequestMapping(value="/api", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	List<Post> listPosts() {
		List<Post> posts = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			posts.add(new Post(Long.valueOf(i), "Test Title " + i, "Lorem ipsum"));
		}
		return posts;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
