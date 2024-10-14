package pockyProject.server.domain.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pockyProject.server.entity.UserEntity;
import pockyProject.server.entity.UserMenuEntity;
import pockyProject.server.entity.feedEntity.FeedEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseFeedSaveDTO {


    private  String feedUid;

    private  String userUid;

    private  String title;

    private  String content;

    private  int  qrImage;

    private  int likeCount;

    private LocalDateTime writeDate;

    private LocalDateTime updateDate;

    private LocalDateTime deleteDate;

//    public ResponseFeedSaveDTO FromFeedToEntity(FeedEntity feed) {
//
//        return  new ResponseFeedSaveDTO(
//                feed.getUser(),
//                feed.getFeedUid(),
//                feed.getTitle(),
//                feed.getContent(),
//                feed.getQrImage(),
//                feed.getLikeCount(),
//                feed.getCreatedAt(),
//                feed.getUpdatedAt(),
//                feed.getDeletedAt());
//
//    }

}
