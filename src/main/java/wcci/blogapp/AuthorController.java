package wcci.blogapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
	
	AuthorRepository authorRepo;
	
	@RequestMapping("/authors") 
	public String displayAuthors(Model model) {
		model.addAttribute("authors",authorRepo.findAll());
		return "authors";
		// NEED HTML TEMPLATE ABOVE

	}

}
