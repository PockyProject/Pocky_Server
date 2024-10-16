package pockyProject.server.domain.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pockyProject.server.entity.feedEntity.FeedEntity;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateFeedDTO {

    private  String feedUid;

    private   String title;

    private   String content;

    private  Integer  qrImage;

    private   int     LikeCount;

    private  Integer  menuImage;

    private LocalDateTime updateDate;


    public UpdateFeedDTO(String feedUid, String title,String content, int qrImage, int likeCount,int menuImage) {
        this.feedUid = feedUid;
        this.title = title;
        this.qrImage = qrImage;
        this.LikeCount = likeCount;
        this.content = content;
        this.menuImage = menuImage;
    }


    public  UpdateFeedDTO UpdateDTOFeed(FeedEntity feed) {
        return new UpdateFeedDTO (
                this.feedUid = feed.getFeedUid(),
                this.content = feed.getContent(),
                this.title = feed.getTitle(),
                this.LikeCount = feed.getLikeCount(),
                this.qrImage = feed.getQrImage(),
                this.menuImage=feed.getMenuImage());


    }
}
