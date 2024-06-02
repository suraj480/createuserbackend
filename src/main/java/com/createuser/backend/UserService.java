package com.createuser.backend;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public Users createUser(Users user) {
		return userRepository.save(user);
	}

	public List<Users> getAllUsers() {
		return userRepository.findAll();
	}

	public Optional<Users> getUserById(Long id) {
		return userRepository.findById(id);
	}

	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	public Users updateUser(Users user) {
		return userRepository.save(user);
	}
}
