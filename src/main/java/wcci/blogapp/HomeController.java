package wcci.blogapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
		
		@Autowired
		AuthorRepository authorRepo;
		
		@Autowired
		PostRepository postRepo;
		
		@Autowired
		GenreRepository genreRepo;

		
		@RequestMapping("/home")
		public String displayAuthors(Model model) {
			model.addAttribute("authors",authorRepo.findAll());
			return "home";
		
		}

}
