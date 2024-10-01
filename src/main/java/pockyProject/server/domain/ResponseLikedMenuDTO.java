package pockyProject.server.domain;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pockyProject.server.controller.converter.StringListConvert;
import pockyProject.server.entity.LikeMenuEntity;
import pockyProject.server.entity.UserEntity;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseLikedMenuDTO {

    private  int age;

    private String userId;

    private String nickname;

    private String menuName;

    private int menuImage;

    private String bread;

    private List<String> sauce;

    private List<String> topping;


    public ResponseLikedMenuDTO FromLikeEntity(LikeMenuEntity user) {
        return  new ResponseLikedMenuDTO(
                user.getAge(),
                user.getUserId(),
                user.getMenuName(),
                user.getNickname(),
                user.getMenuImage(),
                user.getBread(),
                user.getSauce(),
                user.getTopping());
    }
}
