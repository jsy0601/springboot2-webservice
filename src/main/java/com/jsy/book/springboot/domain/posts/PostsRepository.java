package com.jsy.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts,Long> {

    @Query(value = "SELECT * FROM POSTS p ORDER BY p.id DESC", nativeQuery = true)
    List<Posts> findAllDesc();


}
