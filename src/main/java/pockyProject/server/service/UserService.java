package pockyProject.server.service;

import pockyProject.server.domain.res.ResponseLikedMenuDTO;
import pockyProject.server.domain.res.ResponseUserDto;
import pockyProject.server.domain.res.UserJoinDTO;
import pockyProject.server.entity.RecommendEntity;

import java.util.List;

public interface UserService {

    ResponseUserDto saveUser(ResponseUserDto userDto);


    List<RecommendEntity> getRecommendList();


    ResponseLikedMenuDTO saveLikedMenu(ResponseLikedMenuDTO userDto);


    void joinUser(UserJoinDTO userDto);
}
