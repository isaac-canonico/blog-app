package wcci.blogapp;

import javax.annotation.Resource;

import org.springframework.data.repository.CrudRepository;

@Resource

public interface AuthorRepository extends CrudRepository<Author, Long> {
	

}
