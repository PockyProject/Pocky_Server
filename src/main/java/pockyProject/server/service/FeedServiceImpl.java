package pockyProject.server.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pockyProject.server.dao.FeedDAO;
import pockyProject.server.domain.req.RequestFeedDTO;
import pockyProject.server.domain.req.UpdateFeedDTO;
import pockyProject.server.domain.res.ResponseFeedSaveDTO;
import pockyProject.server.entity.feedEntity.FeedEntity;

import static pockyProject.server.entity.feedEntity.FeedEntity.FeedToEntity;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class FeedServiceImpl implements FeedService {

    private  final FeedDAO  feedDAO;



    @Override
    public void FeedSave(ResponseFeedSaveDTO responseFeedSaveDTO) {

        FeedEntity feedEntity =new FeedEntity();
        feedEntity=FeedToEntity(responseFeedSaveDTO);
        feedDAO.insertFeed(feedEntity);
    }

    @Override
    public List<RequestFeedDTO> GetFeed(String userId) {

    //  log.info(feedDAO.getFeedAll(userId).toString());

      return  feedDAO.getFeedAll(userId);

    }

    @Override
    public UpdateFeedDTO UpdateFeed(String userUid, UpdateFeedDTO updateFeedDTO) {
        FeedEntity DTO=new FeedEntity();
        FeedEntity updateFeed = DTO.UpdateFeed(updateFeedDTO);
        feedDAO.insertFeed(updateFeed);
        return  updateFeedDTO;
    }

    @Override
    public void DeleteFeed(String userUid) {
        feedDAO.deleteFeed(userUid);


    }
}
