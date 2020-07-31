package za.co.idealogic.javaexercise.services;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersistenceService {

	public boolean addMessage(String message, Instant datetime) {
		//TODO Add implementation
		return false;
	}
	
	public List<String> getMessages(){
		//TODO Add implementation. For now we return an empty list.
		return new ArrayList<>();
	}
}
