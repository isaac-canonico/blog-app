package wcci.blogapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JpaWiringTest {

		@Autowired
		private TestEntityManager entityManager;
		
		@Autowired
		private PostRepository postRepo;
		
		@Autowired
		private AuthorRepository authorRepo;
		
		@Autowired
		private GenreRepository genreRepo;
		
		@Autowired
		private TagRepository tagRepo;

		@Test
		public void shouldStartTestingFramework() {
			Author Isaac = new Author("Isaac");
			Genre personal = new Genre("personal");
			Tag sad = new Tag("sad");
			genreRepo.save(personal);
			tagRepo.save(sad);			
			authorRepo.save(Isaac);
			
			// how to add tag in constructor //
			Post testPost = new Post(Isaac, "My Life", "This is it", "date", personal, tag);
			postRepo.save(testPost);
			
			entityManager.flush();
			entityManager.clear();

			Post retrievedPost = postRepo.findById(testPost.getId()).get();
			Author retrievedAuthor = authorRepo.findById(Isaac.getId()).get();
		
			assertEquals(Isaac, retrievedAuthor);
			assertEquals(testPost, retrievedPost);
			
		}
}



