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
	
	@Autowired
	AuthorRepository authorRepo;
	
	@Autowired
	GenreRepository genreRepo;

	@RequestMapping("/posts")
	public String getPosts(Model model) {
		model.addAttribute("posts", postRepo.findAll());
		return "posts";
		
	}
	
	@RequestMapping("/posts/{id}")
	public String getPost(@PathVariable("id") Long id, Model model) {
		model.addAttribute("post", postRepo.findById(id).get());
		return "post";
	}
	@PostMapping("/posts/add")
	public String addPost(Author author, String title, String body, Genre genre, ArrayList<Tag> tags) {
		Post newPost = new Post (author, title, body, genre, tags);
		postRepo.save(newPost);
		return "redirect:/posts/";
	}

}
