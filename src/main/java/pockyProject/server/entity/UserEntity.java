package pockyProject.server.entity;

import ch.qos.logback.core.testUtil.StringListAppender;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import pockyProject.server.controller.converter.StringListConvert;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "listable")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "user_id" )
    @Nullable
    private  String userId;
    @Column(name = "menuname" )
    private String menuName;

    @Column(name = "nickname")
    @Nullable
    private  String nickname;

    @Column(name = "price")
    private String price;

    @Column(name = "menuimage")
    private int menuImage;

    @Column(name = "topping")
    @Convert(converter = StringListConvert.class)
    private List<String> topping;

    @Column(name = "bread")
    @Nullable
    private  String bread;

    @Column(name = "sauce")
    @Convert(converter = StringListConvert.class)
    private  List<String> sauce;

    @Column(name = "side")
    private  String side;

    @Column(name = "liquid")
    private  String  liquid;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public UserEntity() {

    }
}
