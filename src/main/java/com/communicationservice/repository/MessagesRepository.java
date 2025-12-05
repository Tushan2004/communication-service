package com.communicationservice.repository;

import com.communicationservice.entity.Messages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessagesRepository extends JpaRepository<Messages, Long> {

    List<Messages> findBySender_IdOrReceiver_IdOrderByDateSentAsc(Long senderId, Long receiverId);

    List<Messages> findByParent_IdOrderByDateSentAsc(Long parentId);
}