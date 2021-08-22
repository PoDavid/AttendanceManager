package church.morningclass.attendancemanager.service;

import java.util.Optional;

import church.morningclass.attendancemanager.model.dto.UserDTO;
import church.morningclass.attendancemanager.model.entity.User;
import church.morningclass.attendancemanager.model.helper.Mapper;
import church.morningclass.attendancemanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    private Mapper mapper;

    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    public User createUser(UserDTO request) {
        User userDB = mapper.mapUserDTO(request);
        return userRepository.save(userDB);
    }


}
