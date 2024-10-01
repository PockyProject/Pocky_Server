package pockyProject.server.service;

import pockyProject.server.domain.ResponseLikedMenuDTO;
import pockyProject.server.domain.ResponseUserDto;
import pockyProject.server.entity.RecommendEntity;

import java.util.List;

public interface UserService {

    ResponseUserDto saveUser(ResponseUserDto userDto);


    List<RecommendEntity> getRecommendList();


    ResponseLikedMenuDTO saveLikedMenu(ResponseLikedMenuDTO userDto);
}
