package pockyProject.server.dao;

import pockyProject.server.entity.UserEntity;

import java.util.List;

public interface UserDAO {

    UserEntity insertUser(UserEntity userEntity);


    List<UserEntity> selectAllUser();
}
