package wcci.blogapp;

import javax.annotation.Resource;

import org.springframework.data.repository.CrudRepository;

@Resource

public interface genreRepository extends CrudRepository<Genre, Long> {
	

}