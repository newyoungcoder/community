package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

@Data
public class CommentDTO {
    private Integer id;
    private Integer parentId;
    private Integer type;
    private String content;
    private Integer commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private User user;
}
