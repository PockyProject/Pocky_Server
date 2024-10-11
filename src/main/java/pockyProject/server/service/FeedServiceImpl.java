package pockyProject.server.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pockyProject.server.dao.FeedDAO;
import pockyProject.server.dao.UserDAO;
import pockyProject.server.domain.res.ResponseFeedSaveDTO;
import pockyProject.server.entity.feedEntity.FeedEntity;
import pockyProject.server.repository.UserRepository;
import pockyProject.server.repository.feedRepo.FeedRepository;

import static pockyProject.server.entity.feedEntity.FeedEntity.FeedToEntity;

@Service
@RequiredArgsConstructor
public class FeedServiceImpl implements FeedService {

    private  final FeedDAO  feedDAO;



    @Override
    public void FeedSave(ResponseFeedSaveDTO responseFeedSaveDTO) {

        FeedEntity feedEntity =new FeedEntity();
        feedEntity=FeedToEntity(responseFeedSaveDTO);
        feedDAO.insertFeed(feedEntity);
    }
}
