package pockyProject.server.controller;

import lombok.RequiredArgsConstructor;


import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pockyProject.server.domain.req.RequestFeedDTO;
import pockyProject.server.domain.req.UpdateFeedDTO;
import pockyProject.server.domain.res.ResponseFeedSaveDTO;
import pockyProject.server.entity.feedEntity.FeedEntity;
import pockyProject.server.service.FeedService;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserFeedController {

    private final FeedService feedService;

    @PostMapping("/save/feed")
    public void feedSave(@RequestBody ResponseFeedSaveDTO responseFeedSaveDTO) {

            feedService.FeedSave(responseFeedSaveDTO);
    }

    @GetMapping("/get/feed/{userid}")
    public ResponseEntity<List<RequestFeedDTO>>getFeed(@PathVariable("userid") String userid) {

        List<RequestFeedDTO> feed=feedService.GetFeed(userid);

        return  ResponseEntity.status(HttpStatus.OK).body(feed);
    }

    @PutMapping("update/feed/{feedid}")
    public ResponseEntity<UpdateFeedDTO> updateFeed(@PathVariable("feedid")String feedid
            , @RequestBody UpdateFeedDTO updateFeedDTO) {

        UpdateFeedDTO updateFeed=feedService.UpdateFeed(feedid, updateFeedDTO);

        return  ResponseEntity.status(HttpStatus.OK).body(updateFeed);

    }
    @DeleteMapping("delete/feed/{feedid}")
    public void feedDelete(@PathVariable("feedid")String feedid) {
        feedService.DeleteFeed(feedid);

    }

}
