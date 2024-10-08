package pockyProject.server.domain.res;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserJoinDTO {


    private  String userUid;

    private String nickname;


    private String userImage;

    private  int age;
}
