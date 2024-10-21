package pockyProject.server.service;

import org.springframework.stereotype.Service;
import pockyProject.server.domain.req.RequestCommentDTO;
import pockyProject.server.domain.res.ResponseCommentSaveDTO;
import pockyProject.server.entity.feedEntity.CommentEntity;
import pockyProject.server.repository.feedRepo.CommentRepository;
import java.util.List;



public interface CommentService {



    void addComment(ResponseCommentSaveDTO comment);


    List<RequestCommentDTO> getCommentAll(String feedUid);
}
