package pockyProject.server.service;

import pockyProject.server.domain.ResponseUserDto;
import pockyProject.server.entity.UserEntity;

import java.util.List;

public interface UserService {

    ResponseUserDto saveUser(ResponseUserDto userDto);


    List<UserEntity> getAll();

}
