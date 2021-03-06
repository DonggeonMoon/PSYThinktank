package com.mdg.PSYThinktank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdg.PSYThinktank.model.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {
	List<Board> findByBoardTitleContainingOrderByBoardNoDesc(String boardTitle);
	List<Board> findByBoardContentContainingOrderByBoardNoDesc(String boardContent);
	List<Board> findByMemberIdOrderByBoardNoDesc(String memberId);
}