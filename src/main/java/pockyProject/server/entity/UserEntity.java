package pockyProject.server.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pockyProject.server.domain.res.ResponseUserDto;
import pockyProject.server.domain.res.UserJoinDTO;

@Getter
@Builder
@Entity
@Table(name = "user")
@AllArgsConstructor
public class UserEntity {

    @Id
    @Column(name = "id")
    private  String userUid;

    private  String nickname;

    private  int age;

    @Column(name = "userimage")
    private  String userImage;

    public UserEntity() {

    }

    public static UserEntity JoinToEntity(UserJoinDTO userDto) {
        UserEntity userEntity = UserEntity.builder()
                .userUid(userDto.getUserUid())
                .nickname(userDto.getNickname())
                .age(userDto.getAge())
                .userImage(userDto.getUserImage())
                .build();
        return userEntity;
    }
}
