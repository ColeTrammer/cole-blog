package org.jointheleague.coleblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

	@Autowired
	DataLoader dataLoader;

	@GetMapping("/")
	public String posts(Model m) {
		m.addAttribute("posts", dataLoader.findAll());
		return "index";
	}

}
