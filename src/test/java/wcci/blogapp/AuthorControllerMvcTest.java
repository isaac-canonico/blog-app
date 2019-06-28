package wcci.blogapp;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Arrays;
import java.util.Collection;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(AuthorController.class)

public class AuthorControllerMvcTest {

	@Resource
	private MockMvc mvc;

	@MockBean
	private AuthorRepository authorRepo;

	@Mock
	private Author author1;

	@Mock
	private Author author2;

	@Test
	public void shouldReturnAStatusOfOk() throws Exception {
		Collection<Author> authors = Arrays.asList(author1, author2);
		when(authorRepo.findAll()).thenReturn(authors);
		mvc.perform(get("/authors")).andExpect(view().name(is("authors")));
	}
	}