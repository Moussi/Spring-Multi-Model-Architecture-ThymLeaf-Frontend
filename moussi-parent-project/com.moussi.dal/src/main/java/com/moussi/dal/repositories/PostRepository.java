package com.moussi.dal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.moussi.dom.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

	@Query("select t from Post t where nom = :nom")
	Post findPostByName(@Param("nom")String nom);
	
}
