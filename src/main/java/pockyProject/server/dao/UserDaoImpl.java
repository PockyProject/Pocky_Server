package pockyProject.server.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pockyProject.server.entity.UserEntity;
import pockyProject.server.repository.UserRepository;

import java.util.List;

@RequiredArgsConstructor
@Component
public class UserDaoImpl implements  UserDAO{

    private  final UserRepository userRepository;
    @Override
    public UserEntity insertUser(UserEntity userEntity) {


        return userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> selectAllUser() {
        return userRepository.findAll();
    }
}
