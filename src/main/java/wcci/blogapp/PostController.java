package wcci.blogapp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {
	
	@Autowired
	PostRepository postRepo;

	@RequestMapping("/posts")
	public String getPosts(Model model) {
		model.addAttribute("posts", postRepo.findAll());
		return "posts";
		
		// NEEDS POST TEMPLATE //
	}
	
	@RequestMapping("/{id}")
	public String getPost(@PathVariable("id") Long id, Model model) {
		model.addAttribute("review", postRepo.findById(id).get());
		return "post";
	}
	@PostMapping("/add")
	public String addPost(Author author, String title, String body, String date, Genre genre, ArrayList<Tag> tags) {
		postRepo.save(new Post(author, title, body, date, genre, tags));
		return "redirect:/reviews/";
	}

}
