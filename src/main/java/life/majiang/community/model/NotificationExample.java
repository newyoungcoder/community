package life.majiang.community.model;

import java.util.ArrayList;
import java.util.List;

public class NotificationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    public NotificationExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNotifierIsNull() {
            addCriterion("NOTIFIER is null");
            return (Criteria) this;
        }

        public Criteria andNotifierIsNotNull() {
            addCriterion("NOTIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andNotifierEqualTo(Integer value) {
            addCriterion("NOTIFIER =", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierNotEqualTo(Integer value) {
            addCriterion("NOTIFIER <>", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierGreaterThan(Integer value) {
            addCriterion("NOTIFIER >", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierGreaterThanOrEqualTo(Integer value) {
            addCriterion("NOTIFIER >=", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierLessThan(Integer value) {
            addCriterion("NOTIFIER <", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierLessThanOrEqualTo(Integer value) {
            addCriterion("NOTIFIER <=", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierIn(List<Integer> values) {
            addCriterion("NOTIFIER in", values, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierNotIn(List<Integer> values) {
            addCriterion("NOTIFIER not in", values, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierBetween(Integer value1, Integer value2) {
            addCriterion("NOTIFIER between", value1, value2, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierNotBetween(Integer value1, Integer value2) {
            addCriterion("NOTIFIER not between", value1, value2, "notifier");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("RECEIVER is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("RECEIVER is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(Integer value) {
            addCriterion("RECEIVER =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(Integer value) {
            addCriterion("RECEIVER <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(Integer value) {
            addCriterion("RECEIVER >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECEIVER >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(Integer value) {
            addCriterion("RECEIVER <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(Integer value) {
            addCriterion("RECEIVER <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<Integer> values) {
            addCriterion("RECEIVER in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<Integer> values) {
            addCriterion("RECEIVER not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(Integer value1, Integer value2) {
            addCriterion("RECEIVER between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(Integer value1, Integer value2) {
            addCriterion("RECEIVER not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andOuterIdIsNull() {
            addCriterion("OUTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOuterIdIsNotNull() {
            addCriterion("OUTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOuterIdEqualTo(Integer value) {
            addCriterion("OUTER_ID =", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotEqualTo(Integer value) {
            addCriterion("OUTER_ID <>", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdGreaterThan(Integer value) {
            addCriterion("OUTER_ID >", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUTER_ID >=", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLessThan(Integer value) {
            addCriterion("OUTER_ID <", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLessThanOrEqualTo(Integer value) {
            addCriterion("OUTER_ID <=", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdIn(List<Integer> values) {
            addCriterion("OUTER_ID in", values, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotIn(List<Integer> values) {
            addCriterion("OUTER_ID not in", values, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdBetween(Integer value1, Integer value2) {
            addCriterion("OUTER_ID between", value1, value2, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OUTER_ID not between", value1, value2, "outerId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("GMT_CREATE is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("GMT_CREATE is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Long value) {
            addCriterion("GMT_CREATE =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Long value) {
            addCriterion("GMT_CREATE <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Long value) {
            addCriterion("GMT_CREATE >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Long value) {
            addCriterion("GMT_CREATE >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Long value) {
            addCriterion("GMT_CREATE <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Long value) {
            addCriterion("GMT_CREATE <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Long> values) {
            addCriterion("GMT_CREATE in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Long> values) {
            addCriterion("GMT_CREATE not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Long value1, Long value2) {
            addCriterion("GMT_CREATE between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Long value1, Long value2) {
            addCriterion("GMT_CREATE not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNotifierNameIsNull() {
            addCriterion("NOTIFIER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNotifierNameIsNotNull() {
            addCriterion("NOTIFIER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNotifierNameEqualTo(String value) {
            addCriterion("NOTIFIER_NAME =", value, "notifierName");
            return (Criteria) this;
        }

        public Criteria andNotifierNameNotEqualTo(String value) {
            addCriterion("NOTIFIER_NAME <>", value, "notifierName");
            return (Criteria) this;
        }

        public Criteria andNotifierNameGreaterThan(String value) {
            addCriterion("NOTIFIER_NAME >", value, "notifierName");
            return (Criteria) this;
        }

        public Criteria andNotifierNameGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFIER_NAME >=", value, "notifierName");
            return (Criteria) this;
        }

        public Criteria andNotifierNameLessThan(String value) {
            addCriterion("NOTIFIER_NAME <", value, "notifierName");
            return (Criteria) this;
        }

        public Criteria andNotifierNameLessThanOrEqualTo(String value) {
            addCriterion("NOTIFIER_NAME <=", value, "notifierName");
            return (Criteria) this;
        }

        public Criteria andNotifierNameLike(String value) {
            addCriterion("NOTIFIER_NAME like", value, "notifierName");
            return (Criteria) this;
        }

        public Criteria andNotifierNameNotLike(String value) {
            addCriterion("NOTIFIER_NAME not like", value, "notifierName");
            return (Criteria) this;
        }

        public Criteria andNotifierNameIn(List<String> values) {
            addCriterion("NOTIFIER_NAME in", values, "notifierName");
            return (Criteria) this;
        }

        public Criteria andNotifierNameNotIn(List<String> values) {
            addCriterion("NOTIFIER_NAME not in", values, "notifierName");
            return (Criteria) this;
        }

        public Criteria andNotifierNameBetween(String value1, String value2) {
            addCriterion("NOTIFIER_NAME between", value1, value2, "notifierName");
            return (Criteria) this;
        }

        public Criteria andNotifierNameNotBetween(String value1, String value2) {
            addCriterion("NOTIFIER_NAME not between", value1, value2, "notifierName");
            return (Criteria) this;
        }

        public Criteria andOuterTitleIsNull() {
            addCriterion("OUTER_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andOuterTitleIsNotNull() {
            addCriterion("OUTER_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andOuterTitleEqualTo(String value) {
            addCriterion("OUTER_TITLE =", value, "outerTitle");
            return (Criteria) this;
        }

        public Criteria andOuterTitleNotEqualTo(String value) {
            addCriterion("OUTER_TITLE <>", value, "outerTitle");
            return (Criteria) this;
        }

        public Criteria andOuterTitleGreaterThan(String value) {
            addCriterion("OUTER_TITLE >", value, "outerTitle");
            return (Criteria) this;
        }

        public Criteria andOuterTitleGreaterThanOrEqualTo(String value) {
            addCriterion("OUTER_TITLE >=", value, "outerTitle");
            return (Criteria) this;
        }

        public Criteria andOuterTitleLessThan(String value) {
            addCriterion("OUTER_TITLE <", value, "outerTitle");
            return (Criteria) this;
        }

        public Criteria andOuterTitleLessThanOrEqualTo(String value) {
            addCriterion("OUTER_TITLE <=", value, "outerTitle");
            return (Criteria) this;
        }

        public Criteria andOuterTitleLike(String value) {
            addCriterion("OUTER_TITLE like", value, "outerTitle");
            return (Criteria) this;
        }

        public Criteria andOuterTitleNotLike(String value) {
            addCriterion("OUTER_TITLE not like", value, "outerTitle");
            return (Criteria) this;
        }

        public Criteria andOuterTitleIn(List<String> values) {
            addCriterion("OUTER_TITLE in", values, "outerTitle");
            return (Criteria) this;
        }

        public Criteria andOuterTitleNotIn(List<String> values) {
            addCriterion("OUTER_TITLE not in", values, "outerTitle");
            return (Criteria) this;
        }

        public Criteria andOuterTitleBetween(String value1, String value2) {
            addCriterion("OUTER_TITLE between", value1, value2, "outerTitle");
            return (Criteria) this;
        }

        public Criteria andOuterTitleNotBetween(String value1, String value2) {
            addCriterion("OUTER_TITLE not between", value1, value2, "outerTitle");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table NOTIFICATION
     *
     * @mbg.generated do_not_delete_during_merge Sun Aug 01 19:43:10 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Aug 01 19:43:10 CST 2021
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}