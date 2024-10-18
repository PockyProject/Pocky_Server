package pockyProject.server.service;

import org.springframework.stereotype.Service;
import pockyProject.server.domain.res.ResponseCommentSaveDTO;
import pockyProject.server.repository.feedRepo.CommentRepository;



public interface CommentService {



    void addComment(ResponseCommentSaveDTO comment);



}
