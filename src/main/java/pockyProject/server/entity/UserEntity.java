package pockyProject.server.entity;

import ch.qos.logback.core.testUtil.StringListAppender;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import pockyProject.server.controller.converter.StringListConvert;
import pockyProject.server.domain.ResponseUserDto;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "listable")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "user_id")
    @Nullable
    private String userId;

    @Column(name = "menuname")
    private String menuName;

    @Column(name = "nickname")
    @Nullable
    private String nickname;

    @Column(name = "price")
    private String price;

    @Column(name = "menuimage")
    private int menuImage;

    @Column(name = "topping")
    @Convert(converter = StringListConvert.class)
    private List<String> topping;

    @Column(name = "bread")
    @Nullable
    private String bread;

    @Column(name = "sauce")
    @Convert(converter = StringListConvert.class)
    private List<String> sauce;

    @Column(name = "side")
    private String side;

    @Column(name = "liquid")
    private Boolean liquid;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public static UserEntity FromToEntity(ResponseUserDto userDto) {
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
        return userEntity;
    }
//
//    public UserEntity FromToEntity(ResponseUserDto user) {
//        UserEntity userEntity = new UserEntity();
//        userEntity.setUserId(user.getUserId());
//        userEntity.setMenuName(user.getMenuName());
//        userEntity.setNickname(user.getNickname());
//        userEntity.setPrice(user.getPrice());
//        userEntity.setMenuImage(user.getMenuImage());
//        userEntity.setTopping(user.getTopping());
//        userEntity.setSauce(user.getSauce());
//        userEntity.setSide(user.getSide());
//        userEntity.setLiquid(user.getLiquid());
////        return new UserEntity(
////               user.getUserId(),
////           user.getMenuName(),
////               user.getNickname(),
////            user.getPrice(),
////               user.getMenuImage(),
////               user.getTopping(),
////             user.getBread(),
////         user.getSauce(),
////           user.getSide(),
////         user.getLiquid()
////        );
//        return  userEntity;
//    }
}
