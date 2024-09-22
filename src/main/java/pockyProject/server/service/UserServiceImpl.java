package pockyProject.server.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pockyProject.server.dao.UserDAO;
import pockyProject.server.domain.RequestMenuDto;
import pockyProject.server.domain.ResponseUserDto;
import pockyProject.server.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

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
        UserEntity userEntity = UserEntity.builder()
                .userId(userDto.getUserId())
                .nickname(userDto.getNickname())
                .topping(userDto.getTopping())
                .bread(userDto.getBread())
                .sauce(userDto.getSauce())
                .liquid(userDto.getLiquid())
                .side(userDto.getSide())
                .price(userDto.getPrice())
                .menuImage(userDto.getMenuImage())
                .build();

        // UserEntity 저장
        UserEntity savedEntity = userDAO.insertUser(userEntity);

        return ResponseUserDto.builder()
                .userId(savedEntity.getUserId())
                .nickname(savedEntity.getNickname())
                .topping(savedEntity.getTopping())
                .bread(savedEntity.getBread())
                .liquid(savedEntity.getLiquid())
                .sauce(savedEntity.getSauce())
                .side(savedEntity.getSide())
                .price(savedEntity.getPrice())
                .menuImage(savedEntity.getMenuImage())
                .build();
    }

    public List<UserEntity> getAll(){
        UserEntity user=new UserEntity();

        ResponseUserDto userDto=new ResponseUserDto();

        return userDAO.selectAllUser();
    }
}
