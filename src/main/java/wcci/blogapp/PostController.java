package wcci.blogapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class PostController {
	
	@Autowired
	PostRepository postRepo;

	public String getPosts(Model model) {
		model.addAttribute("posts", postRepo.findAll());
		return "posts";
		
		// NEEDS POST TEMPLATE //
	}

}
