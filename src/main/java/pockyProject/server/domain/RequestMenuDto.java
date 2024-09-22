package pockyProject.server.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import pockyProject.server.entity.UserEntity;

@Getter
@Setter
@RequiredArgsConstructor

public class RequestMenuDto {

    private  String  userId;

    private  String nickname;


    private  String bread;

    private  String topping;

    private  String price;


    public RequestMenuDto(UserEntity user) {

        userId=user.getUserId();
        nickname=user.getNickname();
        bread=user.getBread();
     //   topping=user.getTopping();
    }
}
