package pockyProject.server.entity.feedEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pockyProject.server.domain.res.ResponseFeedSaveDTO;

import java.time.LocalDateTime;
@Entity
@Getter
@Builder
@Table(name = "feed")
@AllArgsConstructor
@NoArgsConstructor
public class FeedEntity {

    @Id
    @Column(name = "feeduid")
    private String feedUid;

    @Column(name = "useruid")
    private String userUid;

    private String title;

    private String content;
    @Column(name = "qrimage",nullable = false)
    private int qrImage;

    @Column(name = "likecount")
    private int likeCount;

    @Column(name = "createdat")
    private LocalDateTime createdAt;
    @Column(name = "updatedat")
    private LocalDateTime updatedAt;


    @Column(name = "deletedat")
    private LocalDateTime deletedAt;


    public static FeedEntity FeedToEntity(ResponseFeedSaveDTO feed) {
        return FeedEntity.builder()
                .feedUid(feed.getFeedUid())
                .userUid(feed.getUserUid())
                .title(feed.getTitle())
                .content(feed.getContent())
                .qrImage(feed.getQrImage())
                .likeCount(feed.getLikeCount())
                .createdAt(feed.getWriteDate())
                .updatedAt(feed.getUpdateDate())
                .deletedAt(feed.getDeleteDate())
                .build();
    }
}
