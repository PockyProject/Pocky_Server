package pockyProject.server.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pockyProject.server.domain.req.RequestMenuDto;
import pockyProject.server.domain.res.ResponseLikedMenuDTO;
import pockyProject.server.domain.res.ResponseUserDto;
import pockyProject.server.domain.res.UserJoinDTO;
import pockyProject.server.entity.RecommendEntity;
import pockyProject.server.service.UserService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@Slf4j
@RequiredArgsConstructor
public class UserController {


    private  final UserService userService;

    @GetMapping("/favor/getfavor")
    public List<RequestMenuDto> getRecommendMenu(){
        List<RecommendEntity> user=userService.getRecommendList();
        List<RequestMenuDto> result= user.stream()
                .map(o->new RequestMenuDto(o))
                .collect(Collectors.toList());
        return result;
        
    }
    @PostMapping("/user/login")
    public void userJoin(@RequestBody UserJoinDTO userDTO){
             userService.joinUser(userDTO);
    }



    @PostMapping("/users/userpost")
    public ResponseEntity<ResponseUserDto> saveUser(@RequestBody ResponseUserDto userDto){

        ResponseUserDto user=userService.saveUser(userDto);
        return  ResponseEntity.status(HttpStatus.OK).body(user);

    }

    @PostMapping("/users/liked")
    public ResponseEntity<ResponseLikedMenuDTO> saveLikedMenu(@RequestBody ResponseLikedMenuDTO LikedMenuDto){

        ResponseLikedMenuDTO LikedUser=userService.saveLikedMenu(LikedMenuDto);
        log.info(LikedUser.getUserId());
        log.info(LikedUser.getNickname());
        return  ResponseEntity.status(HttpStatus.OK).body(LikedUser);
    }

}
