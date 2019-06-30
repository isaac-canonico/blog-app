package wcci.blogapp;


import java.util.ArrayList;

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
	private GenreRepository genreRepo;
	
	@Autowired
	private TagRepository tagRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		// add date object functionality	
		
		
		Author Isaac = new Author("Isaac");
		authorRepo.save(Isaac);
		
		Genre personal = new Genre("personal");
		genreRepo.save(personal);
		
		Tag sad = new Tag("sad");
		tagRepo.save(sad);
		ArrayList<Tag> newTagList = new ArrayList<>();
		newTagList.add(sad);
		
		Post newPost = new Post(Isaac, "My Life", "this is it", "", personal, newTagList);
		postRepo.save(newPost);

			}
}

