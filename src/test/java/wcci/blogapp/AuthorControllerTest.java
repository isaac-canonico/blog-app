package wcci.blogapp;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class AuthorControllerTest {
	
		@InjectMocks
		AuthorController underTest;

		@Mock
		AuthorRepository mockRepo;

		@Mock
		Model mockModel;

		@Before
		public void setup() {
			MockitoAnnotations.initMocks(this);
		}

		@Test
		public void getAllAuthorsReturnsAllAuthors() {
			Author testAuthor = new Author();
			List<Author> testAuthors = Collections.singletonList(testAuthor);
			Mockito.when(mockRepo.findAll()).thenReturn(testAuthors);
			underTest.displayAuthors(mockModel);
			Mockito.verify(mockModel).addAttribute("authors", testAuthors);
		}

	}


