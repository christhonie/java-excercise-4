package za.co.idealogic.javaexercise.services;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.idealogic.javaexercise.domain.Message;
import za.co.idealogic.javaexercise.repository.MessageRepository;

@Service
@Transactional
public class PersistenceService {
	
	@Autowired
	private MessageRepository messageRepository;

	public boolean addMessage(String message, Instant datetime) {
		Message msg = new Message();
		msg.setDateStamp(datetime);
		msg.setMessage(message);
		try {
			messageRepository.save(msg);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public List<String> getMessages(){
		return messageRepository.findAll().stream()
				.map(message -> message.getMessage())
				.collect(Collectors.toList());
	}
}
