package pockyProject.server.dao;

import pockyProject.server.domain.req.RequestFeedDTO;
import pockyProject.server.entity.feedEntity.FeedEntity;
import java.util.List;

public interface FeedDAO {


    FeedEntity insertFeed(FeedEntity feedEntity);

    List<FeedEntity> getFeed(RequestFeedDTO requestFeedDTO);


    FeedEntity getUserId(String userId);


    List<RequestFeedDTO> getFeedAll(String userId);
}
