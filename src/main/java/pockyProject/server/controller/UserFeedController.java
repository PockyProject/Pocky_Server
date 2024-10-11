package pockyProject.server.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pockyProject.server.domain.res.ResponseFeedSaveDTO;
import pockyProject.server.service.FeedService;

@RestController
@RequiredArgsConstructor
public class UserFeedController {

    private final FeedService feedService;

    @PostMapping("/save/feed")
    public void feedSave(@RequestBody ResponseFeedSaveDTO responseFeedSaveDTO) {

            feedService.FeedSave(responseFeedSaveDTO);
    }
}
