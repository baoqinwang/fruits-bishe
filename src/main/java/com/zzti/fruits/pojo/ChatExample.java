package com.zzti.fruits.pojo;

import java.util.ArrayList;
import java.util.List;

public class ChatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChatExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNull() {
            addCriterion("memberid is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(String value) {
            addCriterion("memberid =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(String value) {
            addCriterion("memberid <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(String value) {
            addCriterion("memberid >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(String value) {
            addCriterion("memberid >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(String value) {
            addCriterion("memberid <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(String value) {
            addCriterion("memberid <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLike(String value) {
            addCriterion("memberid like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotLike(String value) {
            addCriterion("memberid not like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<String> values) {
            addCriterion("memberid in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<String> values) {
            addCriterion("memberid not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(String value1, String value2) {
            addCriterion("memberid between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(String value1, String value2) {
            addCriterion("memberid not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andHfcontentIsNull() {
            addCriterion("hfcontent is null");
            return (Criteria) this;
        }

        public Criteria andHfcontentIsNotNull() {
            addCriterion("hfcontent is not null");
            return (Criteria) this;
        }

        public Criteria andHfcontentEqualTo(String value) {
            addCriterion("hfcontent =", value, "hfcontent");
            return (Criteria) this;
        }

        public Criteria andHfcontentNotEqualTo(String value) {
            addCriterion("hfcontent <>", value, "hfcontent");
            return (Criteria) this;
        }

        public Criteria andHfcontentGreaterThan(String value) {
            addCriterion("hfcontent >", value, "hfcontent");
            return (Criteria) this;
        }

        public Criteria andHfcontentGreaterThanOrEqualTo(String value) {
            addCriterion("hfcontent >=", value, "hfcontent");
            return (Criteria) this;
        }

        public Criteria andHfcontentLessThan(String value) {
            addCriterion("hfcontent <", value, "hfcontent");
            return (Criteria) this;
        }

        public Criteria andHfcontentLessThanOrEqualTo(String value) {
            addCriterion("hfcontent <=", value, "hfcontent");
            return (Criteria) this;
        }

        public Criteria andHfcontentLike(String value) {
            addCriterion("hfcontent like", value, "hfcontent");
            return (Criteria) this;
        }

        public Criteria andHfcontentNotLike(String value) {
            addCriterion("hfcontent not like", value, "hfcontent");
            return (Criteria) this;
        }

        public Criteria andHfcontentIn(List<String> values) {
            addCriterion("hfcontent in", values, "hfcontent");
            return (Criteria) this;
        }

        public Criteria andHfcontentNotIn(List<String> values) {
            addCriterion("hfcontent not in", values, "hfcontent");
            return (Criteria) this;
        }

        public Criteria andHfcontentBetween(String value1, String value2) {
            addCriterion("hfcontent between", value1, value2, "hfcontent");
            return (Criteria) this;
        }

        public Criteria andHfcontentNotBetween(String value1, String value2) {
            addCriterion("hfcontent not between", value1, value2, "hfcontent");
            return (Criteria) this;
        }

        public Criteria andSavetimeIsNull() {
            addCriterion("savetime is null");
            return (Criteria) this;
        }

        public Criteria andSavetimeIsNotNull() {
            addCriterion("savetime is not null");
            return (Criteria) this;
        }

        public Criteria andSavetimeEqualTo(String value) {
            addCriterion("savetime =", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotEqualTo(String value) {
            addCriterion("savetime <>", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeGreaterThan(String value) {
            addCriterion("savetime >", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeGreaterThanOrEqualTo(String value) {
            addCriterion("savetime >=", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLessThan(String value) {
            addCriterion("savetime <", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLessThanOrEqualTo(String value) {
            addCriterion("savetime <=", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLike(String value) {
            addCriterion("savetime like", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotLike(String value) {
            addCriterion("savetime not like", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeIn(List<String> values) {
            addCriterion("savetime in", values, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotIn(List<String> values) {
            addCriterion("savetime not in", values, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeBetween(String value1, String value2) {
            addCriterion("savetime between", value1, value2, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotBetween(String value1, String value2) {
            addCriterion("savetime not between", value1, value2, "savetime");
            return (Criteria) this;
        }

        public Criteria andHfsavetimeIsNull() {
            addCriterion("hfsavetime is null");
            return (Criteria) this;
        }

        public Criteria andHfsavetimeIsNotNull() {
            addCriterion("hfsavetime is not null");
            return (Criteria) this;
        }

        public Criteria andHfsavetimeEqualTo(String value) {
            addCriterion("hfsavetime =", value, "hfsavetime");
            return (Criteria) this;
        }

        public Criteria andHfsavetimeNotEqualTo(String value) {
            addCriterion("hfsavetime <>", value, "hfsavetime");
            return (Criteria) this;
        }

        public Criteria andHfsavetimeGreaterThan(String value) {
            addCriterion("hfsavetime >", value, "hfsavetime");
            return (Criteria) this;
        }

        public Criteria andHfsavetimeGreaterThanOrEqualTo(String value) {
            addCriterion("hfsavetime >=", value, "hfsavetime");
            return (Criteria) this;
        }

        public Criteria andHfsavetimeLessThan(String value) {
            addCriterion("hfsavetime <", value, "hfsavetime");
            return (Criteria) this;
        }

        public Criteria andHfsavetimeLessThanOrEqualTo(String value) {
            addCriterion("hfsavetime <=", value, "hfsavetime");
            return (Criteria) this;
        }

        public Criteria andHfsavetimeLike(String value) {
            addCriterion("hfsavetime like", value, "hfsavetime");
            return (Criteria) this;
        }

        public Criteria andHfsavetimeNotLike(String value) {
            addCriterion("hfsavetime not like", value, "hfsavetime");
            return (Criteria) this;
        }

        public Criteria andHfsavetimeIn(List<String> values) {
            addCriterion("hfsavetime in", values, "hfsavetime");
            return (Criteria) this;
        }

        public Criteria andHfsavetimeNotIn(List<String> values) {
            addCriterion("hfsavetime not in", values, "hfsavetime");
            return (Criteria) this;
        }

        public Criteria andHfsavetimeBetween(String value1, String value2) {
            addCriterion("hfsavetime between", value1, value2, "hfsavetime");
            return (Criteria) this;
        }

        public Criteria andHfsavetimeNotBetween(String value1, String value2) {
            addCriterion("hfsavetime not between", value1, value2, "hfsavetime");
            return (Criteria) this;
        }

        public Criteria andHfstateIsNull() {
            addCriterion("hfstate is null");
            return (Criteria) this;
        }

        public Criteria andHfstateIsNotNull() {
            addCriterion("hfstate is not null");
            return (Criteria) this;
        }

        public Criteria andHfstateEqualTo(String value) {
            addCriterion("hfstate =", value, "hfstate");
            return (Criteria) this;
        }

        public Criteria andHfstateNotEqualTo(String value) {
            addCriterion("hfstate <>", value, "hfstate");
            return (Criteria) this;
        }

        public Criteria andHfstateGreaterThan(String value) {
            addCriterion("hfstate >", value, "hfstate");
            return (Criteria) this;
        }

        public Criteria andHfstateGreaterThanOrEqualTo(String value) {
            addCriterion("hfstate >=", value, "hfstate");
            return (Criteria) this;
        }

        public Criteria andHfstateLessThan(String value) {
            addCriterion("hfstate <", value, "hfstate");
            return (Criteria) this;
        }

        public Criteria andHfstateLessThanOrEqualTo(String value) {
            addCriterion("hfstate <=", value, "hfstate");
            return (Criteria) this;
        }

        public Criteria andHfstateLike(String value) {
            addCriterion("hfstate like", value, "hfstate");
            return (Criteria) this;
        }

        public Criteria andHfstateNotLike(String value) {
            addCriterion("hfstate not like", value, "hfstate");
            return (Criteria) this;
        }

        public Criteria andHfstateIn(List<String> values) {
            addCriterion("hfstate in", values, "hfstate");
            return (Criteria) this;
        }

        public Criteria andHfstateNotIn(List<String> values) {
            addCriterion("hfstate not in", values, "hfstate");
            return (Criteria) this;
        }

        public Criteria andHfstateBetween(String value1, String value2) {
            addCriterion("hfstate between", value1, value2, "hfstate");
            return (Criteria) this;
        }

        public Criteria andHfstateNotBetween(String value1, String value2) {
            addCriterion("hfstate not between", value1, value2, "hfstate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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