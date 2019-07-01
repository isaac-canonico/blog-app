package wcci.blogapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TagController {

		
		@Autowired
		PostRepository postRepo;
		
		
		@Autowired
		TagRepository tagRepo;

		@RequestMapping("/tags")
		public String getTags(Model model) {
			model.addAttribute("tag", tagRepo.findAll());
			return "tags";
			
		}
		
		@RequestMapping("tags/{id}")
		public String getTag(@PathVariable("id") Long id, Model model) {
			model.addAttribute("tag", tagRepo.findById(id).get());
			return "tag";
		}
		@PostMapping("tags/add")
		public String addTag(String name) {
			Tag tagAdded = new Tag(name);
			tagRepo.save(tagAdded);
			return "redirect:/tags/" ;
		}

	}



