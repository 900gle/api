package com.doo.api.repo.board;

import com.doo.api.entity.board.Board;
import com.doo.api.entity.board.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostJpaRepo extends JpaRepository<Post, Long> {
    List<Post> findByBoardOrderByPostIdDesc(Board board);
}