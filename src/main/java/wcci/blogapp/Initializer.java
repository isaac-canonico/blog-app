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

		Author Isaac = new Author("Isaac");
		authorRepo.save(Isaac);
		Author Lawrence = new Author("Lawrence");
		authorRepo.save(Lawrence);


		Genre personal = new Genre("personal");
		genreRepo.save(personal);
		Genre music = new Genre("music");
		genreRepo.save(music);
		Genre art = new Genre("art");
		genreRepo.save(art);

		Tag sad = new Tag("sad");
		tagRepo.save(sad);
		ArrayList<Tag> newTagList = new ArrayList<>();
		newTagList.add(sad);

		Post newPost = new Post(Isaac, "My Life",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
				"", personal, newTagList);
		postRepo.save(newPost);
		
		Post newPost1 = new Post(Lawrence, "My Life",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
				"", personal, newTagList);
		postRepo.save(newPost1);

	}
}
