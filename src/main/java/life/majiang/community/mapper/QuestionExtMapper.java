package life.majiang.community.mapper;

import life.majiang.community.model.Question;

public interface QuestionExtMapper {

    int incView(Question question);
    int incCommentCount(Question question);
}