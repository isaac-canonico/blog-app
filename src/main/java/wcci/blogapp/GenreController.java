package wcci.blogapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
	
public class GenreController {
	
	@Autowired
	AuthorRepository authorRepo;
	
	@Autowired
	PostRepository postRepo;
	
	@Autowired
	GenreRepository genreRepo;

	@RequestMapping("/genres")
		public String getGenres(Model model) {
			model.addAttribute("genres", genreRepo.findAll());
			return "genres";
		
		}

	}


