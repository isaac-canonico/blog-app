package wcci.blogapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

}
