package pockyProject.server.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pockyProject.server.entity.feedEntity.FeedEntity;
import pockyProject.server.repository.feedRepo.FeedRepository;


@Component
@RequiredArgsConstructor
public class FeedDaoImpl implements  FeedDAO{
    private final FeedRepository feedRepository;

    @Override
    public FeedEntity insertFeed(FeedEntity feedEntity) {
      return   feedRepository.save(feedEntity);
    }
}
