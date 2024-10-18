package pockyProject.server.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pockyProject.server.domain.res.ResponseCommentSaveDTO;
import pockyProject.server.service.CommentService;

@RestController
@RequiredArgsConstructor
public class FeedCommentController {

    private final CommentService commentService;

    @PostMapping("/save/comment/{feeduid}")
    public void saveComment(@PathVariable("feeduid") String feeduid, @RequestBody ResponseCommentSaveDTO res) {

        commentService.addComment(res);
    }

}
