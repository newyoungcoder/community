package life.majiang.community.dto;

import lombok.Data;

@Data
public class NotificationDTO {
    private Integer id;
    private Long gmtCreate;
    private Integer status;
    private Integer notifier;
    private String notifierName;
    private String outerTitle;
    private Integer outerId;
    //NotificationTypeEnum 中的 name
    private String typeName;
    private Integer type;
}
