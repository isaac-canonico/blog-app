package wcci.blogapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
	
	@Autowired
	AuthorRepository authorRepo;
	
	@Autowired
	PostRepository postRepo;
	
	@Autowired
	GenreRepository genreRepo;

	
	@RequestMapping("/authors")
	public String displayAuthors(Model model) {
		model.addAttribute("authors",authorRepo.findAll());
		return "authors";
	
	}
	@RequestMapping("/author/{id}")
	public String getAuthor(@PathVariable("id") Long id, Model model) {
		model.addAttribute("author", authorRepo.findById(id).get());
		return "author";
	}

}
