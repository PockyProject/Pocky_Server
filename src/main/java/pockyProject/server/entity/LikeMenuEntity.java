package pockyProject.server.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import pockyProject.server.controller.converter.StringListConvert;

import java.util.List;

@Entity
@Table(name = "likemenu")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LikeMenuEntity {

    @Id @GeneratedValue
    private Long id;

    private  int age;

    @Column(name = "user_id")
    @Nullable
    private String userId;

    @Column(name = "menuname")
    private String menuName;

    @Column(name = "nickname")
    @Nullable
    private String nickname;

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


}
