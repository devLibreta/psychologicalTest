package com.example.psychologicaltest.checkList.repository;

import com.example.psychologicaltest.checkList.entity.AnswerEntity;
import com.example.psychologicaltest.checkList.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<AnswerEntity, Long> {
}
