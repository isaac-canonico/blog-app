package wcci.blogapp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements CommandLineRunner {

	@Autowired
	private PostRepository postRepo;
	
	@Autowired
	private AuthorRepository authorRepo;
	
	@Autowired
	private genreRepository genreRepo;
	
	@Autowired
	private TagRepository tagRepo;
	
	
	// add date object functionality	
	
	private Genre personal;

	private Tag sad;
	
	@Override
	public void run(String... args) throws Exception {
		
		Author Isaac = new Author("Isaac");
		authorRepo.save(Isaac);
		
		Genre personal = new Genre("personal");
		genreRepo.save(personal);
		
		Tag sad = new Tag("sad");
		tagRepo.save(sad);
		
		
		postRepo.save(new Post(Isaac, "My Life", "this is it", "", personal, sad));

			}
}
}
