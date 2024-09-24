package pockyProject.server.domain;

import lombok.*;
import pockyProject.server.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseUserDto {


    private  String  userId;

    private String menuName;

    private  String nickname;

    private  String price;

    private int menuImage;

    private String bread;

    private List<String> sauce=new ArrayList<>();

    private List<String> topping=new ArrayList<>();

    private String side;

    private  Boolean liquid;


    public ResponseUserDto FromEntity(UserEntity user) {
     return  new ResponseUserDto(
             user.getUserId(),
             user.getMenuName(),
             user.getNickname(),
             user.getPrice(),
             user.getMenuImage(),
             user.getBread(),
             user.getSauce(),
             user.getTopping(),
             user.getSide(),
             user.getLiquid());
    }

}
