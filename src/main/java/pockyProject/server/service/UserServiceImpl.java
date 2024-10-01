package pockyProject.server.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pockyProject.server.dao.UserDAO;
import pockyProject.server.domain.RequestMenuDto;
import pockyProject.server.domain.ResponseLikedMenuDTO;
import pockyProject.server.domain.ResponseUserDto;
import pockyProject.server.entity.LikeMenuEntity;
import pockyProject.server.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

import static pockyProject.server.entity.LikeMenuEntity.EntityFromLikeDTO;
import static pockyProject.server.entity.UserEntity.FromToEntity;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements  UserService{

    private final UserDAO userDAO;
    @Override
    public ResponseUserDto saveUser(ResponseUserDto userDto) {
        if (userDto.getSauce() == null) {
            userDto.setSauce(new ArrayList<>());
        }

        // UserDto -> UserEntity 변환 (Builder 패턴 사용)
        UserEntity userEntity = new UserEntity();
        userEntity = FromToEntity(userDto);
        // UserEntity 저장
        UserEntity savedEntity = userDAO.insertUser(userEntity);

        return  userDto.FromEntity(savedEntity);

        
    }
    @Override
    public ResponseLikedMenuDTO saveLikedMenu(ResponseLikedMenuDTO userDto) {
        // LikedDto -> LikeMenuEntity 변환
        LikeMenuEntity likeMenuEntity = new LikeMenuEntity();
        likeMenuEntity = EntityFromLikeDTO(userDto);
        // LikeMenuEntity 저장
        LikeMenuEntity savedEntity = userDAO.insertLikeMenu(likeMenuEntity);

        return  userDto.FromLikeEntity(savedEntity);

    }
    public List<UserEntity> getAll(){
        UserEntity user=new UserEntity();

        ResponseUserDto userDto=new ResponseUserDto();

        return userDAO.selectAllUser();
    }

}


//        return ResponseUserDto.builder()
//                .userId(savedEntity.getUserId())
//                .nickname(savedEntity.getNickname())
//                .topping(savedEntity.getTopping())
//                .bread(savedEntity.getBread())
//                .liquid(savedEntity.getLiquid())
//                .sauce(savedEntity.getSauce())
//                .side(savedEntity.getSide())
//                .price(savedEntity.getPrice())
//                .menuImage(savedEntity.getMenuImage())
//                .build();