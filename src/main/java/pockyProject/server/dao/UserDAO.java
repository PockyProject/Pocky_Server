package pockyProject.server.dao;

import pockyProject.server.entity.LikeMenuEntity;
import pockyProject.server.entity.RecommendEntity;
import pockyProject.server.entity.UserEntity;

import java.util.List;

public interface UserDAO {

    UserEntity insertUser(UserEntity userEntity);


    List<RecommendEntity> selectRecommendList();


    LikeMenuEntity insertLikeMenu(LikeMenuEntity likeMenuEntity);
}
