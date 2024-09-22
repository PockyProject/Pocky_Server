package pockyProject.server.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pockyProject.server.domain.RequestMenuDto;
import pockyProject.server.domain.ResponseUserDto;
import pockyProject.server.entity.UserEntity;
import pockyProject.server.service.UserService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@Slf4j
@RequiredArgsConstructor
public class UserController {


    private  final UserService userService;

    @GetMapping("/favor/getfavor")
    public List<RequestMenuDto> getUserId(){
        List<UserEntity> user=userService.getAll();
        List<RequestMenuDto> result= user.stream()
                .map(o->new RequestMenuDto(o))
                .collect(Collectors.toList());

        return result;
    }

    @PostMapping("/users/userpost")
    public ResponseEntity<ResponseUserDto> saveUser(@RequestBody ResponseUserDto userDto){

        ResponseUserDto user=userService.saveUser(userDto);
        log.info(user.getUserId());
        log.info(user.getNickname());
        log.info(user.getSauce().toString());
        return  ResponseEntity.status(HttpStatus.OK).body(user);

    }

}
