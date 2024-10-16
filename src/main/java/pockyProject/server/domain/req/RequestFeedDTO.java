package pockyProject.server.domain.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pockyProject.server.entity.feedEntity.FeedEntity;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestFeedDTO {

    private String userUid;

    private  String title;

    private  String content;

    private Integer qrImage;

    private  Integer  menuImage;

    private  Integer likeCount;



//    public RequestFeedDTO requestFeedDTO(FeedEntity feed) {
//     return new RequestFeedDTO(
//             feed.getUserUid(),
//             feed.getTitle(),
//             feed.getContent(),
//             feed.getQrImage(),
//             feed.getLikeCount());
//
//
//    }

}
